
package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author 20202pf.cc0003
 */
@Named(value = "controleFormulario")
@SessionScoped // ciclo de vida que irá manter a navegação entre as páginas
public class ControleFormulario implements Serializable {
    
    private String nome;
    private String funcao;
    private Boolean ativo;
    
    public ControleFormulario() {
        
    }
    
    public String irFormulario() {
        return "formulario?faces-redirect=true";
    }
    
    public String exibirDados() {
        return "dados?faces-redirect=true";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
