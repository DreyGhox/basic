/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.repository;

import org.springframework.data.repository.CrudRepository;
import emporio.webcomponet.basic.model.CombustibleModelo;

/**
 *
 * @author Administrador
 */
public interface CombustibleRepository extends CrudRepository<CombustibleModelo, Integer> {
    
}
