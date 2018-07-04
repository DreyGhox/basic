/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.VehiculoModelo;
import emporio.webcomponet.basic.repository.VehiculoRepository;
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
@RequestMapping("/Vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoRepository vehiculoRepository;
    
    @GetMapping()
    public Iterable<VehiculoModelo> list(){
        return vehiculoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<VehiculoModelo> get(@PathVariable String id) {
        Optional<VehiculoModelo> aOptional = vehiculoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            VehiculoModelo vEncontrado = aOptional.get();
            return new ResponseEntity<>(vEncontrado, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<VehiculoModelo> put(@PathVariable String id, @RequestBody VehiculoModelo editarVehiculo) {
        Optional<VehiculoModelo> aOptional = vehiculoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            VehiculoModelo vEncontrado = aOptional.get();
            editarVehiculo.setIdVehiculo(vEncontrado.getIdVehiculo());
            vehiculoRepository.save(editarVehiculo);
            return new ResponseEntity<>(editarVehiculo, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody VehiculoModelo nuevoVehiculo) {
        nuevoVehiculo = vehiculoRepository.save(nuevoVehiculo);
        Optional<VehiculoModelo> aOptional = vehiculoRepository.findById(nuevoVehiculo.getIdVehiculo());
        
        if(aOptional.isPresent()){
            VehiculoModelo vEncontrado = aOptional.get();
            return new ResponseEntity<>(vEncontrado, HttpStatus.CREATED);
    }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      Optional<VehiculoModelo> aOptional = vehiculoRepository.findById(Integer.parseInt(id));
        
        if(aOptional.isPresent()){
            VehiculoModelo vEncontrado = aOptional.get();
            vehiculoRepository.deleteById(vEncontrado.getIdVehiculo());
            return new ResponseEntity<>(vEncontrado, HttpStatus.OK);
    }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    
}
