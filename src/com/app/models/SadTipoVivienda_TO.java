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
public class SadTipoVivienda_TO {

    private int stvCodigo;

    private String stvDescripion;

    //Constructores
    public SadTipoVivienda_TO() {
    }

    public SadTipoVivienda_TO(int stvCodigo, String stvDescripion) {
        this.stvCodigo = stvCodigo;
        this.stvDescripion = stvDescripion;
    }

    //Getters and Setters
    public int getStvCodigo() {
        return stvCodigo;
    }

    public void setStvCodigo(int stvCodigo) {
        this.stvCodigo = stvCodigo;
    }

    public String getStvDescripion() {
        return stvDescripion;
    }

    public void setStvDescripion(String stvDescripion) {
        this.stvDescripion = stvDescripion;
    }

    @Override
    public String toString() {
        return "SadTipoVivienda{" + "stvCodigo=" + stvCodigo + ", stvDescripion=" + stvDescripion + '}';
    }

}
