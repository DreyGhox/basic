/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.TransmisionModelo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import emporio.webcomponet.basic.repository.TransmisionRepository;
import java.util.Optional;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Drako
 */
@RestController
@RequestMapping("/url")
public class TransmisionController {
    @Autowired
    private TransmisionRepository transmisionRepository;
    
    @GetMapping()
    public Iterable<TransmisionModelo> list() {
        return transmisionRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TransmisionModelo> get(@PathVariable String id) {
        Optional<TransmisionModelo> aOptional = transmisionRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               TransmisionModelo tEncontrado = aOptional.get();
               return new ResponseEntity<>(tEncontrado, HttpStatus.FOUND);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<TransmisionModelo> put(@PathVariable String id, @RequestBody TransmisionModelo transmisionEditar) {
        Optional<TransmisionModelo> aOptional = transmisionRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               TransmisionModelo tEncontrado = aOptional.get();
               transmisionEditar.setIdtransmision(tEncontrado.getIdtransmision());
               transmisionRepository.save(transmisionEditar);
               return new ResponseEntity<>(transmisionEditar, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody TransmisionModelo nuevoTransmision) {
         nuevoTransmision = transmisionRepository.save(nuevoTransmision);
        Optional<TransmisionModelo> aOptional = transmisionRepository.findById(nuevoTransmision.getIdtransmision());
                
               if (aOptional.isPresent()){
               TransmisionModelo tEncontrado = aOptional.get();
               return new ResponseEntity<>(tEncontrado, HttpStatus.CREATED);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
               }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
         Optional<TransmisionModelo> aOptional = transmisionRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               TransmisionModelo tEncontrado = aOptional.get();
               transmisionRepository.deleteById(tEncontrado.getIdtransmision());
               return new ResponseEntity<>(tEncontrado, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
}
