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
@Table (name = "TipoPersona")
 public class TipoPersonaModelo {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idTpersona;
   private String tipopersona;
   private String detalle;
   
   

    public int getIdTpersona() {
        return idTpersona;
    }

    public void setIdTpersona(int idTpersona) {
        this.idTpersona = idTpersona;
    }

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoPersonaModelo() {
    }

    public TipoPersonaModelo(String tipopersona, String detalle) {
        this.tipopersona = tipopersona;
        this.detalle = detalle;
    }

    private TipoPersonaModelo(int idTpersona, String tipopersona, String detalle) {
        this.idTpersona = idTpersona;
        this.tipopersona = tipopersona;
        this.detalle = detalle;
    }
    
   
}

        



    