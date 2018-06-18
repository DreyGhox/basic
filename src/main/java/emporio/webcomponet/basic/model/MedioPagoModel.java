/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import java.util.ArrayList;

/**
 *
 * @author Drako
 */
public class MedioPagoModel {

    private int idmediopago;
    private String nombremediopago;
    private String detalle;

    public static ArrayList<MedioPagoModel> pago = new ArrayList<>();

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

    public MedioPagoModel() {
    }

    public MedioPagoModel(String nombremediopago, String detalle) {
        this.nombremediopago = nombremediopago;
        this.detalle = detalle;
    }

    private MedioPagoModel(int idmediopago, String nombremediopago, String detalle) {
        this.idmediopago = idmediopago;
        this.nombremediopago = nombremediopago;
        this.detalle = detalle;
    }

    public boolean nuevaMedioPago(MedioPagoModel nuevoMedioPago) {

        int id = 0;

        if (!pago.isEmpty()) {

            for (MedioPagoModel medio : pago) {
                if (medio.getIdmediopago() > id) {

                }
            }
        }
        id++;

        pago.add(new MedioPagoModel(id, nuevoMedioPago.getNombremediopago(), nuevoMedioPago.getDetalle()));

        return true;
    }

    public MedioPagoModel buscarMedioPago(int idMedioPagoBuscado) {

        MedioPagoModel medioencontrado = null;

        if (!pago.isEmpty()) {
            for (MedioPagoModel medio : pago) {
                if (medio.getIdmediopago() == idMedioPagoBuscado) {
                }
            }
        }
        return medioencontrado;
    }

    public MedioPagoModel editarMedioPago(int idmedio, MedioPagoModel mediopagoEditar) {

        MedioPagoModel medioencontrado = null;
        if (!pago.isEmpty()) {
            for (MedioPagoModel medio : pago) {
                if (medio.getIdmediopago() == idmedio);{
                medio.setNombremediopago(mediopagoEditar.getNombremediopago());
                medio.setDetalle(mediopagoEditar.getDetalle());

                medioencontrado = medio;
            }
        }
    
    }

    return medioencontrado;
}
    
    public boolean eliminarMedioPago(int id){
        
         MedioPagoModel medioPagoEliminada = null;
        
        if(!pago.isEmpty()){
            for(MedioPagoModel medio : pago){
                if(medio.getIdmediopago()== idmediopago){
                    medioPagoEliminada = medio;
                }
            }
        }
        pago.remove(medioPagoEliminada);
        
        return true;
    }
}