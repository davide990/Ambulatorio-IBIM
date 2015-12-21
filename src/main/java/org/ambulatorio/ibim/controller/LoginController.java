/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ambulatorio.ibim.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import javax.inject.Named;
import org.ambulatorio.ibim.models.Operatore;

/**
 *
 * @author Davide Guastella <davide.guastella90@gmail.com>
 */
@Named("loginController")
@SessionScoped
public class LoginController implements Serializable
{

    //@Inject
    //UtenteDAO dao;

    private Operatore operatoreLoggato;

    public LoginController()
    {
        operatoreLoggato = null;
    }

    public Operatore getUtenteLoggato()
    {
        return operatoreLoggato;
    }

    public void setUtenteLoggato(Operatore utenteLoggato)
    {
        this.operatoreLoggato = utenteLoggato;
    }

    public String login(CredenzialiOperatore credenziali)
    {
        //Operatore utente = dao.check(credenziali.getUsername(), credenziali.getPassword());
       /* if (utente != null)
        {
            this.operatoreLoggato = utente;
            return "persona_main";
        } else
        {
            //MessagesView.ShowMessage(FacesMessage.SEVERITY_ERROR, "Error!", "User " + credenziali.getUsername() + " is not registered.");
            return null;
        }*/
        return null;
    }

    public void logout()
    {
        operatoreLoggato = null;
    }

    public boolean isLogged()
    {
        return operatoreLoggato != null;
    }
}
