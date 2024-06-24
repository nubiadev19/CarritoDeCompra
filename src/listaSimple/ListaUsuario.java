/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimple;
import java.io.*;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author LENOVO 14ALC6
 */
public class ListaUsuario {
    
    Nodo cabecera;
    
    public ListaUsuario(){
        cabecera=null;
    }
    public Nodo getBuscarPorEmail(String email){
        if(cabecera==null)
            return null;
        else{
            Nodo p = cabecera;
            while(p!=null){
                if((p.getUsuario().getEmail()).equals(email))
                    return p;
                else
                    p = p.siguiente;  //Avanza un posición en la lista
            }
            return null;
        }
    }
    public Usuario buscarPorEmailYClave(String email, String clave) {
        Nodo actual = cabecera;
        while (actual != null) {
            if (actual.usuario.getEmail().equals(email) && actual.usuario.getClave().equals(clave)) {
                return actual.usuario;
            }
            actual = actual.siguiente;
        }
        return null;
    }
     public void setAddInicio(Usuario usuario){
        //Creamos el nodo que se desea registrar
        //en la lista
        Nodo info = getCrearNodo(usuario);
        if (info != null) {
            if (cabecera == null) {
                cabecera = info;
     
            } else {
                //Enlazamos el nuevo nodo a la lista
                info.siguiente = cabecera;
                //Ahora se debe mover cab al primer 
                //nuevo elemento
                cabecera=info;
            }
        }else{            
        }
    }
      public Nodo getCrearNodo(Usuario usuario){
        Nodo buscar = null;        
        try {                        
            buscar = getBuscarPorEmail(usuario.getEmail());
            if (buscar != null) {
                JOptionPane.showMessageDialog(null,
                    "Error: Este usuario ya se encuentra "
                    + "registrado.  Reemplazar Email!");               
                return null;
            }         
            //Una vez capturados los datos, se crea en memoria el nodo
            Nodo info = new Nodo(usuario);
            return info;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);            
            return null;
        }
    }
      
public void guardarEnArchivo(File archivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            Nodo actual = cabecera;
            while (actual != null) {
                if (!actual.usuario.getRol().equals("Admin")) {
                    pw.println(actual.usuario.toFileString());
                }
                actual = actual.siguiente;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarDesdeArchivo(File archivo) {
        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    Usuario usuario = Usuario.fromFileString(linea);
                    getCrearNodo(usuario);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
    

