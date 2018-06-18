/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.TipoPersonaModelo;
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
public class TipoPersonaController {
    
    @GetMapping()
    public ArrayList<TipoPersonaModelo> list() {
        return TipoPersonaModelo.tipop;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        TipoPersonaModelo tip = new TipoPersonaModelo();
        
        return tip.buscarTipop(Integer.parseInt(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody TipoPersonaModelo tipoPersonaEditar) {
        TipoPersonaModelo tip = new TipoPersonaModelo();


        return new ResponseEntity<>(tip.editarTipo(Integer.parseInt(id), tipoPersonaEditar),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody TipoPersonaModelo nuevoTipoPersona) {
        TipoPersonaModelo tip = new TipoPersonaModelo();
        
        if(tip.nuevoTipoPersona(nuevoTipoPersona)){
        return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
     
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        TipoPersonaModelo tip = new TipoPersonaModelo();
        
        if(tip.eliminarTipo(Integer.parseInt(id))){
        return new ResponseEntity<>(HttpStatus.CREATED);
        
        }else{
        return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }
    
}
