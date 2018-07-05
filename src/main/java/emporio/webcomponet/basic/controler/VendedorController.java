/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.VendedorModelo;
import emporio.webcomponet.basic.repository.VendedorRepository;
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
@RequestMapping("/vendedor")
public class VendedorController {
    @Autowired
    private VendedorRepository vendedorRepository;
    
    @GetMapping()
    public Iterable<VendedorModelo> list() {
        return vendedorRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        Optional<VendedorModelo> aOptional = vendedorRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               VendedorModelo tEncontrado = aOptional.get();
               return new ResponseEntity<>(tEncontrado, HttpStatus.FOUND);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody VendedorModelo personaEditar ) {
        Optional<VendedorModelo> aOptional = vendedorRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               VendedorModelo tEncontrado = aOptional.get();
               personaEditar.setIdVendedor(tEncontrado.getIdVendedor());
               vendedorRepository.save(personaEditar);
               return new ResponseEntity<>(personaEditar, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody VendedorModelo nuevoVendedor) {
        nuevoVendedor = vendedorRepository.save(nuevoVendedor);
         Optional<VendedorModelo> aOptional = vendedorRepository.findById(nuevoVendedor.getIdVendedor());
                
               if (aOptional.isPresent()){
               VendedorModelo tEncontrado = aOptional.get();
               return new ResponseEntity<>(tEncontrado, HttpStatus.CREATED);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
               }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      Optional<VendedorModelo> aOptional = vendedorRepository.findById(Integer.parseInt(id));
                
               if (aOptional.isPresent()){
               VendedorModelo tEncontrado = aOptional.get();
               vendedorRepository.deleteById(tEncontrado.getIdVendedor());
               return new ResponseEntity<>(tEncontrado, HttpStatus.OK);
               }else{
                   return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
               }
    }
    
}

