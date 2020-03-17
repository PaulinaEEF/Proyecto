package Vehiculos;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    private String marca, modelo;
    private int fecha, clilindraje, precio, oferta;
    private String tipo, transmision, vehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int fecha, int clilindraje, int precio, String tipo, String transmision, int oferta, String vehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.clilindraje = clilindraje;
        this.precio = precio;
        this.tipo = tipo;
        this.transmision = transmision;
        this.oferta=oferta;
        this.vehiculo=vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getClilindraje() {
        return clilindraje;
    }

    public void setClilindraje(int clilindraje) {
        this.clilindraje = clilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", clilindraje=" + clilindraje + ", tipo=" + tipo + ", transmision=" + transmision + '}';
    }
    
    
}
