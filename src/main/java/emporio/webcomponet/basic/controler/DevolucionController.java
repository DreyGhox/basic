/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.DevolucionModelo;
import emporio.webcomponet.basic.repository.DevolucionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/Devolucion")
public class DevolucionController {
    
    
    @Autowired
    private DevolucionRepository devolucionRepository;
    
    @GetMapping()
    public Iterable<DevolucionModelo> list(){
        return devolucionRepository.findAll();
    }
    
        @GetMapping("/{id}")
    public ResponseEntity<DevolucionModelo> get(@PathVariable String id) {
        Optional<DevolucionModelo> aOptional = devolucionRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            DevolucionModelo dEncontrado = aOptional.get();
            return new ResponseEntity<>(dEncontrado, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<DevolucionModelo> put(@PathVariable String id, @RequestBody DevolucionModelo editarDevolucion) {
        Optional<DevolucionModelo> aOptional = devolucionRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            DevolucionModelo dEncontrado = aOptional.get();
            editarDevolucion.setIdDevolucion(dEncontrado.getIdDevolucion());
            devolucionRepository.save(editarDevolucion);
            return new ResponseEntity<>(editarDevolucion, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody DevolucionModelo nuevaDevolucion) {
        nuevaDevolucion = devolucionRepository.save(nuevaDevolucion);
        Optional<DevolucionModelo> aOptional = devolucionRepository.findById(nuevaDevolucion.getIdDevolucion());
        
        if(aOptional.isPresent()){
            DevolucionModelo dEncontrado = aOptional.get();
            return new ResponseEntity<>(dEncontrado, HttpStatus.CREATED);
    }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      Optional<DevolucionModelo> aOptional = devolucionRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            DevolucionModelo dEncontrado = aOptional.get();
            devolucionRepository.deleteById(dEncontrado.getIdDevolucion());
            return new ResponseEntity<>(dEncontrado, HttpStatus.OK);
    }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
}
