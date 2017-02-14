/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.common;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.HashMap;

/**
 *
 * @author Daw2
 */
@ManagedBean
@SessionScoped
public class Usuario implements Serializable {

    private String username;
    private String password;

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

    public String comprobar() {
        if (this.password.equals("1234")&&this.username.equals("rafa")) {
            return "usuarioCorrecto";
            
        }
        return "usuarioIncorrecto";
    }
}
