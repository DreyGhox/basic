/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import java.util.ArrayList;

/**
 *
 * @author Drako
 */
public class TipoVehiculoModelo {
    
    private int idvehiculo;
    private String tipovehiculo;
    private String detalleVehiculo;
    
    public static ArrayList<TipoVehiculoModelo> tipos = new ArrayList <>();

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
    
    public boolean nuevoTipoVehiculo(TipoVehiculoModelo nuevoTipoVehiculo){
        
        int id = 0;
        
        if(!tipos.isEmpty()){
            for(TipoVehiculoModelo tip : tipos){
                if(tip.getIdvehiculo() > id){
                    id = tip.getIdvehiculo();
                }
            }
        }
        
        id++;
        
        tipos.add(new TipoVehiculoModelo(id, nuevoTipoVehiculo.getTipovehiculo(), nuevoTipoVehiculo.getDetalleVehiculo()));
        return true;
    }
    
    public TipoVehiculoModelo buscarVehiculo(int idVehiculoEncontrado){
        
        TipoVehiculoModelo tipoEncontrado = null;
        
        if(!tipos.isEmpty()){
            
            for(TipoVehiculoModelo tip : tipos){
                if(tip.getIdvehiculo() == idVehiculoEncontrado){
                    tipoEncontrado = tip;
                }
            }
        }
        return tipoEncontrado;
    }
    
    public TipoVehiculoModelo editarTipo(int idTipo, TipoVehiculoModelo tipoEditar){
        
        TipoVehiculoModelo tipoEditado = null;
        
        if(!tipos.isEmpty()){
            for(TipoVehiculoModelo tip : tipos){
                if(tip.getIdvehiculo() == idTipo){
                    tip.setTipovehiculo(tipoEditar.getTipovehiculo());
                    tip.setDetalleVehiculo(tipoEditar.getDetalleVehiculo());
                
                tipoEditado = tip;
                }
                
            }
        }
        
        return tipoEditado;
    }
    
    public boolean eliminarTipo(int id){
        
        TipoVehiculoModelo tipoEliminado = null;
        if(!tipos.isEmpty()){
            for(TipoVehiculoModelo tip : tipos){
                if(tip.getIdvehiculo() == idvehiculo){
                    tipoEliminado = tip;
                }
            }
        }
        
        tipos.remove(tipoEliminado);
        return true;
    }
}