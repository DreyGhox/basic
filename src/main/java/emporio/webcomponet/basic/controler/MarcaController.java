/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.MarcaModelo;
import emporio.webcomponet.basic.repository.MarcaRepository;
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
@RequestMapping("/url")
public class MarcaController {
    
    @Autowired
    private MarcaRepository marcarepository;
    
    
    
    @GetMapping()
    public Iterable<MarcaModelo> list() {
       
        return marcarepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<MarcaModelo> get(@PathVariable String id) {
       Optional<MarcaModelo> aOptional = marcarepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               MarcaModelo mEncontrado = aOptional.get();
               return new ResponseEntity<>(mEncontrado, HttpStatus.FOUND);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
                
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<MarcaModelo> put(@PathVariable String id, @RequestBody MarcaModelo marcaEditar) {
        Optional<MarcaModelo> aOptional = marcarepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               MarcaModelo mEncontrado = aOptional.get();
               marcaEditar.setIdmarca(mEncontrado.getIdmarca());
               marcarepository.save(marcaEditar);
               return new ResponseEntity<>(marcaEditar, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody MarcaModelo nuevaMarca) {
        nuevaMarca = marcarepository.save(nuevaMarca);
               Optional<MarcaModelo> aOptional = marcarepository.findById(nuevaMarca.getIdmarca());
                
               if (aOptional.isPresent()){
               MarcaModelo mEncontrado = aOptional.get();
               return new ResponseEntity<>(mEncontrado, HttpStatus.CREATED);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
               }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      Optional<MarcaModelo> aOptional = marcarepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               MarcaModelo mEncontrado = aOptional.get();
               return new ResponseEntity<>(mEncontrado, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
        
    }
    
}
