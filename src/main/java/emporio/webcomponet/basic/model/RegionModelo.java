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
public class RegionModelo {
    private int idregion;
    private String nombreregion;
    private String detalle;
    
    

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public String getNombreregion() {
        return nombreregion;
    }

    public void setNombreregion(String nombreregion) {
        this.nombreregion = nombreregion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public RegionModelo() {
    }

    public RegionModelo(String nombreregion, String detalle) {
        this.nombreregion = nombreregion;
        this.detalle = detalle;
    }

    private RegionModelo(int idregion, String nombreregion, String detalle) {
        this.idregion = idregion;
        this.nombreregion = nombreregion;
        this.detalle = detalle;
    }
    
   
}
