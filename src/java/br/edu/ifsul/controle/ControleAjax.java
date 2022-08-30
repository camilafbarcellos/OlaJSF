
package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author 20202pf.cc0003
 */
@Named(value = "controleAjax")
@ViewScoped
public class ControleAjax implements Serializable {
    
    private String entrada;
    private String saida;
    private Boolean exibir;
    
    public ControleAjax() {
        exibir = false;
    }
    
    // todos os métodos do Ajax são void
    
    public void mudarExibir() {
        exibir = !exibir;
    }
    
    public void processar() {
        saida = "Você digitou " + entrada;
        entrada = "";
    }
    
    public String irAjax() {
        return "ajax?faces-redirect=true";
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public Boolean getExibir() {
        return exibir;
    }

    public void setExibir(Boolean exibir) {
        this.exibir = exibir;
    }
}
