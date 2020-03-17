package Vehiculos;

import java.io.Serializable;
import java.util.ArrayList;

public class Ofertador implements Serializable {

    private String nombre, nick, contra, pais;
    private String fecha;
    private String correo;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();

    //private static final long SerialVersionUID = 777L;

    public Ofertador() {
    }

    public Ofertador(String nombre, String nick, String contra, String pais, String fecha, String correo) {
        this.nombre = nombre;
        this.nick = nick;
        this.contra = contra;
        this.pais = pais;
        this.fecha = fecha;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void setVehiculo(Vehiculo p) {
        this.vehiculos.add(p);
    }

    @Override
    public String toString() {
        return "Ofertador{" + "nombre=" + nombre + ", nick=" + nick + ", contra=" + contra + ", pais=" + pais + ", fecha=" + fecha + ", correo=" + correo + '}';
    }

}
