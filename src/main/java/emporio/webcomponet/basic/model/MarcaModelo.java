/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 *
 * @author Drako
 */
@Entity
@Table (name = "Marca")
public class MarcaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idmarca;
   private String nombremarca;
   private String detalle;
   

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MarcaModelo() {
    }

    public MarcaModelo(String nombremarca, String detalle) {
        this.nombremarca = nombremarca;
        this.detalle = detalle;
    }

    private MarcaModelo(int idmarca, String nombremarca, String detalle) {
        this.idmarca = idmarca;
        this.nombremarca = nombremarca;
        this.detalle = detalle;
    }
   
   
}
