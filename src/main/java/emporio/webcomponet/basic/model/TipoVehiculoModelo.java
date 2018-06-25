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
public class TipoVehiculoModelo {
    
    private int idvehiculo;
    private String tipovehiculo;
    private String detalleVehiculo;
    
   

    public TipoVehiculoModelo() {
    }

    public TipoVehiculoModelo(String tipovehiculo, String detalleVehiculo) {
        this.tipovehiculo = tipovehiculo;
        this.detalleVehiculo = detalleVehiculo;
    }
    
    private TipoVehiculoModelo(int idvehiculo, String tipovehiculo, String detalleVehiculo) {
        this.idvehiculo = idvehiculo;
        this.tipovehiculo = tipovehiculo;
        this.detalleVehiculo = detalleVehiculo;
    }

    public int getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
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