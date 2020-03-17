package Vehiculos;

import java.io.*;
import java.util.ArrayList;

public class adminOfertadores {
    private ArrayList<Ofertador> listaOfertadores = new ArrayList();
    private File archivo = null;

    public adminOfertadores(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ofertador> getListaOfertadores() {
        return listaOfertadores;
    }

    public void setListaOfertadores(ArrayList<Ofertador> listaOfertadores) {
        this.listaOfertadores = listaOfertadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminOfertadores{" + "listaOfertadores=" + listaOfertadores + '}';
    }

    public void setOfertador(Ofertador p) {
        this.listaOfertadores.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaOfertadores = new ArrayList();
            Ofertador temp;
            if (archivo.exists()) {
                
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while ((temp = (Ofertador) objeto.readObject()) != null) {
                        listaOfertadores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Ofertador t : listaOfertadores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
