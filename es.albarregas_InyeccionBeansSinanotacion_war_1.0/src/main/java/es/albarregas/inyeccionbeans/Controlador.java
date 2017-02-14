/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.inyeccionbeans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
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

    public String operar() {
        switch (this.inyectado.getOperacion()) {
            case "summar":
                this.inyectado.setResultado(Negocio.sumar(this.inyectado.getPrimero(), this.inyectado.getSegundo()));
                break;
            case "restar":
                this.inyectado.setResultado(Negocio.restar(this.inyectado.getPrimero(), this.inyectado.getSegundo()));
                break;
            case "multiplicar":
                this.inyectado.setResultado(Negocio.multiplicar(this.inyectado.getPrimero(), this.inyectado.getSegundo()));
                break;
            case "dividir":
                this.inyectado.setResultado(Negocio.division(this.inyectado.getPrimero(), this.inyectado.getSegundo()));
                break;

        }
        return "index";
    }
}
