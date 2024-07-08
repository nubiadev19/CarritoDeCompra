/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author CAMI
 */
public class Nodo {

    // decaracion de los atributos de la clase Nodo
    int codigo;
    String nombre;
    int cantidad;
    String categoria;
    String edad;
    String animal;
    String color;
    String tamano;
    String tipoEnvio;
    double precio;
    String tipoProducto;
    String medioPago;
    String Imagen;
    String Descripcion;
    int Comprados;
    Nodo siguiente;

    //Metodo constructor
    public void Nodo() {
        this.codigo = 0;
        nombre = "";
        this.cantidad = 0;
        this.categoria = "";
        this.edad = "";
        this.animal = "";
        this.color = "";
        this.tamano = "";
        this.tipoEnvio = "";
        this.precio = 0;
        this.tipoProducto = "";
        this.medioPago = "";
        this.Imagen = "";
        this.Descripcion = "";
        this.Comprados = 0;
        siguiente = null;
    }

    //asignacion de los metodos set y get 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamaño) {
        this.tamano = tamaño;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getComprados() {
        return Comprados;
    }

    public void setComprados(int Comprados) {
        this.Comprados = Comprados;
    }
  

    public void setSiguiente(Nodo sig) {
        siguiente = sig;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public boolean getIconImage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
