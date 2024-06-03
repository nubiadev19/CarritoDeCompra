/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimple;

import modelo.Usuario;

/**
 *
 * @author LENOVO 14ALC6
 */
public class Nodo {
    
    Usuario usuario;
    Nodo siguiente;

    public Nodo(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente=null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "usuario=" + usuario + ", siguiente=" + siguiente + '}';
    }
    
    
}
