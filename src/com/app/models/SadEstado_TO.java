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
public class SadEstado_TO {

    private int estCodigo;

    private String estDescripcion;

    //Constructor
    public SadEstado_TO() {
    }

    public SadEstado_TO(int estCodigo, String estDescripcion) {
        this.estCodigo = estCodigo;
        this.estDescripcion = estDescripcion;
    }

    //Getters and Setters
    public int getEstCodigo() {
        return estCodigo;
    }

    public void setEstCodigo(int estCodigo) {
        this.estCodigo = estCodigo;
    }

    public String getEstDescripcion() {
        return estDescripcion;
    }

    public void setEstDescripcion(String estDescripcion) {
        this.estDescripcion = estDescripcion;
    }

    @Override
    public String toString() {
        return "SadEstado_TO{" + "estCodigo=" + estCodigo + ", estDescripcion=" + estDescripcion + '}';
    }

}
