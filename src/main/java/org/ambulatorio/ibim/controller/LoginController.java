package org.ambulatorio.ibim.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.ambulatorio.ibim.dao.OperatoreDAO;
import org.ambulatorio.ibim.models.Operatore;
import org.ambulatorio.ibim.utils.MessagesView;

/**
 * The controller class responsible for doing basic login/logout activities for
 * operators, that is, medical personal and system administrator.
 *
 * @author Davide Guastella <davide.guastella90@gmail.com>
 */
@Named("loginController")
@SessionScoped
public class LoginController implements Serializable
{

    @Inject
    OperatoreDAO dao;

    /**
     * The logged operator
     */
    private Operatore operatoreLoggato;

    public LoginController()
    {
        operatoreLoggato = null;
    }

    /**
     * @return The currently logged operator in this session
     */
    public Operatore getUtenteLoggato()
    {
        return operatoreLoggato;
    }

    /**
     * Set the currently logged user for this session.
     *
     * @param utenteLoggato
     */
    public void setUtenteLoggato(Operatore utenteLoggato)
    {
        this.operatoreLoggato = utenteLoggato;
    }

    /**
     * Login an operator using the specified references.
     *
     * @param username the operator's username.
     * @param password the operator's password.
     * @return
     */
    public String login(String username, String password)
    {
        //Get the operator using the specified username/password
        Operatore utente = dao.getOperatoreBy(username, password);

        //if an operator has been found, set it as the logged user
        if (utente != null)
        {
            this.operatoreLoggato = utente;
            return "persona_main";
        } else
        {
            //Show an error message notifying the user about the failed login
            MessagesView.error("Error!", "User " + username + " is not registered.");
            return null;
        }
    }

    /**
     * Logout from the current session
     */
    public void logout()
    {
        operatoreLoggato = null;
    }

    /**
     * Check if an operator is logged
     *
     * @return
     */
    public boolean isLogged()
    {
        return operatoreLoggato != null;
    }
}
