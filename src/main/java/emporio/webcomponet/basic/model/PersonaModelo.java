/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import emporio.webcomponet.basic.model.CiudadModelo;
import emporio.webcomponet.basic.model.TipoPersonaModelo;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Drako
 */
public class PersonaModelo {
    
    private int idPersona;
    private String rut;
    private String nombre;
    private String apellido;
    private String fechadenacimiento;
    private String telefono;  
    private String direccion1;
    private String direccion2;
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private CiudadModelo ciudad;
    @ManyToOne
    @JoinColumn(name = "id_Persona")
    private TipoPersonaModelo tipopersona;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public CiudadModelo getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadModelo ciudad) {
        this.ciudad = ciudad;
    }

    public TipoPersonaModelo getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(TipoPersonaModelo tipopersona) {
        this.tipopersona = tipopersona;
    }

    public PersonaModelo() {
    }

    public PersonaModelo(String rut, String nombre, String apellido, String fechadenacimiento, String telefono, String direccion1, String direccion2, CiudadModelo ciudad, TipoPersonaModelo tipopersona) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechadenacimiento = fechadenacimiento;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.tipopersona = tipopersona;
    }

    private PersonaModelo(int idPersona, String rut, String nombre, String apellido, String fechadenacimiento, String telefono, String direccion1, String direccion2, CiudadModelo ciudad, TipoPersonaModelo tipopersona) {
        this.idPersona = idPersona;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechadenacimiento = fechadenacimiento;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.tipopersona = tipopersona;
    }
    

          
            
            
            
}
