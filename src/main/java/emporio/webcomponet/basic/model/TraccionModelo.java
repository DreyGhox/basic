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
public class TraccionModelo {
 private int idtraccion;
 private String nombretraccion;
 private String detalle;
 public static ArrayList<TraccionModelo> tra = new ArrayList<>();
    public TraccionModelo() {
    }
    
     public TraccionModelo(String nombretraccion, String detalle) {
        this.nombretraccion = nombretraccion;
        this.detalle = detalle;
    }


    private TraccionModelo(int idtraccion, String nombretraccion, String detalle) {
        this.idtraccion = idtraccion;
        this.nombretraccion = nombretraccion;
        this.detalle = detalle;
    }

    public int getIdtraccion() {
        return idtraccion;
    }

    public void setIdtraccion(int idtraccion) {
        this.idtraccion = idtraccion;
    }

    public String getNombretraccion() {
        return nombretraccion;
    }

    public void setNombretraccion(String nombretraccion) {
        this.nombretraccion = nombretraccion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
 
 public boolean nuevaTraccion(TraccionModelo nuevaTraccion){
 int id = 0;
 if(!tra.isEmpty()){
 for(TraccionModelo tracc : tra){
 if (tracc.getIdtraccion()> id){
  id = tracc.getIdtraccion();
 }
 }
 }
 id++;
 
 tra.add(new TraccionModelo(id,nuevaTraccion.getNombretraccion(), nuevaTraccion.getDetalle()));
return true;
 }

 public TraccionModelo buscarTraccion(int idTraccionBuscada){
        TraccionModelo traccionEncontrada = null;
     if(!tra.isEmpty()){
 for(TraccionModelo tracc : tra){
 if (tracc.getIdtraccion()== idTraccionBuscada){
  traccionEncontrada = tracc;
 }
}
     }
     
     return traccionEncontrada;
 }
 
 public TraccionModelo editarTraccion(int idTraccion, TraccionModelo traccionEditar){
     TraccionModelo traccionEditada = null;
 if(!tra.isEmpty()){
 for(TraccionModelo tracc : tra){
 if (tracc.getIdtraccion()== idTraccion){
     tracc.setNombretraccion(traccionEditar.getNombretraccion());
     tracc.setDetalle(traccionEditar.getDetalle());
     
     traccionEditar = tracc;
 }
 
 
 }
}
 return traccionEditada;
 }
 
 public boolean eliminarTraccion(int id){
 TraccionModelo traccionEliminada = null;
 if(!tra.isEmpty()){
 for(TraccionModelo tracc : tra){
 if (tracc.getIdtraccion()== idtraccion){
     traccionEliminada = tracc;
 }
 }
 }
 tra.remove(traccionEliminada);
 return true;
 }
}