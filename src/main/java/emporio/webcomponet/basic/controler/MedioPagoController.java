/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.MedioPagoModelo;
import emporio.webcomponet.basic.repository.MedioPagoRepository;
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
@RequestMapping("/MedioPago")
public class MedioPagoController {
      
    @Autowired
    private MedioPagoRepository medioPagoRepository;
    
    @GetMapping()
    public Iterable<MedioPagoModelo> list(){
        return medioPagoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<MedioPagoModelo> get(@PathVariable String id) {
        Optional<MedioPagoModelo> aOptional = medioPagoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            MedioPagoModelo mpEncontrado = aOptional.get();
            return new ResponseEntity<>(mpEncontrado, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<MedioPagoModelo> put(@PathVariable String id, @RequestBody MedioPagoModelo medioPagoEditar) {
        Optional<MedioPagoModelo> aOptional = medioPagoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            MedioPagoModelo mpEncontrado = aOptional.get();
            medioPagoEditar.setIdmediopago(mpEncontrado.getIdmediopago());
            medioPagoRepository.save(medioPagoEditar);
            return new ResponseEntity<>(medioPagoEditar, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody MedioPagoModelo nuevoMedioPago) {
        nuevoMedioPago = medioPagoRepository.save(nuevoMedioPago);
        Optional<MedioPagoModelo> aOptional = medioPagoRepository.findById(nuevoMedioPago.getIdmediopago());
        
        if(aOptional.isPresent()){
           MedioPagoModelo mpEncontrado = aOptional.get();
           return new ResponseEntity<>(mpEncontrado, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        Optional<MedioPagoModelo> aOptional = medioPagoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            MedioPagoModelo mpEncontrado = aOptional.get();
            medioPagoRepository.deleteById(mpEncontrado.getIdmediopago());
            return new ResponseEntity<>(mpEncontrado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
}
