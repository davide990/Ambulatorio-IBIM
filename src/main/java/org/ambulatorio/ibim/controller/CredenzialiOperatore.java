package org.ambulatorio.ibim.controller;

import java.io.Serializable;
import javax.validation.constraints.Size;


public class CredenzialiOperatore implements Serializable
{
     @Size(min = 5)
    private String username;

    @Size(min = 5)
    private String password;

    
     public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}
