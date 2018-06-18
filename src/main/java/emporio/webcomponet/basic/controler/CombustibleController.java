/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.CombustibleModelo;
import emporio.webcomponet.basic.repository.CombustibleRepository;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/Combustible")
public class CombustibleController {
    
    @Autowired
    private CombustibleRepository combustibleRepository;
    
    @GetMapping()
    public Iterable<CombustibleModelo > list() {
        
        return combustibleRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CombustibleModelo> get(@PathVariable String id) {
        Optional<CombustibleModelo> aOptional = combustibleRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               CombustibleModelo cEncontrado = aOptional.get();
               return new ResponseEntity<>(cEncontrado, HttpStatus.FOUND);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
 
 
    @PutMapping("/{id}")
    public ResponseEntity<CombustibleModelo> put(@PathVariable String id, @RequestBody CombustibleModelo combustibleEditar) {
        Optional<CombustibleModelo> aOptional = combustibleRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               CombustibleModelo cEncontrado = aOptional.get();
               combustibleEditar.setIdcombustible(cEncontrado.getIdcombustible());
               combustibleRepository.save(combustibleEditar);
               return new ResponseEntity<>(combustibleEditar, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody CombustibleModelo nuevoCombustible) {
        
        nuevoCombustible = combustibleRepository.save(nuevoCombustible);
        Optional<CombustibleModelo> aOptional = combustibleRepository.findById(nuevoCombustible.getIdcombustible());
                
               if (aOptional.isPresent()){
               CombustibleModelo cEncontrado = aOptional.get();
               return new ResponseEntity<>(cEncontrado, HttpStatus.CREATED);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
               }
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
       Optional<CombustibleModelo> aOptional = combustibleRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               CombustibleModelo cEncontrado = aOptional.get();
               combustibleRepository.deleteById(cEncontrado.getIdcombustible());
               return new ResponseEntity<>(cEncontrado, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
        
    }
    
}
