/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author Jhimta
 */

@Entity
@Table (name = "MedioPago")
public class MedioPagoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmediopago;
    private String nombremediopago;
    private String detalle;

    

    public int getIdmediopago() {
        return idmediopago;
    }

    public void setIdmediopago(int idmediopago) {
        this.idmediopago = idmediopago;
    }

    public String getNombremediopago() {
        return nombremediopago;
    }

    public void setNombremediopago(String nombremediopago) {
        this.nombremediopago = nombremediopago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MedioPagoModelo() {
    }

    public MedioPagoModelo(String nombremediopago, String detalle) {
        this.nombremediopago = nombremediopago;
        this.detalle = detalle;
    }

    private MedioPagoModelo(int idmediopago, String nombremediopago, String detalle) {
        this.idmediopago = idmediopago;
        this.nombremediopago = nombremediopago;
        this.detalle = detalle;
    }

   
}