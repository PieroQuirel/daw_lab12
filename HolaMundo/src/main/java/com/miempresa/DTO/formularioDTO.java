package com.miempresa.DTO;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class formularioDTO {
    @NotBlank(message = "Campo obligatorio")
    private String nombre;
    @NotBlank(message = "Campo obligatorio")
    private String apellido;

    private String sexo;
    @Range(min =0, max = 100, message = "Ingrese una edad correcta")
    private int edad;
    @NotBlank(message = "Campo obligatorio")
    @Size(min = 4,max = 8,message = "La longitud debe ser de 4 a 8")
    private String clave;
    @NotBlank(message = "Campo obligatorio")
    @Email(message = "Ingrese un correo valido")
    private String correo;
    private OpcionesSexo[] opcionesSexos;

    public formularioDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public OpcionesSexo[] getOpcionesSexos() {
        return opcionesSexos;
    }

    public void setOpcionesSexos(OpcionesSexo[] opcionesSexos) {
        this.opcionesSexos = opcionesSexos;
    }
}
