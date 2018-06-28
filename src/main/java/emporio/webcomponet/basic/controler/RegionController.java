/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.RegionModelo;
import emporio.webcomponet.basic.repository.RegionRepository;
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
@RequestMapping("/Region")
public class RegionController {
    
       @Autowired
       private RegionRepository regionRepository;
       
       @GetMapping()
    public Iterable<RegionModelo> listar() {
        return regionRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<RegionModelo> get(@PathVariable String id) {
        Optional<RegionModelo> aOptional = regionRepository.findById(Integer.parseInt(id));
        
                if(aOptional.isPresent()){
                    RegionModelo rEncontrado = aOptional.get();
                    return new ResponseEntity<>(rEncontrado, HttpStatus.FOUND);
                }else{
                    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
                }
       
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<RegionModelo> editar(@PathVariable String id,@RequestBody RegionModelo regionEditar) {
            Optional<RegionModelo> aOptional = regionRepository.findById(Integer.parseInt(id));
            
                if (aOptional.isPresent()){
                    RegionModelo rEncontrado = aOptional.get();
                    regionEditar.setIdregion(rEncontrado.getIdregion());
                    regionRepository.save(regionEditar);
                    return new ResponseEntity<>(regionEditar, HttpStatus.OK);
                }else{
                    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
                }
 
    }
    
    @PostMapping
    public ResponseEntity<?> agregar(@RequestBody RegionModelo nuevaRegion) {
         
        nuevaRegion = regionRepository.save(nuevaRegion);
        Optional<RegionModelo> aOptional = regionRepository.findById(nuevaRegion.getIdregion());
        
                    if (aOptional.isPresent()){
                        RegionModelo rEncontrado = aOptional.get();
                        return new ResponseEntity<>(rEncontrado, HttpStatus.CREATED);
                    }else{
                        return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
                    }
        
        
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
       Optional<RegionModelo> aOptional = regionRepository.findById(Integer.parseInt(id));
       
                if(aOptional.isPresent()){
                    RegionModelo rEncontrado = aOptional.get();
                    regionRepository.deleteById(rEncontrado.getIdregion());
                    return new ResponseEntity<>(rEncontrado, HttpStatus.OK);
                }else{
                    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
                }
       
        
    }
    
}
