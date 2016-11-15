/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.models;

import jxl.write.DateTime;

/**
 *
 * @author Gustavo
 */
public class SadRecursoHumano_TO {

    private long rhNumIden;

    private int rhCodDeptoIden;

    private int rhCodCiudadIden;

    private DateTime rhFchIngreso;

    private String rhNombres;

    private String rhApellido1;

    private String rhApellido2;

    private int rhCodSexo;

    private int rhCodEstCivil;

    private String rhDireccion;

    private String rhBarrio;

    private DateTime rhFchNacimiento;

    private int rhCodDeptoOrigen;

    private int rhCodCiudadOrigen;

    private int rhTelefono;

    private long rhCelular;

    private int rhCodTipVivienda;

    private int rhEstrato;

    private String rhLibretaMilitar;

    private String rhDistrito;

    private int rhClase;

    private String rhGrupoSang;

    private String rhRH;

    private int rhCodCargo;

    private int rhCodDeptoCargo;

    private int rhCodCiudadCargo;

    private String rhNombreEmergencia;

    private String rhTelEmergencia;

    private int rhCodCcosto;

    private String rhMedsAlergico;

    private long rhCodEstado;

    private String rhCorreo;

    //Constructores
    public SadRecursoHumano_TO() {
    }

    public SadRecursoHumano_TO(long rhNumIden, int rhCodDeptoIden, int rhCodCiudadIden, DateTime rhFchIngreso, String rhNombres, String rhApellido1, String rhApellido2, int rhCodSexo, int rhCodEstCivil, String rhDireccion, String rhBarrio, DateTime rhFchNacimiento, int rhCodDeptoOrigen, int rhCodCiudadOrigen, int rhTelefono, long rhCelular, int rhCodTipVivienda, int rhEstrato, String rhLibretaMilitar, String rhDistrito, int rhClase, String rhGrupoSang, String rhRH, int rhCodCargo, int rhCodDeptoCargo, int rhCodCiudadCargo, String rhNombreEmergencia, String rhTelEmergencia, int rhCodCcosto, String rhMedsAlergico, long rhCodEstado, String rhCorreo) {
        this.rhNumIden = rhNumIden;
        this.rhCodDeptoIden = rhCodDeptoIden;
        this.rhCodCiudadIden = rhCodCiudadIden;
        this.rhFchIngreso = rhFchIngreso;
        this.rhNombres = rhNombres;
        this.rhApellido1 = rhApellido1;
        this.rhApellido2 = rhApellido2;
        this.rhCodSexo = rhCodSexo;
        this.rhCodEstCivil = rhCodEstCivil;
        this.rhDireccion = rhDireccion;
        this.rhBarrio = rhBarrio;
        this.rhFchNacimiento = rhFchNacimiento;
        this.rhCodDeptoOrigen = rhCodDeptoOrigen;
        this.rhCodCiudadOrigen = rhCodCiudadOrigen;
        this.rhTelefono = rhTelefono;
        this.rhCelular = rhCelular;
        this.rhCodTipVivienda = rhCodTipVivienda;
        this.rhEstrato = rhEstrato;
        this.rhLibretaMilitar = rhLibretaMilitar;
        this.rhDistrito = rhDistrito;
        this.rhClase = rhClase;
        this.rhGrupoSang = rhGrupoSang;
        this.rhRH = rhRH;
        this.rhCodCargo = rhCodCargo;
        this.rhCodDeptoCargo = rhCodDeptoCargo;
        this.rhCodCiudadCargo = rhCodCiudadCargo;
        this.rhNombreEmergencia = rhNombreEmergencia;
        this.rhTelEmergencia = rhTelEmergencia;
        this.rhCodCcosto = rhCodCcosto;
        this.rhMedsAlergico = rhMedsAlergico;
        this.rhCodEstado = rhCodEstado;
        this.rhCorreo = rhCorreo;
    }

    //Getter and Setters
    public long getRhNumIden() {
        return rhNumIden;
    }

    public void setRhNumIden(long rhNumIden) {
        this.rhNumIden = rhNumIden;
    }

