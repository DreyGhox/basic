/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.PersonaModelo;
import emporio.webcomponet.basic.repository.PesonaRepository;
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
 * @author Drako
 */
@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PesonaRepository personaRepository;
    
    @GetMapping()
    public Iterable<PersonaModelo> list() {
        return personaRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        Optional<PersonaModelo> aOptional = personaRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               PersonaModelo tEncontrado = aOptional.get();
               return new ResponseEntity<>(tEncontrado, HttpStatus.FOUND);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody PersonaModelo personaEditar ) {
        Optional<PersonaModelo> aOptional = personaRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               PersonaModelo tEncontrado = aOptional.get();
               personaEditar.setIdPersona(tEncontrado.getIdPersona());
               personaRepository.save(personaEditar);
               return new ResponseEntity<>(personaEditar, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody PersonaModelo nuevaPersona) {
         Optional<PersonaModelo> aOptional = personaRepository.findById(nuevaPersona.getIdPersona());
                
               if (aOptional.isPresent()){
               PersonaModelo tEncontrado = aOptional.get();
               return new ResponseEntity<>(tEncontrado, HttpStatus.CREATED);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
               }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      Optional<PersonaModelo> aOptional = personaRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               PersonaModelo tEncontrado = aOptional.get();
               personaRepository.deleteById(tEncontrado.getIdPersona());
               return new ResponseEntity<>(tEncontrado, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
}
