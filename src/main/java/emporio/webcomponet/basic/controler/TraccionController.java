 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.TraccionModelo;
import emporio.webcomponet.basic.repository.TraccionRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/traccion")
public class TraccionController {
  @Autowired
       private TraccionRepository traccRegionRepository;
       
       
    @GetMapping()
    public Iterable<TraccionModelo> list() {
        return traccRegionRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TraccionModelo> get(@PathVariable String id) {
         Optional<TraccionModelo> aOptional = traccRegionRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               TraccionModelo tEncontrado = aOptional.get();
               return new ResponseEntity<>(tEncontrado, HttpStatus.FOUND);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<TraccionModelo> put(@PathVariable String id, @RequestBody TraccionModelo traccionEditar) {
          Optional<TraccionModelo> aOptional = traccRegionRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               TraccionModelo tEncontrado = aOptional.get();
              traccionEditar.setIdtraccion(tEncontrado.getIdtraccion());
              traccRegionRepository.save(traccionEditar);
              return new ResponseEntity<>(traccionEditar, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody TraccionModelo nuevaTracion) {
      
     nuevaTracion = traccRegionRepository.save(nuevaTracion);
     
     Optional<TraccionModelo> aOptional = traccRegionRepository.findById(nuevaTracion.getIdtraccion());
     if (aOptional.isPresent()){
               TraccionModelo tEncontrado = aOptional.get();
             
              return new ResponseEntity<>(nuevaTracion, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
           Optional<TraccionModelo> aOptional = traccRegionRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               TraccionModelo tEncontrado = aOptional.get();
               traccRegionRepository.deleteById(tEncontrado.getIdtraccion());
               return new ResponseEntity<>(tEncontrado, HttpStatus.FOUND);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
}
