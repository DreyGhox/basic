/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.TipoPersonaModelo;
import emporio.webcomponet.basic.repository.TipoPersonaRepository;

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
 * @author Jhimta
 */
@RestController
@RequestMapping("/TipoPersona")
public class TipoPersonaController {
    
    @Autowired
    private TipoPersonaRepository tipoPersonaRepository;
    
    @GetMapping()
    public Iterable<TipoPersonaModelo> list(){
        return tipoPersonaRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TipoPersonaModelo> get(@PathVariable String id) {
        Optional<TipoPersonaModelo> aOptional = tipoPersonaRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            TipoPersonaModelo tEncontrado = aOptional.get();
            return new ResponseEntity<>(tEncontrado, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<TipoPersonaModelo> put(@PathVariable String id, @RequestBody TipoPersonaModelo tipoPersonaEditar) {
                Optional<TipoPersonaModelo> aOptional = tipoPersonaRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
          TipoPersonaModelo tEncontrado = aOptional.get();
          tipoPersonaEditar.setIdPersona(tEncontrado.getIdPersona());
          tipoPersonaRepository.save(tipoPersonaEditar);
          return new ResponseEntity<>(tipoPersonaEditar, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody TipoPersonaModelo nuevoTipoPersona) {
        nuevoTipoPersona = tipoPersonaRepository.save(nuevoTipoPersona);
        Optional<TipoPersonaModelo> aOptional = tipoPersonaRepository.findById(nuevoTipoPersona.getIdPersona());
        
        if(aOptional.isPresent()){
            TipoPersonaModelo tEncontrado = aOptional.get();
            return new ResponseEntity<>(tEncontrado, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        Optional<TipoPersonaModelo> aOptional = tipoPersonaRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            TipoPersonaModelo tEncontrado = aOptional.get();
            tipoPersonaRepository.deleteById(tEncontrado.getIdPersona());
            return new ResponseEntity<>(tEncontrado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
}
