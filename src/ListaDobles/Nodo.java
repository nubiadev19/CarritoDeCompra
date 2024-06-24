/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDobles;

import modelo.Producto;
//import vistaCliente.Producto;
/**
 *
 * @author pc
 */
public class Nodo {
    Producto produto;
    Nodo next, previous;

    public Nodo(Producto produto) {
        this.produto = produto;
        this.next = null;
        this.previous = null;
    }

    public Producto getProduto() {
        return produto;
    }

    public void setProduto(Producto produto) {
        this.produto = produto;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }

    
    
}
