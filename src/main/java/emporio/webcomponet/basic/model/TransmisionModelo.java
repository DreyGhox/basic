/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emporio.webcomponet.basic.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Drako
 */

@Entity
@Table (name = "Transmision")

public class TransmisionModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtransmision;
    private String nombretransmision;
    private String detalle;
    
    public static ArrayList<TransmisionModelo> trans = new ArrayList<>();

    public TransmisionModelo() {
    }
    
    public TransmisionModelo(String nombretransmision, String detalle) {
        this.nombretransmision = nombretransmision;
        this.detalle = detalle;
    }
    
    private TransmisionModelo(int idtransmision, String nombretransmision, String detalle) {
        this.idtransmision = idtransmision;
        this.nombretransmision = nombretransmision;
        this.detalle = detalle;
    }

    public int getIdtransmision() {
        return idtransmision;
    }

    public void setIdtransmision(int idtransmision) {
        this.idtransmision = idtransmision;
    }

    public String getNombretransmision() {
        return nombretransmision;
    }

    public void setNombretransmision(String nombretransmision) {
        this.nombretransmision = nombretransmision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
   
}

