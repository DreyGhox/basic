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
public class RegionModelo {
    private int idregion;
    private String nombreregion;
    private String detalle;
    public static ArrayList<RegionModelo> region = new ArrayList<>();
    

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
    
    public boolean nuevaRegion(RegionModelo nuevaRegion){
        
        int id = 0;
        
        if(!region.isEmpty()){
            
            for (RegionModelo reg : region){
                if (reg.getIdregion()> id){
                    id = reg.getIdregion();
                }
            }
        }
        
        id++;
        
        region.add(new RegionModelo(id, nuevaRegion.getNombreregion(), nuevaRegion.getDetalle()));
        
        return true;
    }
    
    
    public RegionModelo buscarRegion(int idRegionBuscada){
        
        RegionModelo regionEncontrada = null;
        
        if(!region.isEmpty()) {
            for (RegionModelo reg : region) {
                if(reg.getIdregion() == idRegionBuscada){
                    regionEncontrada = reg;
                }
            }
        }
        
        return regionEncontrada;
    }
    
    public RegionModelo editarRegion(int idregion, RegionModelo regionEditar){
        
        RegionModelo regionEditada = null;
        
        if(!region.isEmpty()){
            for(RegionModelo reg : region){
                if(reg.getIdregion()== idregion){
                    reg.setNombreregion(regionEditar.getNombreregion());
                    reg.setDetalle(regionEditar.getDetalle());
                    
                    regionEditada = reg;
                }
            }
        }
        
        return regionEditada;        
    }
    
    public boolean eliminarRegion(int id){
        
        RegionModelo regionEliminada = null;
        
        if(!region.isEmpty()){
            for(RegionModelo reg : region){
                if(reg.getIdregion() == idregion){
                    regionEliminada = reg;
                }
            }
        }
        region.remove(regionEliminada);
        
        return true;
    }
}
