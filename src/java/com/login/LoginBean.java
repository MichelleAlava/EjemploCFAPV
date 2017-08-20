/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author GabeManta11
 */
@ManagedBean(name="login")
@RequestScoped
public class LoginBean implements Serializable{
    
    private String username;
    private String password;
    
    @PostConstruct
    public void init(){
        username = "";
        password = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void access(){
        String dummy_user = "anthony";
        String dummy_pass = "123";
        FacesContext context = FacesContext.getCurrentInstance();
        //I use JDBC PostgreSQL driver for find the users in table "users"
        if (username.equals(dummy_user) && password.equals(dummy_pass)) {
            //Here you must put your code to redirect or do something 
            context.addMessage(null, new FacesMessage("Acceso Exitoso",  "You are logged in") );
        }
        else{
            context.addMessage(null, new FacesMessage("Acceso Denegado") );
            //Hola  esta es una nueva modificacion
        }
    }
}
