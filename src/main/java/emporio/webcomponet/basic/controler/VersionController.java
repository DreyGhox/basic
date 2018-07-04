/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.VersionModelo;
import emporio.webcomponet.basic.repository.VersionRepository;
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
@RequestMapping("/Version")
public class VersionController {
    
    @Autowired
    private VersionRepository versionRepository;
    
    @GetMapping()
    public Iterable<VersionModelo> list(){
        return versionRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<VersionModelo> get(@PathVariable String id) {
        Optional<VersionModelo> aOptional = versionRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            VersionModelo veEncontrado = aOptional.get();
            return new ResponseEntity<>(veEncontrado, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<VersionModelo> put(@PathVariable String id, @RequestBody VersionModelo editarVersion) {
        Optional<VersionModelo> aOptional = versionRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            VersionModelo veEncontrado = aOptional.get();
            editarVersion.setIdversion(veEncontrado.getIdversion());
            versionRepository.save(editarVersion);
            return new ResponseEntity<>(editarVersion, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody VersionModelo nuevaVersion) {
        nuevaVersion = versionRepository.save(nuevaVersion);
        Optional<VersionModelo> aOptional = versionRepository.findById(nuevaVersion.getIdversion());
        
        if(aOptional.isPresent()){
            VersionModelo veEncontrado = aOptional.get();
            return new ResponseEntity<>(veEncontrado, HttpStatus.CREATED);
    }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      Optional<VersionModelo> aOptional = versionRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            VersionModelo veEncontrado = aOptional.get();
            versionRepository.deleteById(veEncontrado.getIdversion());
            return new ResponseEntity<>(veEncontrado, HttpStatus.OK);
    }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
}
