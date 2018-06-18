/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.RegionModelo;
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
public class RegionController {
    
       @GetMapping()
    public ArrayList<RegionModelo> listar() {
        return RegionModelo.region;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        
        RegionModelo regiones = new RegionModelo();
        
        
        return regiones.buscarRegion(Integer.parseInt(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<RegionModelo> editar(@PathVariable String id,@RequestBody RegionModelo regionEditar) {
        RegionModelo reg = new RegionModelo();
        
        
        
        return new ResponseEntity<>(reg.editarRegion(Integer.parseInt(id), regionEditar),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> agregar(@RequestBody RegionModelo nuevaRegion) {
         RegionModelo regiones = new RegionModelo();
         
        if (regiones.nuevaRegion(nuevaRegion)){
        return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
        
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        
        
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        RegionModelo regiones = new RegionModelo();
        
        if(regiones.eliminarRegion(Integer.parseInt(id))){
        return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
       
        
    }
    
}
