/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.TipoVehiculoModelo;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
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
public class TipoVehiculoController {
    
     @GetMapping()
    public ArrayList<TipoVehiculoModelo> list() {
        return TipoVehiculoModelo.tipos;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        TipoVehiculoModelo tipo = new TipoVehiculoModelo();
        
        return tipo.buscarVehiculo(Integer.parseInt(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody TipoVehiculoModelo tipoPersonaEditar) {
        TipoVehiculoModelo tipo = new TipoVehiculoModelo();


        return new ResponseEntity<>(tipo.editarTipo(Integer.parseInt(id), tipoPersonaEditar),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody TipoVehiculoModelo nuevoTipoVehiculo) {
        TipoVehiculoModelo tipo= new TipoVehiculoModelo();
        
        if(tipo.nuevoTipoVehiculo(nuevoTipoVehiculo)){
        return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
     
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        TipoVehiculoModelo tipo = new TipoVehiculoModelo();
        
        if(tipo.eliminarTipo(Integer.parseInt(id))){
        return new ResponseEntity<>(HttpStatus.CREATED);
        
        }else{
        return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }
}
