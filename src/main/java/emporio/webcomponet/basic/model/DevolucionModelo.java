/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;
import java.util.Date;

/**
 *
 * @author Drako
 */
public class DevolucionModelo {
    private int iddevolucion;
    private int fechadevolucion;
    private int horadevolucion;
     private ArriendoModelo arriendo;

    public int getIddevolucion() {
        return iddevolucion;
    }

    public void setIddevolucion(int iddevolucion) {
        this.iddevolucion = iddevolucion;
    }

    public int getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(int fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public int getHoradevolucion() {
        return horadevolucion;
    }

    public void setHoradevolucion(int horadevolucion) {
        this.horadevolucion = horadevolucion;
    }

    public ArriendoModelo getArriendo() {
        return arriendo;
    }

    public void setArriendo(ArriendoModelo arriendo) {
        this.arriendo = arriendo;
    }

    public DevolucionModelo() {
    }

    public DevolucionModelo(int fechadevolucion, int horadevolucion, ArriendoModelo arriendo) {
        this.fechadevolucion = fechadevolucion;
        this.horadevolucion = horadevolucion;
        this.arriendo = arriendo;
    }

    private DevolucionModelo(int iddevolucion, int fechadevolucion, int horadevolucion, ArriendoModelo arriendo) {
        this.iddevolucion = iddevolucion;
        this.fechadevolucion = fechadevolucion;
        this.horadevolucion = horadevolucion;
        this.arriendo = arriendo;
    }
     
}
