/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author euced
 */
public class Probando implements Runnable{
    
    public Probando(){
        Thread miHilo = new Thread(this);
        
        miHilo.start();
    }

    @Override
    public void run() {
    
        System.out.println("I c u");
        try {
            
            ServerSocket serv = new ServerSocket(9999);
            
            Socket miSocket=serv.accept();
            
            DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());
            
            String mensaje_texto=flujo_entrada.readUTF();
            
            System.out.println(mensaje_texto);
            
            miSocket.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Probando.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
