package com.miempresa.DTO;

import com.miempresa.DTO.opciones.*;

import javax.validation.constraints.NotBlank;

public class formulario2DTO {

    private String documento;
    @NotBlank(message = "Campo obligatorio")
    private String documento_n;
    @NotBlank(message = "Campo obligatorio")
    private String apellido_p;
    @NotBlank(message = "Campo obligatorio")
    private String apellido_m;
    @NotBlank(message = "Campo obligatorio")
    private String nombres;
    private String dia;
    private String mes;
    private String anio;
    private String sexo;
    private String estado;
    private String laboral;
    @NotBlank(message = "Campo obligatorio")
    private String RUC;
    private String aceptar;

    private OpcionesDia[] opcionesDias;
    private OpcionesMes[] opcionesMeses;
    private OpcionesAnio[] opcionesAnios;
    private OpcionesEstado[] opcionesEstados;
    private OpcionesLaboral[] opcionesLaborales;

    public formulario2DTO() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento_n() {
        return documento_n;
    }

    public void setDocumento_n(String documento_n) {
        this.documento_n = documento_n;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLaboral() {
        return laboral;
    }

    public void setLaboral(String laboral) {
        this.laboral = laboral;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getAceptar() {
        return aceptar;
    }

    public void setAceptar(String aceptar) {
        this.aceptar = aceptar;
    }

    public OpcionesDia[] getOpcionesDias() {
        return opcionesDias;
    }

    public void setOpcionesDias(OpcionesDia[] opcionesDias) {
        this.opcionesDias = opcionesDias;
    }

    public OpcionesMes[] getOpcionesMeses() {
        return opcionesMeses;
    }

    public void setOpcionesMeses(OpcionesMes[] opcionesMeses) {
        this.opcionesMeses = opcionesMeses;
    }

    public OpcionesAnio[] getOpcionesAnios() {
        return opcionesAnios;
    }

    public void setOpcionesAnios(OpcionesAnio[] opcionesAnios) {
        this.opcionesAnios = opcionesAnios;
    }

    public OpcionesEstado[] getOpcionesEstados() {
        return opcionesEstados;
    }

    public void setOpcionesEstados(OpcionesEstado[] opcionesEstados) {
        this.opcionesEstados = opcionesEstados;
    }

    public OpcionesLaboral[] getOpcionesLaborales() {
        return opcionesLaborales;
    }

    public void setOpcionesLaborales(OpcionesLaboral[] opcionesLaborales) {
        this.opcionesLaborales = opcionesLaborales;
    }
}
