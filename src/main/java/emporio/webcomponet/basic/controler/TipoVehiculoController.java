/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.TipoVehiculoModelo;
import emporio.webcomponet.basic.repository.TipoVehiculoRepository;
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
@RequestMapping("/TipoVehiculo")
public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;
    
     @GetMapping()
    public Iterable<TipoVehiculoModelo> list(){
        return tipoVehiculoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TipoVehiculoModelo> get(@PathVariable String id) {
        Optional<TipoVehiculoModelo> aOptional = tipoVehiculoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
          TipoVehiculoModelo vEncontrado = aOptional.get();
          return new ResponseEntity<>(vEncontrado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<TipoVehiculoModelo> put(@PathVariable String id, @RequestBody TipoVehiculoModelo tipoVehiculoEditar) {
        Optional<TipoVehiculoModelo> aOptional = tipoVehiculoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
          TipoVehiculoModelo vEncontrado = aOptional.get();
          tipoVehiculoEditar.setIdvehiculo(vEncontrado.getIdvehiculo());
          tipoVehiculoRepository.save(tipoVehiculoEditar);
          return new ResponseEntity<>(tipoVehiculoEditar, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody TipoVehiculoModelo nuevoTipoVehiculo) {
        nuevoTipoVehiculo = tipoVehiculoRepository.save(nuevoTipoVehiculo);
        Optional<TipoVehiculoModelo> aOptional = tipoVehiculoRepository.findById(nuevoTipoVehiculo.getIdvehiculo());
        
        if(aOptional.isPresent()){
           TipoVehiculoModelo vEncontrado = aOptional.get();
           return new ResponseEntity<>(vEncontrado, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }
     
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        Optional<TipoVehiculoModelo> aOptional = tipoVehiculoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            TipoVehiculoModelo vEncontrado = aOptional.get();
            tipoVehiculoRepository.deleteById(vEncontrado.getIdvehiculo());
            return new ResponseEntity<>(vEncontrado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
