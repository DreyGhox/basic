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
public class CarroceriaModelo {
    private int idcarroceria;
    private String nombrecarroceria;
    private String detalle;
    
    

    public CarroceriaModelo() {
    }
    
    public CarroceriaModelo(String nombrecarroceria, String detalle) {
        this.nombrecarroceria = nombrecarroceria;
        this.detalle = detalle;
    }

    private CarroceriaModelo(int idcarroceria, String nombrecarroceria, String detalle) {
        this.idcarroceria = idcarroceria;
        this.nombrecarroceria = nombrecarroceria;
        this.detalle = detalle;
         
    }

    public int getIdcarroceria() {
        return idcarroceria;
    }

    public void setIdcarroceria(int idcarroceria) {
        this.idcarroceria = idcarroceria;
    }

    public String getNombrecarroceria() {
        return nombrecarroceria;
    }

    public void setNombrecarroceria(String nombrecarroceria) {
        this.nombrecarroceria = nombrecarroceria;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
}
