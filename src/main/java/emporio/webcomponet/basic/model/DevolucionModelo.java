/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import java.sql.Time;
import java.util.Date;


/**
 *
 * @author Drako
 */
public class DevolucionModelo {
   
    private int idDevolucion;
    private Date fechaDevolucion;
    private Time horaDevolucion;
    private ArriendoModelo Arriendo;

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Time getHoraDevolucion() {
        return horaDevolucion;
    }

    public void setHoraDevolucion(Time horaDevolucion) {
        this.horaDevolucion = horaDevolucion;
    }

    public ArriendoModelo getArriendo() {
        return Arriendo;
    }

    public void setArriendo(ArriendoModelo Arriendo) {
        this.Arriendo = Arriendo;
    }

    public DevolucionModelo(Date fechaDevolucion, Time horaDevolucion, ArriendoModelo Arriendo) {
        this.fechaDevolucion = fechaDevolucion;
        this.horaDevolucion = horaDevolucion;
        this.Arriendo = Arriendo;
    }

    private DevolucionModelo(int idDevolucion, Date fechaDevolucion, Time horaDevolucion, ArriendoModelo Arriendo) {
        this.idDevolucion = idDevolucion;
        this.fechaDevolucion = fechaDevolucion;
        this.horaDevolucion = horaDevolucion;
        this.Arriendo = Arriendo;
    }
    
    
    
}
