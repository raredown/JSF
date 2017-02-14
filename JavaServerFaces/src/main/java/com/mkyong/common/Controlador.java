/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.common;

import java.io.Serializable;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Daw2
 */
@Named
@RequestScoped
public class Controlador implements Serializable {

    @Inject
    private Modelo inyectado;

    public Modelo getInyectado() {
        return inyectado;
    }

    public void setInyectado(Modelo inyectado) {
        this.inyectado = inyectado;
    }

}
