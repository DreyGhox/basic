/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Drako
 */

@Entity
@Table (name = "Combustible")
public class CombustibleModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcombustible;
    private String tipocombustible;
    private String detalle;
    
   

    public CombustibleModelo() {
    }
    
    public CombustibleModelo(String tipocombustible, String detalle) {
        this.tipocombustible = tipocombustible;
        this.detalle = detalle;
    }
    
    private CombustibleModelo(int idcombustible, String tipocombustible, String detalle) {
        this.idcombustible = idcombustible;
        this.tipocombustible = tipocombustible;
        this.detalle = detalle;
    }

    public int getIdcombustible() {
        return idcombustible;
    }

    public void setIdcombustible(int idcombustible) {
        this.idcombustible = idcombustible;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}

    