/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO 14ALC6
 */
public class Archivos {
    public static void main(String[] args) {
        File archivo;// para manipular archivos
        FileWriter escribir; //para escribir en el archivo
        PrintWriter linea;//para escribir en el archivo
        String nombre="";
        String email="";
        String clave="";
        String rol="";
        String estado="";
        archivo =new File("Usuario.txt");// preparando el archivo
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                nombre=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                email=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3); 
                 clave=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                  rol=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                   estado=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                   escribir=new FileWriter(archivo,true);
                   linea=new PrintWriter(escribir);
                   //escribimos en el archivo
                   linea.print(nombre);
                   linea.print(email);
                   linea.print(clave);
                   linea.print(rol);
                   linea.print(estado);
                   linea.close();
                   escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
             try {
                archivo.createNewFile();
                nombre=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                email=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3); 
                 clave=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                  rol=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                   estado=JOptionPane.showInputDialog(null, "ingresa el nombre"+
                        "solicitando datos: "+3);
                   escribir=new FileWriter(archivo,true);
                   linea=new PrintWriter(escribir);
                   //escribimos en el archivo
                   linea.print(nombre);
                   linea.print(email);
                   linea.print(clave);
                   linea.print(rol);
                   linea.print(estado);
                   linea.close();
                   escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
