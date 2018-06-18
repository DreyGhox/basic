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
public class VersionModelo {
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
    private CombustibleModelo combustible;
    private CarroceriaModelo carroceria;
    private TransmisionModelo transmision;
    private TraccionModelo traccion;
    private ModeloModelo modelo;
    
    public static ArrayList<VersionModelo> vers = new ArrayList<>();

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
    
    
    public boolean nuevaVersion(VersionModelo nuevaVersion){
        
        int id = 0;
        
        if(!vers.isEmpty()){
            for(VersionModelo ver : vers){
                if(ver.getIdversion() > id){
                    id = ver.getIdversion();
                }
            }
        }
        
        id++;
        
        vers.add(new VersionModelo(id, nuevaVersion.getNombre(), nuevaVersion.getDetalle(), nuevaVersion.getAirbags(), nuevaVersion.getCapacidadMaletero(), nuevaVersion.getCilindrada(), nuevaVersion.getPasajero(), nuevaVersion.getPuertas(), nuevaVersion.getCarroceria(),nuevaVersion.getCombustible(), nuevaVersion.getModelo(), nuevaVersion.getRendimiento(), nuevaVersion.getTraccion(), nuevaVersion.getTransmision()));
        return true;
    }
    
    public VersionModelo editarVersion(int idVersion, VersionModelo versionEditar){
        
        VersionModelo versionEditado = null;
        
        if(!vers.isEmpty()){
            for(VersionModelo ver : vers){
                if(ver.getIdversion() == idVersion){
                    ver.setNombre(versionEditar.getNombre());
                    ver.setDetalle(versionEditar.getDetalle());
                    ver.setAirbags(versionEditar.getAirbags());
                    ver.setCapacidadMaletero(versionEditar.getCapacidadMaletero());
                    ver.setCarroceria(versionEditar.getCarroceria());
                    ver.setCilindrada(versionEditar.getCilindrada());
                    ver.setCombustible(versionEditar.getCombustible());
                    ver.setModelo(versionEditar.getModelo());
                    ver.setPasajero(versionEditar.getPasajero());
                    ver.setPuertas(versionEditar.getPuertas());
                    ver.setRendimiento(versionEditar.getRendimiento());
                    ver.setTraccion(versionEditar.getTraccion());
                    ver.setTransmision(versionEditar.getTransmision());
                    
                    versionEditado = ver;
                }
            }
        }
        return versionEditado;
    }
    
    public boolean eliminarVersion(int id){
        
        VersionModelo versionEliminado = null;
        
        if(!vers.isEmpty()){
            for(VersionModelo ver : vers){
                if(ver.getIdversion() == idversion){
                    versionEliminado = ver;
                }
            }
        }
        
        vers.remove(versionEliminado);
        return true;
    }
}
