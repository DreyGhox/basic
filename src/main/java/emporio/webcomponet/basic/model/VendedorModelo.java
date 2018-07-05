/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import emporio.webcomponet.basic.model.CiudadModelo;
import emporio.webcomponet.basic.model.TipoPersonaModelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Drako
 */

@Entity
@Table (name = "Vendedor")
public class VendedorModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVendedor;
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
    @OneToOne
    @JoinColumn(name = "id_persona")
    private PersonaModelo persona;
    @ManyToOne
    @JoinColumn(name = "id_Tpersona")
    private TipoPersonaModelo tipopersona;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
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

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    
    public VendedorModelo() {
    }

    public VendedorModelo(String rut, String nombre, String apellido, String fechadenacimiento, String telefono, String direccion1, String direccion2, CiudadModelo ciudad, TipoPersonaModelo tipopersona, PersonaModelo persona) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechadenacimiento = fechadenacimiento;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.tipopersona = tipopersona;
        this.persona = persona;
    }

    private VendedorModelo(int idVendedor, String rut, String nombre, String apellido, String fechadenacimiento, String telefono, String direccion1, String direccion2, CiudadModelo ciudad, TipoPersonaModelo tipopersona, PersonaModelo persona) {
        this.idVendedor = idVendedor;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechadenacimiento = fechadenacimiento;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.tipopersona = tipopersona;
        this.persona = persona;
    }
    

          
            
            
            
}