/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.ModeloModelo;
import emporio.webcomponet.basic.repository.ModeloRepository;
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
@RequestMapping("/Modelo")
public class ModeloController {

    @Autowired
    private ModeloRepository modeloRepository;
    
    @GetMapping()
    public Iterable<ModeloModelo> list(){
        return modeloRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModeloModelo> get(@PathVariable String id) {
        Optional<ModeloModelo> aOptional = modeloRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
          ModeloModelo mEncontrado = aOptional.get();
          return new ResponseEntity<>(mEncontrado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModeloModelo> put(@PathVariable String id, @RequestBody ModeloModelo modeloEditar) {
        Optional<ModeloModelo> aOptional = modeloRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            ModeloModelo mEncontrado = aOptional.get();
            modeloEditar.setIdmodelo(mEncontrado.getIdmodelo());
            modeloRepository.save(modeloEditar);
            return new ResponseEntity<>(modeloEditar, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody ModeloModelo nuevoModelo) {
        nuevoModelo = modeloRepository.save(nuevoModelo);
Optional<ModeloModelo> aOptional = modeloRepository.findById(nuevoModelo.getIdmodelo());
        
        if(aOptional.isPresent()){
          ModeloModelo mEncontrado = aOptional.get();
          return new ResponseEntity<>(mEncontrado, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        Optional<ModeloModelo> aOptional = modeloRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            ModeloModelo mEncontrado = aOptional.get();
            modeloRepository.deleteById(mEncontrado.getIdmodelo());
            return new ResponseEntity<>(mEncontrado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
