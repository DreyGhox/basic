/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Drako
 */
@Entity
@Table(name = "traccion")
public class TraccionModelo {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int idtraccion;
 private String nombretraccion;
 private String detalle;
 
 
    public TraccionModelo() {
    }
    
     public TraccionModelo(String nombretraccion, String detalle) {
        this.nombretraccion = nombretraccion;
        this.detalle = detalle;
    }


    private TraccionModelo(int idtraccion, String nombretraccion, String detalle) {
        this.idtraccion = idtraccion;
        this.nombretraccion = nombretraccion;
        this.detalle = detalle;
    }

    public int getIdtraccion() {
        return idtraccion;
    }

    public void setIdtraccion(int idtraccion) {
        this.idtraccion = idtraccion;
    }

    public String getNombretraccion() {
        return nombretraccion;
    }

    public void setNombretraccion(String nombretraccion) {
        this.nombretraccion = nombretraccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
 

        
}