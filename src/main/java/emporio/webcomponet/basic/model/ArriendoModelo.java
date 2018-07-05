/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import java.sql.Time;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jhimta
 */

@Entity
@Table (name = "Arriendo")
public class ArriendoModelo {

 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArriendo;
    private Date fechaArriendo;
    private Time horaArriendo;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private PersonaModelo vendedor;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private PersonaModelo cliente;
    @OneToOne
    @JoinColumn(name = "id_vehiculo")
    private VehiculoModelo vehiculo;
    
    private MedioPagoModelo medioPago;

    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
    }

    public Date getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(Date fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public Time getHoraArriendo() {
        return horaArriendo;
    }

    public void setHoraArriendo(Time horaArriendo) {
        this.horaArriendo = horaArriendo;
    }

    public PersonaModelo getVendedor() {
        return vendedor;
    }

    public void setVendedor(PersonaModelo vendedor) {
        this.vendedor = vendedor;
    }

    public VehiculoModelo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoModelo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public MedioPagoModelo getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(MedioPagoModelo medioPago) {
        this.medioPago = medioPago;
    }

    private ArriendoModelo(int idArriendo, Date fechaArriendo, Time horaArriendo, PersonaModelo vendedor, PersonaModelo cliente, VehiculoModelo vehiculo, MedioPagoModelo medioPago) {
        this.idArriendo = idArriendo;
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.medioPago = medioPago;
    }
    
    
    public ArriendoModelo(Date fechaArriendo, Time horaArriendo, PersonaModelo vendedor, PersonaModelo cliente, VehiculoModelo vehiculo, MedioPagoModelo medioPago) {
        this.fechaArriendo = fechaArriendo;
        this.horaArriendo = horaArriendo;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.medioPago = medioPago;
    }

    public ArriendoModelo() {
    }
    
    
    
}
