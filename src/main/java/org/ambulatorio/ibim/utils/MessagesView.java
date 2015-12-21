package org.ambulatorio.ibim.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Davide Guastella <davide.guastella90@gmail.com>
 */
public class MessagesView
{

    public static void info(String summary, String details)
    {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, details));
    }

    public static void warn(String summary, String details)
    {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, details));
    }

    public static void error(String summary, String details)
    {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, details));
    }

    public static void fatal(String summary, String details)
    {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, details));
    }
}
