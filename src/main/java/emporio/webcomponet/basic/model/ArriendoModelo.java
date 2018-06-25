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

 
    private int idVersion;
    private String nombre;
    private String detalle;
    private int puerta;
    private int pasajeros;
    private float cilindrada;
    private float rendidmiento;
    private int capacidadMaletero;
    private int airbag;
    private boolean aireAcondicionado;
    private boolean cierreCentralizado;
    private boolean alzaVidriosElectricos;
    private boolean camaraRetroceso;
    private CombustibleModelo Combustible;
    private CarroceriaModelo Carroceria;
    private TransmisionModelo Transmision;
    private TraccionModelo Traccion;
    private ModeloModelo Modelo;

    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
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

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public float getRendidmiento() {
        return rendidmiento;
    }

    public void setRendidmiento(float rendidmiento) {
        this.rendidmiento = rendidmiento;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getAirbag() {
        return airbag;
    }

    public void setAirbag(int airbag) {
        this.airbag = airbag;
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
        return Combustible;
    }

    public void setCombustible(CombustibleModelo Combustible) {
        this.Combustible = Combustible;
    }

    public CarroceriaModelo getCarroceria() {
        return Carroceria;
    }

    public void setCarroceria(CarroceriaModelo Carroceria) {
        this.Carroceria = Carroceria;
    }

    public TransmisionModelo getTransmision() {
        return Transmision;
    }

    public void setTransmision(TransmisionModelo Transmision) {
        this.Transmision = Transmision;
    }

    public TraccionModelo getTraccion() {
        return Traccion;
    }

    public void setTraccion(TraccionModelo Traccion) {
        this.Traccion = Traccion;
    }

    public ModeloModelo getModelo() {
        return Modelo;
    }

    public void setModelo(ModeloModelo Modelo) {
        this.Modelo = Modelo;
    }

    public ArriendoModelo(String nombre, String detalle, int puerta, int pasajeros, float cilindrada, float rendidmiento, int capacidadMaletero, int airbag, boolean aireAcondicionado, boolean cierreCentralizado, boolean alzaVidriosElectricos, boolean camaraRetroceso, CombustibleModelo Combustible, CarroceriaModelo Carroceria, TransmisionModelo Transmision, TraccionModelo Traccion, ModeloModelo Modelo) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.puerta = puerta;
        this.pasajeros = pasajeros;
        this.cilindrada = cilindrada;
        this.rendidmiento = rendidmiento;
        this.capacidadMaletero = capacidadMaletero;
        this.airbag = airbag;
        this.aireAcondicionado = aireAcondicionado;
        this.cierreCentralizado = cierreCentralizado;
        this.alzaVidriosElectricos = alzaVidriosElectricos;
        this.camaraRetroceso = camaraRetroceso;
        this.Combustible = Combustible;
        this.Carroceria = Carroceria;
        this.Transmision = Transmision;
        this.Traccion = Traccion;
        this.Modelo = Modelo;
    }

    private ArriendoModelo(int idVersion, String nombre, String detalle, int puerta, int pasajeros, float cilindrada, float rendidmiento, int capacidadMaletero, int airbag, boolean aireAcondicionado, boolean cierreCentralizado, boolean alzaVidriosElectricos, boolean camaraRetroceso, CombustibleModelo Combustible, CarroceriaModelo Carroceria, TransmisionModelo Transmision, TraccionModelo Traccion, ModeloModelo Modelo) {
        this.idVersion = idVersion;
        this.nombre = nombre;
        this.detalle = detalle;
        this.puerta = puerta;
        this.pasajeros = pasajeros;
        this.cilindrada = cilindrada;
        this.rendidmiento = rendidmiento;
        this.capacidadMaletero = capacidadMaletero;
        this.airbag = airbag;
        this.aireAcondicionado = aireAcondicionado;
        this.cierreCentralizado = cierreCentralizado;
        this.alzaVidriosElectricos = alzaVidriosElectricos;
        this.camaraRetroceso = camaraRetroceso;
        this.Combustible = Combustible;
        this.Carroceria = Carroceria;
        this.Transmision = Transmision;
        this.Traccion = Traccion;
        this.Modelo = Modelo;
    }
    
    

   

   
      
}
