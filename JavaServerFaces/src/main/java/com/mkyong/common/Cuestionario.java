/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.common;

import java.io.Serializable;

/**
 *
 * @author Daw2
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class Cuestionario implements Serializable{
    private String nombre;
    private String correo;
    private String[] aficiones;
    private boolean quieroOpinar;
    private String fumador;
    private String sistema;
    private String[] comidas;
    private String estado;
    private String[] lenguajes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String[] getAficiones() {
        return aficiones;
    }

    public void setAficiones(String[] aficiones) {
        this.aficiones = aficiones;
    }

    public boolean isQuieroOpinar() {
        return quieroOpinar;
    }

    public void setQuieroOpinar(boolean quieroOpinar) {
        this.quieroOpinar = quieroOpinar;
    }

    public String getFumador() {
        return fumador;
    }

    public void setFumador(String fumador) {
        this.fumador = fumador;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String[] getComidas() {
        return comidas;
    }

    public void setComidas(String[] comidas) {
        this.comidas = comidas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
    
    
}
