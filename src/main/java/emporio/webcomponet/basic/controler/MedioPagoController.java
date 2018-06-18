/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.MedioPagoModel;
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
public class MedioPagoController {
    
    @GetMapping()
    public ArrayList<MedioPagoModel> list() {
        return MedioPagoModel.pago;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        
        MedioPagoModel medio = new MedioPagoModel();
        
        return medio.buscarMedioPago(Integer.parseInt(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody MedioPagoModel medioPagoEditar) {
        MedioPagoModel medio = new MedioPagoModel();
        
        return new ResponseEntity<>(medio.editarMedioPago(Integer.parseInt(id), medioPagoEditar),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody MedioPagoModel nuevoMedioPago) {
        MedioPagoModel medio = new MedioPagoModel();
        
        if(medio.nuevaMedioPago(nuevoMedioPago)){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
       MedioPagoModel medio = new MedioPagoModel();
       
       if(medio.eliminarMedioPago(Integer.parseInt(id))){
       return new ResponseEntity<>(HttpStatus.OK);
       }else{
       return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
       }
    }
    
}
