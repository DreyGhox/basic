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
public class CiudadModelo {
    private int idciudad;
    private String nombreciudad;
    private String detalle;
    private RegionModelo region;
    
    

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public RegionModelo getRegion() {
        return region;
    }

    public void setRegion(RegionModelo region) {
        this.region = region;
    }

    public CiudadModelo(int id, String nombreciudad1, String detalle1) {
    }

    public CiudadModelo() {
    }

    
    public CiudadModelo(String nombreciudad, String detalle, RegionModelo region) {
        this.nombreciudad = nombreciudad;
        this.detalle = detalle;
        this.region = region;
    }

    private CiudadModelo(int idciudad, String nombreciudad, String detalle, RegionModelo region) {
        this.idciudad = idciudad;
        this.nombreciudad = nombreciudad;
        this.detalle = detalle;
        this.region = region;
    }

     
  
}
