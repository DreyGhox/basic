/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.MarcaModelo;
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
public class MarcaController {
    
    @GetMapping()
    public ArrayList<MarcaModelo> list() {
       
        return MarcaModelo.marcas;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
       MarcaModelo marca = new MarcaModelo();
        return marca.buscarMarca(Integer.parseInt(id));
                
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody MarcaModelo marcaEditar) {
         MarcaModelo marca = new MarcaModelo();
         
        return new ResponseEntity<>(marca.editarMarca(Integer.parseInt(id), marcaEditar),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody MarcaModelo nuevaMarca) {
        MarcaModelo marca = new MarcaModelo();
        if(marca.nuevaMarca(nuevaMarca)){
        return new ResponseEntity<>(HttpStatus.CREATED);
        }else{
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
      MarcaModelo marca = new MarcaModelo();
      if(marca.eliminarMarca(Integer.parseInt(id))){
       return new ResponseEntity<>(HttpStatus.OK);
      }else{
       return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
      }
        
    }
    
}
