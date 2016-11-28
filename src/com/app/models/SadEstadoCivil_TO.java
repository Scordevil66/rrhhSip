/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.models;

/**
 *
 * @author user
 */
public class SadEstadoCivil_TO {

    private int secCodigo;
    private String secDescripcion;

    //Constructores
    public SadEstadoCivil_TO() {
    }

    public SadEstadoCivil_TO(int secCodigo, String secDescripcion) {
        this.secCodigo = secCodigo;
        this.secDescripcion = secDescripcion;
    }

    //Getters and Setters
    public int getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(int secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getSecDescripcion() {
        return secDescripcion;
    }

    public void setSecDescripcion(String secDescripcion) {
        this.secDescripcion = secDescripcion;
    }

    @Override
    public String toString() {
        return "SadEstadoCivil{" + "secCodigo=" + secCodigo + ", secDescripcion=" + secDescripcion + '}';
    }

}