    public int getRhCodDeptoIden() {
        return rhCodDeptoIden;
    }

    public void setRhCodDeptoIden(int rhCodDeptoIden) {
        this.rhCodDeptoIden = rhCodDeptoIden;
    }

    public int getRhCodCiudadIden() {
        return rhCodCiudadIden;
    }

    public void setRhCodCiudadIden(int rhCodCiudadIden) {
        this.rhCodCiudadIden = rhCodCiudadIden;
    }

    public DateTime getRhFchIngreso() {
        return rhFchIngreso;
    }

    public void setRhFchIngreso(DateTime rhFchIngreso) {
        this.rhFchIngreso = rhFchIngreso;
    }

    public String getRhNombres() {
        return rhNombres;
    }

    public void setRhNombres(String rhNombres) {
        this.rhNombres = rhNombres;
    }

    public String getRhApellido1() {
        return rhApellido1;
    }

    public void setRhApellido1(String rhApellido1) {
        this.rhApellido1 = rhApellido1;
    }

    public String getRhApellido2() {
        return rhApellido2;
    }

    public void setRhApellido2(String rhApellido2) {
        this.rhApellido2 = rhApellido2;
    }

    public int getRhCodSexo() {
        return rhCodSexo;
    }

    public void setRhCodSexo(int rhCodSexo) {
        this.rhCodSexo = rhCodSexo;
    }

    public int getRhCodEstCivil() {
        return rhCodEstCivil;
    }

    public void setRhCodEstCivil(int rhCodEstCivil) {
        this.rhCodEstCivil = rhCodEstCivil;
    }

    public String getRhDireccion() {
        return rhDireccion;
    }

    public void setRhDireccion(String rhDireccion) {
        this.rhDireccion = rhDireccion;
    }

    public String getRhBarrio() {
        return rhBarrio;
    }

    public void setRhBarrio(String rhBarrio) {
        this.rhBarrio = rhBarrio;
    }

    public DateTime getRhFchNacimiento() {
        return rhFchNacimiento;
    }

    public void setRhFchNacimiento(DateTime rhFchNacimiento) {
        this.rhFchNacimiento = rhFchNacimiento;
    }

    public int getRhCodDeptoOrigen() {
        return rhCodDeptoOrigen;
    }

    public void setRhCodDeptoOrigen(int rhCodDeptoOrigen) {
        this.rhCodDeptoOrigen = rhCodDeptoOrigen;
    }

    public int getRhCodCiudadOrigen() {
        return rhCodCiudadOrigen;
    }

    public void setRhCodCiudadOrigen(int rhCodCiudadOrigen) {
        this.rhCodCiudadOrigen = rhCodCiudadOrigen;
    }

    public int getRhTelefono() {
        return rhTelefono;
    }

    public void setRhTelefono(int rhTelefono) {
        this.rhTelefono = rhTelefono;
    }

    public long getRhCelular() {
        return rhCelular;
    }

    public void setRhCelular(long rhCelular) {
        this.rhCelular = rhCelular;
    }

    public int getRhCodTipVivienda() {
        return rhCodTipVivienda;
    }

    public void setRhCodTipVivienda(int rhCodTipVivienda) {
        this.rhCodTipVivienda = rhCodTipVivienda;
    }

    public int getRhEstrato() {
        return rhEstrato;
    }

    public void setRhEstrato(int rhEstrato) {
        this.rhEstrato = rhEstrato;
    }

    public String getRhLibretaMilitar() {
        return rhLibretaMilitar;
    }

    public void setRhLibretaMilitar(String rhLibretaMilitar) {
        this.rhLibretaMilitar = rhLibretaMilitar;
    }

    public String getRhDistrito() {
        return rhDistrito;
    }

    public void setRhDistrito(String rhDistrito) {
        this.rhDistrito = rhDistrito;
    }

    public int getRhClase() {
        return rhClase;
    }

    public void setRhClase(int rhClase) {
        this.rhClase = rhClase;
    }

    public String getRhGrupoSang() {
        return rhGrupoSang;
    }

