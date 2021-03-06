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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/**
 *
 * @author Drako
 */
@Entity
@Table(name = "Version")
public class VersionModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idversion;
    private String nombre;
    private String detalle;
    private int puertas;
    private int pasajero;
    private float cilindrada;
    private float rendimiento;
    private int capacidadMaletero;
    private int airbags;
    private boolean aireAcondicionado;
    private boolean cierreCentralizado;
    private boolean alzaVidriosElectricos;
    private boolean camaraRetroceso;
    @OneToOne
    @JoinColumn (name ="id_combustible")
    private CombustibleModelo combustible;
    @OneToOne
    @JoinColumn (name = "id_carroceria")
    private CarroceriaModelo carroceria;
    @OneToOne
    @JoinColumn (name = "id_transmision")
    private TransmisionModelo transmision;
    @OneToOne
    @JoinColumn (name = "id_traccion")
    private TraccionModelo traccion;
    @OneToOne
    @JoinColumn (name = "id_modelo")
    private ModeloModelo modelo;
    
    

    public VersionModelo(int id, String nombre1, String detalle1, int airbags1, int capacidadMaletero1, float cilindrada1, int pasajero1, int puertas1, CarroceriaModelo carroceria1, CombustibleModelo combustible1, ModeloModelo modelo1, float rendimiento1, TraccionModelo traccion1, TransmisionModelo transmision1) {
    }

    public VersionModelo(String nombre, String detalle, int puertas, int pasajero, float cilindrada, float rendimiento, int capacidadMaletero, int airbags, boolean aireAcondicionado, boolean cierreCentralizado, boolean alzaVidriosElectricos, boolean camaraRetroceso, CombustibleModelo combustible, CarroceriaModelo carroceria, TransmisionModelo transmision, TraccionModelo traccion, ModeloModelo modelo) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.puertas = puertas;
        this.pasajero = pasajero;
        this.cilindrada = cilindrada;
        this.rendimiento = rendimiento;
        this.capacidadMaletero = capacidadMaletero;
        this.airbags = airbags;
        this.aireAcondicionado = aireAcondicionado;
        this.cierreCentralizado = cierreCentralizado;
        this.alzaVidriosElectricos = alzaVidriosElectricos;
        this.camaraRetroceso = camaraRetroceso;
        this.combustible = combustible;
        this.carroceria = carroceria;
        this.transmision = transmision;
        this.traccion = traccion;
        this.modelo = modelo;
    }
    
    private VersionModelo(int idversion, String nombre, String detalle, int puertas, int pasajero, float cilindrada, float rendimiento, int capacidadMaletero, int airbags, boolean aireAcondicionado, boolean cierreCentralizado, boolean alzaVidriosElectricos, boolean camaraRetroceso, CombustibleModelo combustible, CarroceriaModelo carroceria, TransmisionModelo transmision, TraccionModelo traccion, ModeloModelo modelo) {
        this.idversion = idversion;
        this.nombre = nombre;
        this.detalle = detalle;
        this.puertas = puertas;
        this.pasajero = pasajero;
        this.cilindrada = cilindrada;
        this.rendimiento = rendimiento;
        this.capacidadMaletero = capacidadMaletero;
        this.airbags = airbags;
        this.aireAcondicionado = aireAcondicionado;
        this.cierreCentralizado = cierreCentralizado;
        this.alzaVidriosElectricos = alzaVidriosElectricos;
        this.camaraRetroceso = camaraRetroceso;
        this.combustible = combustible;
        this.carroceria = carroceria;
        this.transmision = transmision;
        this.traccion = traccion;
        this.modelo = modelo;
    }

    public int getIdversion() {
        return idversion;
    }

    public void setIdversion(int idversion) {
        this.idversion = idversion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCierreCentralizado() {
        return cierreCentralizado;
    }

    public void setCierreCentralizado(boolean cierreCentralizado) {
        this.cierreCentralizado = cierreCentralizado;
    }

    public boolean isAlzaVidriosElectricos() {
        return alzaVidriosElectricos;
    }

    public void setAlzaVidriosElectricos(boolean alzaVidriosElectricos) {
        this.alzaVidriosElectricos = alzaVidriosElectricos;
    }

    public boolean isCamaraRetroceso() {
        return camaraRetroceso;
    }

    public void setCamaraRetroceso(boolean camaraRetroceso) {
        this.camaraRetroceso = camaraRetroceso;
    }

    public CombustibleModelo getCombustible() {
        return combustible;
    }

    public void setCombustible(CombustibleModelo combustible) {
        this.combustible = combustible;
    }

    public CarroceriaModelo getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(CarroceriaModelo carroceria) {
        this.carroceria = carroceria;
    }

    public TransmisionModelo getTransmision() {
        return transmision;
    }

    public void setTransmision(TransmisionModelo transmision) {
        this.transmision = transmision;
    }

    public TraccionModelo getTraccion() {
        return traccion;
    }

    public void setTraccion(TraccionModelo traccion) {
        this.traccion = traccion;
    }

    public ModeloModelo getModelo() {
        return modelo;
    }

    public void setModelo(ModeloModelo modelo) {
        this.modelo = modelo;
    }
    
    
   
}
