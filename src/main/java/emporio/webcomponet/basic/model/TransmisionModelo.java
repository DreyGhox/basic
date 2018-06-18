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
public class TransmisionModelo {
    private int idtransmision;
    private String nombretransmision;
    private String detalle;
    
    public static ArrayList<TransmisionModelo> trans = new ArrayList<>();

    public TransmisionModelo() {
    }
    
    public TransmisionModelo(String nombretransmision, String detalle) {
        this.nombretransmision = nombretransmision;
        this.detalle = detalle;
    }
    
    private TransmisionModelo(int idtransmision, String nombretransmision, String detalle) {
        this.idtransmision = idtransmision;
        this.nombretransmision = nombretransmision;
        this.detalle = detalle;
    }

    public int getIdtransmision() {
        return idtransmision;
    }

    public void setIdtransmision(int idtransmision) {
        this.idtransmision = idtransmision;
    }

    public String getNombretransmision() {
        return nombretransmision;
    }

    public void setNombretransmision(String nombretransmision) {
        this.nombretransmision = nombretransmision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    public boolean nuevaTransmision (TransmisionModelo nuevaTransmision){
        
        int id = 0;
        
        if(!trans.isEmpty()){
            for(TransmisionModelo tran : trans){
                if(tran.getIdtransmision() > id){
                    id = tran.getIdtransmision();
                }
            }
        }
        
        id++;
        
        trans.add(new TransmisionModelo(id, nuevaTransmision.getNombretransmision(), nuevaTransmision.getDetalle()));
        return true;
    }
    
    public TransmisionModelo buscarTransmision(int idTransmisionBuscado){
        
        TransmisionModelo transmisionEncontrada = null;
        
        if(!trans.isEmpty()){
            for(TransmisionModelo tran : trans){
                if(tran.getIdtransmision() == idTransmisionBuscado){
                    transmisionEncontrada = tran;
                }
                
            }
        }
        return transmisionEncontrada;
    }
    
    public TransmisionModelo editarTransmision(int idTransmision, TransmisionModelo transmisionEditar){
        
        TransmisionModelo transmisionEditada = null;
        
        if(!trans.isEmpty()){
            for(TransmisionModelo tran : trans){
              if(tran.getIdtransmision() == idTransmision){
                  tran.setNombretransmision(transmisionEditar.getNombretransmision());
                  tran.setDetalle(transmisionEditar.getDetalle());
                  
                  transmisionEditada = tran;
              }  
            }
        }
        return transmisionEditada;
    }
    
    public boolean eliminarTransmision(int id){
        
        TransmisionModelo transmisionEliminada = null;
        
        if(!trans.isEmpty()){
            for(TransmisionModelo tran : trans){
             if(tran.getIdtransmision() == idtransmision){
                 transmisionEliminada = tran;
             }   
            }
        }
        
        trans.remove(transmisionEliminada);
        return true;
    }
}

