/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;
import emporio.webcomponet.basic.model.CiudadModelo;
import emporio.webcomponet.basic.repository.CiudadRepository;
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
@RequestMapping("/Ciudad")
public class CiudadController {
    
    @Autowired
    private CiudadRepository ciudadRepository;
    
    @GetMapping()
    public Iterable<CiudadModelo> list() {
        
        return ciudadRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CiudadModelo> get(@PathVariable String id) {
           
        Optional<CiudadModelo> aOptional = ciudadRepository.findById(Integer.parseInt(id));
        
            if (aOptional.isPresent()){
                CiudadModelo cEncontrado = aOptional.get();
                return new ResponseEntity<>(cEncontrado, HttpStatus.FOUND);
                
            }else{
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<CiudadModelo> put(@PathVariable String id, @RequestBody CiudadModelo ciudadEditar) {
        Optional<CiudadModelo> aOptional = ciudadRepository.findById(Integer.parseInt(id));
        
            if(aOptional.isPresent()){
                CiudadModelo cEncontrado = aOptional.get();
                ciudadEditar.setIdciudad(cEncontrado.getIdciudad());
                ciudadRepository.save(ciudadEditar);
                return new ResponseEntity<>(ciudadEditar, HttpStatus.OK);
            }else{
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody CiudadModelo nuevaCiudad) {
        nuevaCiudad = ciudadRepository.save(nuevaCiudad);
        Optional<CiudadModelo> aOptional = ciudadRepository.findById(nuevaCiudad.getIdciudad());
        
            if(aOptional.isPresent()){
                CiudadModelo cEncontrado = aOptional.get();
                return new ResponseEntity<>(cEncontrado, HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
            }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
       Optional<CiudadModelo> aOptional = ciudadRepository.findById(Integer.parseInt(id));
       
            
                if (aOptional.isPresent()){
                    CiudadModelo cEncontrado = aOptional.get();
                    ciudadRepository.deleteById(cEncontrado.getIdciudad());
                    return new ResponseEntity<>(cEncontrado, HttpStatus.OK);
                }else{
                    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
                }
       
    }
    
}
