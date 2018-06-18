/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

/**
 *
 * @author Drako
 */
public class ArriendoModelo {

    private int idarriendo;
    private int fechaarriendo;
    private int horaarriendo;
    private PersonaModelo vendedor;
    private PersonaModelo cliente;
     private VehiculoModelo vehiculo;
      private MedioPagoModel mediopago;

    public int getIdarriendo() {
        return idarriendo;
    }

    public void setIdarriendo(int iddevolucion) {
        this.idarriendo = idarriendo;
    }

    public int getFechadevolucion() {
        return fechaarriendo;
    }

    public void setFechaarriendo(int fechaarriendo) {
        this.fechaarriendo = fechaarriendo;
    }

    public int getHoraarriendo() {
        return horaarriendo;
    }

    public void setHoraarriendo(int horadevolucion) {
        this.horaarriendo = horadevolucion;
    }

    public PersonaModelo getVendedor() {
        return vendedor;
    }

    public void setVendedor(PersonaModelo vendedor) {
        this.vendedor = vendedor;
    }

    public PersonaModelo getCliente() {
        return cliente;
    }

    public void setCliente(PersonaModelo cliente) {
        this.cliente = cliente;
    }

    public VehiculoModelo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoModelo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public MedioPagoModel getMediopago() {
        return mediopago;
    }

    public void setMediopago(MedioPagoModel mediopago) {
        this.mediopago = mediopago;
    }

    public ArriendoModelo() {
    }

    public ArriendoModelo(int fechaarriendo, int horaarriendo, PersonaModelo vendedor, PersonaModelo cliente, VehiculoModelo vehiculo, MedioPagoModel mediopago) {
        this.fechaarriendo = fechaarriendo;
        this.horaarriendo = horaarriendo;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.mediopago = mediopago;
    }

    private ArriendoModelo(int idarriendo, int fechaarriendo, int horaarriendo, PersonaModelo vendedor, PersonaModelo cliente, VehiculoModelo vehiculo, MedioPagoModel mediopago) {
        this.idarriendo = idarriendo;
        this.fechaarriendo = fechaarriendo;
        this.horaarriendo = horaarriendo;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.mediopago = mediopago;
    }
      
}
