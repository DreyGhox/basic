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
public class ModeloModelo {
   private int idmodelo;
   private String nombremodelo;
   private String detalle;
   public MarcaModelo marca;

   
    public int getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(int idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getNombremodelo() {
        return nombremodelo;
    }

    public void setNombremodelo(String nombremodelo) {
        this.nombremodelo = nombremodelo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MarcaModelo getMarca() {
        return marca;
    }

    public void setMarca(MarcaModelo marca) {
        this.marca = marca;
    }

    public ModeloModelo() {
    }

    public ModeloModelo(String nombremodelo, String detalle, MarcaModelo marca) {
        this.nombremodelo = nombremodelo;
        this.detalle = detalle;
        this.marca = marca;
    }

    private ModeloModelo(int idmodelo, String nombremodelo, String detalle, MarcaModelo marca) {
        this.idmodelo = idmodelo;
        this.nombremodelo = nombremodelo;
        this.detalle = detalle;
        this.marca = marca;
    }
  
}
