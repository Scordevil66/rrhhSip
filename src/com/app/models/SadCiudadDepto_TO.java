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
public class SadCiudadDepto_TO {

    private int cdsCodDepto;

    private int cdsCodCiudad;

    private String cdsCiudad;

    private String cdsDepto;

    //Constructores
    public SadCiudadDepto_TO(int cdsCodDepto, int cdsCodCiudad, String cdsCiudad, String cdsDepto) {
        this.cdsCodDepto = cdsCodDepto;
        this.cdsCodCiudad = cdsCodCiudad;
        this.cdsCiudad = cdsCiudad;
        this.cdsDepto = cdsDepto;
    }

    public SadCiudadDepto_TO() {
    }

    //Departamentos
    public SadCiudadDepto_TO(int cdsCodDepto, String cdsDepto) {
        this.cdsCodDepto = cdsCodDepto;
        this.cdsDepto = cdsDepto;
    }

    //Ciudad
    public SadCiudadDepto_TO(int cdsCodDepto, int cdsCodCiudad, String cdsCiudad) {
        this.cdsCodDepto = cdsCodDepto;
        this.cdsCodCiudad = cdsCodCiudad;
        this.cdsCiudad = cdsCiudad;
    }

    //Getter and Setters
    public int getCdsCodDepto() {
        return cdsCodDepto;
    }

    public void setCdsCodDepto(int cdsCodDepto) {
        this.cdsCodDepto = cdsCodDepto;
    }

    public int getCdsCodCiudad() {
        return cdsCodCiudad;
    }

    public void setCdsCodCiudad(int cdsCodCiudad) {
        this.cdsCodCiudad = cdsCodCiudad;
    }

    public String getCdsCiudad() {
        return cdsCiudad;
    }

    public void setCdsCiudad(String cdsCiudad) {
        this.cdsCiudad = cdsCiudad;
    }

    public String getCdsDepto() {
        return cdsDepto;
    }

    public void setCdsDepto(String cdsDepto) {
        this.cdsDepto = cdsDepto;
    }

    @Override
    public String toString() {
        return "SadCiudadDepto_TO{" + "cdsCodDepto=" + cdsCodDepto + ", cdsCodCiudad=" + cdsCodCiudad + ", cdsCiudad=" + cdsCiudad + ", cdsDepto=" + cdsDepto + '}';
    }

}
