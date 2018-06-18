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
public class ModeloModelo {
   private int idmodelo;
   private String nombremodelo;
   private String detalle;
   public MarcaModelo marca;

   public static ArrayList<ModeloModelo> modelo = new ArrayList<>();
    public int getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getNombremodelo() {
        return nombremodelo;
    }

    public void setNombremodelo(String nombremodelo) {
        this.nombremodelo = nombremodelo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MarcaModelo getMarca() {
        return marca;
    }

    public void setMarca(MarcaModelo marca) {
        this.marca = marca;
    }

    public ModeloModelo() {
    }

    public ModeloModelo(String nombremodelo, String detalle, MarcaModelo marca) {
        this.nombremodelo = nombremodelo;
        this.detalle = detalle;
        this.marca = marca;
    }

    private ModeloModelo(int idmodelo, String nombremodelo, String detalle, MarcaModelo marca) {
        this.idmodelo = idmodelo;
        this.nombremodelo = nombremodelo;
        this.detalle = detalle;
        this.marca = marca;
    }
   public boolean nuevaModelo(ModeloModelo nuevoModelo){
        
        int id = 0;
        
        if(!modelo.isEmpty()){
            for(ModeloModelo mod : modelo){
                if(mod.getIdmodelo()>id){
                    id = mod.getIdmodelo();
                }
            }
        }
        
        id++;
        modelo.add(new ModeloModelo(id, nuevoModelo.getNombremodelo(), nuevoModelo.getDetalle(), nuevoModelo.getMarca()));
        return true;
    }
    
    public ModeloModelo buscarModelo    (int idModeloBuscado){
        
        ModeloModelo modeloEncontrado = null;
        
        if(!modelo.isEmpty()){
            for(ModeloModelo mod : modelo){
                if(mod.getIdmodelo() == idModeloBuscado){    
                   modeloEncontrado = mod;
                }
            }
        }
        
        return  modeloEncontrado;
    }
    
    public ModeloModelo editarModelo(int idCiudad, ModeloModelo modeloEditar){
        
       ModeloModelo modeloEdita = null;
        
        if(!modelo.isEmpty()){
            for(ModeloModelo mod : modelo){
                if(mod.getIdmodelo()== idCiudad){
                    mod.setNombremodelo(modeloEditar.getNombremodelo());
                    mod.setDetalle(modeloEditar.getDetalle());
                    mod.setMarca(modeloEditar.getMarca());
                    modeloEdita = mod;
                   
                }
            }
        }
        
        return modeloEdita;
    }
    
    public boolean eliminarModel(int id){
        ModeloModelo modeloEliminada = null;
        
        if(!modelo.isEmpty()){
            for(ModeloModelo mod : modelo){
                if(mod.getIdmodelo()== idmodelo){
                   modeloEliminada = mod;
                }
            }
        }
        
        modelo.remove(modeloEliminada);
        return true;
    }
}
