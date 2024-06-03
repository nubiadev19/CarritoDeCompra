/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimple;

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
    
}
