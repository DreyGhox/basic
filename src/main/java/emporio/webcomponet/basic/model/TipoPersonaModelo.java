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
 public class TipoPersonaModelo {
    
   private int idPersona;
   private String tipopersona;
   private String detalle;
   
   public static ArrayList<TipoPersonaModelo> tipop = new ArrayList<>();

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoPersonaModelo() {
    }

    public TipoPersonaModelo(String tipopersona, String detalle) {
        this.tipopersona = tipopersona;
        this.detalle = detalle;
    }

    private TipoPersonaModelo(int idPersona, String tipopersona, String detalle) {
        this.idPersona = idPersona;
        this.tipopersona = tipopersona;
        this.detalle = detalle;
    }
    
    public boolean nuevoTipoPersona(TipoPersonaModelo nuevoTipoPersona){
        
        int id = 0;
        
        if(!tipop.isEmpty()){
            for(TipoPersonaModelo tipp : tipop){
                if(tipp.getIdPersona() > id){
                    id = tipp.getIdPersona();
                }
            }
        }
        
        id++;
        
        tipop.add(new TipoPersonaModelo(id, nuevoTipoPersona.getTipopersona(), nuevoTipoPersona.getDetalle()));
        return true;
    }
    
    public TipoPersonaModelo buscarTipop(int idTipoBuscado){
        
        TipoPersonaModelo tipoEncontrado = null;
        if(!tipop.isEmpty()){
            for(TipoPersonaModelo tipp : tipop){
                if(tipp.getIdPersona() == idTipoBuscado){
                    tipoEncontrado = tipp;
                }
            }
        }
        return tipoEncontrado;
    }
    
    public TipoPersonaModelo editarTipo(int idTipop, TipoPersonaModelo tipoEditar){
        
        TipoPersonaModelo tipoEditado = null;
        
        if(!tipop.isEmpty()){
            for(TipoPersonaModelo tipp : tipop){
                if(tipp.getIdPersona() == idTipop){
                    tipp.setTipopersona(tipoEditar.getTipopersona());
                    tipp.setDetalle(tipoEditar.getDetalle());
                    
                    tipoEditado = tipp;
                }
            }
        }
        
        return tipoEditado;
    }
    
    public boolean eliminarTipo(int id){
        
        TipoPersonaModelo tipoEliminado = null;
        
        if(!tipop.isEmpty()){
            for(TipoPersonaModelo tipp : tipop){
                if(tipp.getIdPersona() == idPersona){
                    tipoEliminado = tipp;
                }
                
            }
        }
        
        tipop.remove(tipoEliminado);
        return true;
    }
}

        



    