package Vehiculos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarClientes {

    private ArrayList<Clientes> listaClientes = new ArrayList();
    private File archivo = null;
    private boolean append;

    public administrarClientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarClientes{" + "listaClientes=" + listaClientes;
    }

    public void setCliente(Clientes p) {
        this.listaClientes.add(p);
    }

    public boolean isAppend() {
        return append;
    }

    public void setAppend(boolean append) {
        this.append = append;
    }
    
    

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            
            fw = new FileWriter(archivo, append);
            bw = new BufferedWriter(fw);
            for (Clientes t : listaClientes) {
                bw.write(t.getNombre() + ",");
                bw.write(t.getNick() + ",");
                bw.write(t.getContra() + ",");
                bw.write(t.getPais() + ",");
                bw.write(t.getFecha() + ",");
                bw.write(t.getCorreo() + ",");
                bw.write(t.getRespuesta()+ ";\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaClientes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String m = sc.next();
                    String[] tokens = m.split(",");
                    if (tokens.length >= 6) {
                        int res = Integer.parseInt(tokens[6]);
                        Clientes u = new Clientes(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], res);
                        listaClientes.add(u);
                    }

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
