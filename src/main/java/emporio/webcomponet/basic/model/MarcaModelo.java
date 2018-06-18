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
public class MarcaModelo {
   private int idmarca;
   private String nombremarca;
   private String detalle;
   
   public static ArrayList<MarcaModelo> marcas = new ArrayList<>();

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
   
    public boolean nuevaMarca(MarcaModelo nuevaMarca){
        
        int id = 0;
        
        if(!marcas.isEmpty()){
            for(MarcaModelo marca : marcas){
                if(marca.getIdmarca() > id){
                    id = marca.getIdmarca();
                }
            }
        }
        
        id++;
        marcas.add(new MarcaModelo(id, nuevaMarca.getNombremarca(), nuevaMarca.getDetalle()));
        return true;
    }
    
    public MarcaModelo buscarMarca(int idMarcaBuscada){
        
        MarcaModelo marcaEncontrada = null;
        
        if(!marcas.isEmpty()){
            
            for(MarcaModelo marca : marcas){
                if(marca.getIdmarca() == idMarcaBuscada){
                    marcaEncontrada = marca;
                }
            }
        }
        
        return marcaEncontrada;
    }
    
    public MarcaModelo editarMarca(int idMarca, MarcaModelo marcaEditar){
        
        MarcaModelo marcaEditada = null;
        
        if(!marcas.isEmpty()){
            for(MarcaModelo marca : marcas){
                if(marca.getIdmarca() == idMarca){
                    marca.setNombremarca(marcaEditar.getNombremarca());
                    marca.setDetalle(marcaEditar.getDetalle());
                    
                    marcaEditada = marca;
                }
            }
        }
        
        return marcaEditada;
    }
    
    public boolean eliminarMarca(int id){
        MarcaModelo marcaEliminada = null;
        
        if(!marcas.isEmpty()){
            for(MarcaModelo marca : marcas){
                if(marca.getIdmarca() == idmarca){
                    marcaEliminada = marca;
                }
            }
        }
        
        marcas.remove(marcaEliminada);
        return true;
    }
}
