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
public class CarroceriaModelo {
    private int idcarroceria;
    private String nombrecarroceria;
    private String detalle;
    
    public static ArrayList<CarroceriaModelo> carro = new ArrayList<>();

    public CarroceriaModelo() {
    }
    
    public CarroceriaModelo(String nombrecarroceria, String detalle) {
        this.nombrecarroceria = nombrecarroceria;
        this.detalle = detalle;
    }

    private CarroceriaModelo(int idcarroceria, String nombrecarroceria, String detalle) {
        this.idcarroceria = idcarroceria;
        this.nombrecarroceria = nombrecarroceria;
        this.detalle = detalle;
         
    }

    public int getIdcarroceria() {
        return idcarroceria;
    }

    public void setIdcarroceria(int idcarroceria) {
        this.idcarroceria = idcarroceria;
    }

    public String getNombrecarroceria() {
        return nombrecarroceria;
    }

    public void setNombrecarroceria(String nombrecarroceria) {
        this.nombrecarroceria = nombrecarroceria;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    public boolean nuevoCarro(CarroceriaModelo nuevoCarro){
        
        int id = 0;
        
        if(!carro.isEmpty()){
            
            for(CarroceriaModelo car : carro) {
                if(car.getIdcarroceria()> id){
                    id = car.getIdcarroceria();
                }
            }
        }
        
      id++;
      
      carro.add(new CarroceriaModelo(id, nuevoCarro.getNombrecarroceria(), nuevoCarro.getDetalle()));
      return true;
    }
    
    public CarroceriaModelo buscaCarro(int idCarroBuscado){
        
        CarroceriaModelo carroEncontrado = null;
        
        if(!carro.isEmpty()){
            for(CarroceriaModelo car : carro){
                if(car.getIdcarroceria() == idCarroBuscado){
                    carroEncontrado = car;
                }
            }
        }
        
        return carroEncontrado;
    }
    
    public CarroceriaModelo editarCarro(int idCarro, CarroceriaModelo carroEditar){
        
        CarroceriaModelo carroEditado = null;
        
        if(!carro.isEmpty()){
            for(CarroceriaModelo car : carro){
                if(car.getIdcarroceria() == idCarro){
                    car.setNombrecarroceria(carroEditar.getNombrecarroceria());
                    car.setDetalle(carroEditar.getDetalle());
                    
                    carroEditado = car;
                }
            }
        }
        
        return carroEditado;
    }
    
    public boolean eliminarCarro(int id){
        
        CarroceriaModelo carroEliminado = null;
        
        if(!carro.isEmpty()){
            for(CarroceriaModelo car : carro){
                if(car.getIdcarroceria() == idcarroceria){
                    carroEliminado = car;
                }
            }
        }
        
        carro.remove(carroEliminado);
        return true;
    }
}
