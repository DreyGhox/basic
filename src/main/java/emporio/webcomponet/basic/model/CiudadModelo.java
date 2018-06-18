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
public class CiudadModelo {
    private int idciudad;
    private String nombreciudad;
    private String detalle;
    private RegionModelo region;
    
    public static ArrayList<CiudadModelo> ciudad = new ArrayList<>();

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

     
    public boolean nuevaCiudad(CiudadModelo nuevaCiudad){
        
        int id = 0;
        
        if(!ciudad.isEmpty()){
            for(CiudadModelo city : ciudad){
                if(city.getIdciudad()>id){
                    id = city.getIdciudad();
                }
            }
        }
        
        id++;
        ciudad.add(new CiudadModelo(id, nuevaCiudad.getNombreciudad(), nuevaCiudad.getDetalle()));
        return true;
    }
    
    public CiudadModelo buscarCiudad(int idCiudadBuscada){
        
        CiudadModelo ciudadEncontrada = null;
        
        if(!ciudad.isEmpty()){
            for(CiudadModelo city : ciudad){
                if(city.getIdciudad() == idCiudadBuscada){
                    ciudadEncontrada = city;
                }
            }
        }
        
        return ciudadEncontrada;
    }
    
    public CiudadModelo editarCiudad(int idCiudad, CiudadModelo ciudadEditar){
        
        CiudadModelo ciudadEditada = null;
        
        if(!ciudad.isEmpty()){
            for(CiudadModelo city : ciudad){
                if(city.getIdciudad() == idCiudad){
                    city.setNombreciudad(ciudadEditar.getNombreciudad());
                    city.setDetalle(ciudadEditar.getDetalle());
                    
                    ciudadEditada = city;
                }
            }
        }
        
        return ciudadEditada;
    }
    
    public boolean eliminarCiudad(int id){
        CiudadModelo ciudadEliminada = null;
        
        if(!ciudad.isEmpty()){
            for(CiudadModelo city : ciudad){
                if(city.getIdciudad() == idciudad){
                    ciudadEliminada = city;
                }
            }
        }
        
        ciudad.remove(ciudadEliminada);
        return true;
    }
}
