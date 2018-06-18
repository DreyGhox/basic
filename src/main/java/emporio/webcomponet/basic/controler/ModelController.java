/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.controler;

import emporio.webcomponet.basic.model.ModeloModelo;
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
public class ModelController {

    @GetMapping()
    public ArrayList<ModeloModelo> list() {
        return ModeloModelo.modelo;
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        ModeloModelo mod = new ModeloModelo();
        return mod.buscarModelo(Integer.parseInt(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody ModeloModelo modeloEditar) {

        ModeloModelo mod = new ModeloModelo();
        return new ResponseEntity<>(mod.editarModelo(Integer.parseInt(id), modeloEditar), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody ModeloModelo nuevoModelo) {
        ModeloModelo mod = new ModeloModelo();
        if (mod.nuevaModelo(nuevoModelo)) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        ModeloModelo mod = new ModeloModelo();

        if (mod.eliminarModel(Integer.parseInt(id))) {
            return new ResponseEntity<>(HttpStatus.CREATED);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }

    }

}
