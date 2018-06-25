/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.CarroceriaModelo;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Drako
 */
@RestController
@RequestMapping("/url")
public class CarroceriaController {
    
    @GetMapping()
    public ArrayList<CarroceriaModelo> list() {
        return CarroceriaModelo.carro;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        
        CarroceriaModelo car = new CarroceriaModelo();
        return car.buscaCarro(Integer.parseInt(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<CarroceriaModelo> put(@PathVariable String id, @RequestBody CarroceriaModelo carroEditar) {
       CarroceriaModelo car = new CarroceriaModelo();
        
       
        return new ResponseEntity<>(car.editarCarro(Integer.parseInt(id), carroEditar),HttpStatus.OK);            
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody CarroceriaModelo nuevoCarro ) {
        CarroceriaModelo car = new CarroceriaModelo();
        if(car.nuevoCarro(nuevoCarro)){
        return new ResponseEntity<>(HttpStatus.CREATED);
        
        }else{
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
      
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        
        CarroceriaModelo car = new CarroceriaModelo();
        if(car.eliminarCarro(Integer.parseInt(id))){
        return new ResponseEntity<>(HttpStatus.OK);
        
        }else{
        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        
    }
    
}
