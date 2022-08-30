package br.edu.ifsul.controle;

import java.io.Serializable;
import java.util.Calendar;
//import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
//import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author 20202pf.cc0003
 */
@Named(value = "controleIndex") // caso não apareça, adicionar a biblioteca Java EE Web 8 API Library
@RequestScoped // ciclo de vida mais curto - cria uma sessão a cada requisição
//@SessionScoped // mantém a mesma sessão em várias requisições - utilizada em carrinhos de compras online
//@ApplicationScoped // ciclo de vida mais longo - utiliza a mesma instância de sessão sempre após a requisição
public class ControleIndex implements Serializable {

    private String ola;
    private Calendar dataSO;

    public ControleIndex() {
        ola = "Seja bem vindo ao JSF!";
        dataSO = Calendar.getInstance();
        System.out.println("Criou o ControleIndex!");
        //mensagem("Criei uma mensagem no construtor!");
    }
    
    public void mensagem(String texto) {
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.getExternalContext().getFlash().setKeepMessages(true); // mantém as mensagem mesmo com a mudança de contexto
        FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, texto, "");
        contexto.addMessage(null, mensagem);
    }

    public String sobre() {
        mensagem("Executei o método sobre!");
        return "sobre?faces-redirect=true";
    }

    public String index() {
        mensagem("Executei o método index!");
        return "index?faces-redirect=true";
    }

    public String getOla() {
        return ola;
    }

    public void setOla(String ola) {
        this.ola = ola;
    }

    public Calendar getDataSO() {
        return dataSO;
    }

    public void setDataSO(Calendar dataSO) {
        this.dataSO = dataSO;
    }
}
