/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;



/**
 *
 * @author Drako
 */
 public class TipoPersonaModelo {
    
   private int idPersona;
   private String tipopersona;
   private String detalle;
   
   

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    private TipoPersonaModelo(int idPersona, String tipopersona, String detalle) {
        this.idPersona = idPersona;
        this.tipopersona = tipopersona;
        this.detalle = detalle;
    }
    
   
}

        



    