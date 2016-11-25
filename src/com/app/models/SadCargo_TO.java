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
public class SadCargo_TO {

    private int carCodigo;

    private String carDescripcion;

    //Constructores
    public SadCargo_TO() {
    }

    public SadCargo_TO(int carCodigo, String carDescripcion) {
        this.carCodigo = carCodigo;
        this.carDescripcion = carDescripcion;
    }

    //Getters and Setters
    public int getCarCodigo() {
        return carCodigo;
    }

    public void setCarCodigo(int carCodigo) {
        this.carCodigo = carCodigo;
    }

    public String getCarDescripcion() {
        return carDescripcion;
    }

    public void setCarDescripcion(String carDescripcion) {
        this.carDescripcion = carDescripcion;
    }

    @Override
    public String toString() {
        return "SadCargo_TO{" + "carCodigo=" + carCodigo + ", carDescripcion=" + carDescripcion + '}';
    }

}
