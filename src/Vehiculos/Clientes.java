
package Vehiculos;



public class Clientes {
    private String nombre, nick, contra, pais;
    private String fecha;
    private String correo;
    private int respuesta;

    public Clientes() {
    }

    public Clientes(String nombre, String nick, String contra, String pais, String fecha, String correo, int respuesta) {
        this.nombre = nombre;
        this.nick = nick;
        this.contra = contra;
        this.pais = pais;
        this.fecha = fecha;
        this.correo = correo;
        this.respuesta=respuesta;
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

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", nick=" + nick + ", contra=" + contra + ", pais=" + pais + ", fecha=" + fecha + ", correo=" + correo + ", respuesta=" + respuesta + '}';
    }
    

    

    
    
    
    
}