    public void setRhGrupoSang(String rhGrupoSang) {
        this.rhGrupoSang = rhGrupoSang;
    }

    public String getRhRH() {
        return rhRH;
    }

    public void setRhRH(String rhRH) {
        this.rhRH = rhRH;
    }

    public int getRhCodCargo() {
        return rhCodCargo;
    }

    public void setRhCodCargo(int rhCodCargo) {
        this.rhCodCargo = rhCodCargo;
    }

    public int getRhCodDeptoCargo() {
        return rhCodDeptoCargo;
    }

    public void setRhCodDeptoCargo(int rhCodDeptoCargo) {
        this.rhCodDeptoCargo = rhCodDeptoCargo;
    }

    public int getRhCodCiudadCargo() {
        return rhCodCiudadCargo;
    }

    public void setRhCodCiudadCargo(int rhCodCiudadCargo) {
        this.rhCodCiudadCargo = rhCodCiudadCargo;
    }

    public String getRhNombreEmergencia() {
        return rhNombreEmergencia;
    }

    public void setRhNombreEmergencia(String rhNombreEmergencia) {
        this.rhNombreEmergencia = rhNombreEmergencia;
    }

    public String getRhTelEmergencia() {
        return rhTelEmergencia;
    }

    public void setRhTelEmergencia(String rhTelEmergencia) {
        this.rhTelEmergencia = rhTelEmergencia;
    }

    public int getRhCodCcosto() {
        return rhCodCcosto;
    }

    public void setRhCodCcosto(int rhCodCcosto) {
        this.rhCodCcosto = rhCodCcosto;
    }

    public String getRhMedsAlergico() {
        return rhMedsAlergico;
    }

    public void setRhMedsAlergico(String rhMedsAlergico) {
        this.rhMedsAlergico = rhMedsAlergico;
    }

    public long getRhCodEstado() {
        return rhCodEstado;
    }

    public void setRhCodEstado(long rhCodEstado) {
        this.rhCodEstado = rhCodEstado;
    }

    public String getRhCorreo() {
        return rhCorreo;
    }

    public void setRhCorreo(String rhCorreo) {
        this.rhCorreo = rhCorreo;
    }

    @Override
    public String toString() {
        return "SadRecursoHumano_TO{" + "rhNumIden=" + rhNumIden + ", rhCodDeptoIden=" + rhCodDeptoIden + ", rhCodCiudadIden=" + rhCodCiudadIden + ", rhFchIngreso=" + rhFchIngreso + ", rhNombres=" + rhNombres + ", rhApellido1=" + rhApellido1 + ", rhApellido2=" + rhApellido2 + ", rhCodSexo=" + rhCodSexo + ", rhCodEstCivil=" + rhCodEstCivil + ", rhDireccion=" + rhDireccion + ", rhBarrio=" + rhBarrio + ", rhFchNacimiento=" + rhFchNacimiento + ", rhCodDeptoOrigen=" + rhCodDeptoOrigen + ", rhCodCiudadOrigen=" + rhCodCiudadOrigen + ", rhTelefono=" + rhTelefono + ", rhCelular=" + rhCelular + ", rhCodTipVivienda=" + rhCodTipVivienda + ", rhEstrato=" + rhEstrato + ", rhLibretaMilitar=" + rhLibretaMilitar + ", rhDistrito=" + rhDistrito + ", rhClase=" + rhClase + ", rhGrupoSang=" + rhGrupoSang + ", rhRH=" + rhRH + ", rhCodCargo=" + rhCodCargo + ", rhCodDeptoCargo=" + rhCodDeptoCargo + ", rhCodCiudadCargo=" + rhCodCiudadCargo + ", rhNombreEmergencia=" + rhNombreEmergencia + ", rhTelEmergencia=" + rhTelEmergencia + ", rhCodCcosto=" + rhCodCcosto + ", rhMedsAlergico=" + rhMedsAlergico + ", rhCodEstado=" + rhCodEstado + ", rhCorreo=" + rhCorreo + '}';
    }

}
