/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.CarroceriaModelo;
import emporio.webcomponet.basic.repository.CarroceriaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @author Jhimta
 */
@RestController
@RequestMapping("/Carroceria")
public class CarroceriaController {
    
    @Autowired
    private CarroceriaRepository carroceriaRepository;
    
    @GetMapping()
   
    public Iterable<CarroceriaModelo> list(){
        return carroceriaRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CarroceriaModelo> get(@PathVariable String id) {
        
        Optional<CarroceriaModelo> aOptional = carroceriaRepository.findById(Integer.parseInt(id));
        
        if (aOptional.isPresent()){
            CarroceriaModelo caEncontrado = aOptional.get();
            return new ResponseEntity<>(caEncontrado, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<CarroceriaModelo> put(@PathVariable String id, @RequestBody CarroceriaModelo carroEditar) {
        Optional<CarroceriaModelo> aOptional = carroceriaRepository.findById(Integer.parseInt(id));
        
        if (aOptional.isPresent()){
            CarroceriaModelo caEncontrado = aOptional.get();
            carroEditar.setIdcarroceria(caEncontrado.getIdcarroceria());
            carroceriaRepository.save(carroEditar);
            return new ResponseEntity<>(carroEditar, HttpStatus.OK);
            
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }         
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody CarroceriaModelo nuevoCarro ) {
        nuevoCarro = carroceriaRepository.save(nuevoCarro);
        Optional<CarroceriaModelo> aOptional = carroceriaRepository.findById(nuevoCarro.getIdcarroceria());
        
        if (aOptional.isPresent()){
            CarroceriaModelo caEncontrado = aOptional.get();
            return new ResponseEntity<>(caEncontrado, HttpStatus.CREATED);
            
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
       Optional<CarroceriaModelo> aOptional = carroceriaRepository.findById(Integer.parseInt(id));
        
        if (aOptional.isPresent()){
            CarroceriaModelo caEncontrado = aOptional.get();
            carroceriaRepository.deleteById(caEncontrado.getIdcarroceria());
            return new ResponseEntity<>(caEncontrado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
}
