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
public class VehiculoModelo {
    
    private int idVehiculo;
    private String patente;
    private int valor;
    private int ano;
    private String color;
    private TipoVehiculoModelo tipoVehiculo;
    private VersionModelo version;

    public VehiculoModelo() {
    }
    
    public VehiculoModelo(String patente, int valor, int ano, String color, TipoVehiculoModelo tipoVehiculo, VersionModelo version) {
        this.patente = patente;
        this.valor = valor;
        this.ano = ano;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.version = version;
    }

    private VehiculoModelo(int idVehiculo, String patente, int valor, int ano, String color, TipoVehiculoModelo tipoVehiculo, VersionModelo version) {
        this.idVehiculo = idVehiculo;
        this.patente = patente;
        this.valor = valor;
        this.ano = ano;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.version = version;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculoModelo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculoModelo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public VersionModelo getVersion() {
        return version;
    }

    public void setVersion(VersionModelo version) {
        this.version = version;
    }
    
    
    
    
}
