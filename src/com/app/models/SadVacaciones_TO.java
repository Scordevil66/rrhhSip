/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.models;

import java.sql.Date;

/**
 *
 * @author user
 */
public class SadVacaciones_TO {

    private String cedula;
    private int periodo;
    private Date fechaIni;
    private Date fechaFin;
    private int tomado;

    //Constructores
    public SadVacaciones_TO() {
    }

    public SadVacaciones_TO(String cedula, int periodo, Date fechaIni, Date fechaFin, int tomado) {
        this.cedula = cedula;
        this.periodo = periodo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.tomado = tomado;
    }

    //Getter and Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getTomado() {
        return tomado;
    }

    public void setTomado(int tomado) {
        this.tomado = tomado;
    }

    @Override
    public String toString() {
        return "SadVacaciones_TO{" + "cedula=" + cedula + ", periodo=" + periodo + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", tomado=" + tomado + '}';
    }

}
