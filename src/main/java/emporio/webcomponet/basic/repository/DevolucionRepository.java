/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.repository;

import emporio.webcomponet.basic.model.DevolucionModelo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author chard
 */
public interface DevolucionRepository extends CrudRepository<DevolucionModelo, Integer> {
    
}
