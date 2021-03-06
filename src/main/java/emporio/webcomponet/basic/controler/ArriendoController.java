/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.ArriendoModelo;
import emporio.webcomponet.basic.repository.ArriendoRepository;
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
@RequestMapping("/Arriendo")
public class ArriendoController {
    
    @Autowired
    private ArriendoRepository arriendoRepository;
    
    @GetMapping()
    public Iterable<ArriendoModelo> list(){
        return arriendoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ArriendoModelo> get(@PathVariable String id) {
        Optional<ArriendoModelo> aOptional = arriendoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            ArriendoModelo aEncontrado = aOptional.get();
            return new ResponseEntity<>(aEncontrado, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ArriendoModelo> put(@PathVariable String id, @RequestBody ArriendoModelo editarArriendo) {
        Optional<ArriendoModelo> aOptional = arriendoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            ArriendoModelo aEncontrado = aOptional.get();
            editarArriendo.setIdArriendo(aEncontrado.getIdArriendo());
            arriendoRepository.save(editarArriendo);
            return new ResponseEntity<>(editarArriendo, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody ArriendoModelo nuevoArriendo) {
        nuevoArriendo = arriendoRepository.save(nuevoArriendo);
        Optional<ArriendoModelo> aOptional = arriendoRepository.findById(nuevoArriendo.getIdArriendo());
        
        if(aOptional.isPresent()){
            ArriendoModelo aEncontrado = aOptional.get();
            return new ResponseEntity<>(aEncontrado, HttpStatus.CREATED);
    }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      Optional<ArriendoModelo> aOptional = arriendoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            ArriendoModelo aEncontrado = aOptional.get();
            arriendoRepository.deleteById(aEncontrado.getIdArriendo());
            return new ResponseEntity<>(aEncontrado, HttpStatus.OK);
    }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
