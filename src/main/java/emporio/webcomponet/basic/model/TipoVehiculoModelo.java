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
@Table(name = "TipoVehiculo")
public class TipoVehiculoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTvehiculo;
    private String tipovehiculo;
    private String detalleVehiculo;
    
   

    public TipoVehiculoModelo() {
    }

    public TipoVehiculoModelo(String tipovehiculo, String detalleVehiculo) {
        this.tipovehiculo = tipovehiculo;
        this.detalleVehiculo = detalleVehiculo;
    }
    
    private TipoVehiculoModelo(int idTvehiculo, String tipovehiculo, String detalleVehiculo) {
        this.idTvehiculo = idTvehiculo;
        this.tipovehiculo = tipovehiculo;
        this.detalleVehiculo = detalleVehiculo;
    }

    public int getIdTvehiculo() {
        return idTvehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.idTvehiculo = idvehiculo;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getDetalleVehiculo() {
        return detalleVehiculo;
    }

    public void setDetalleVehiculo(String detalleVehiculo) {
        this.detalleVehiculo = detalleVehiculo;
    }
    
    
}