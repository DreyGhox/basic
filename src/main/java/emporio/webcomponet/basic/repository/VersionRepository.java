/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.repository;

import emporio.webcomponet.basic.model.VersionModelo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jhimta
 */
public interface VersionRepository extends CrudRepository<VersionModelo, Integer> {
    
}
