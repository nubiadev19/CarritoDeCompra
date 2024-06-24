/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO 14ALC6
 */
public class Producto {
    int codigo;
    String nombre;
    int cantidad;
    String categoria;
    String edad;
    String animal;
    String color;
    String tamaño;
    String tipoEnvio;
    double precio;
    String tipoProducto;
    String medioPago;
    String Imagen;
    String Descripcion;

    public Producto(int codigo, String nombre, int cantidad, String categoria, String edad, String animal, String color, String tamaño, String tipoEnvio, double precio, String tipoProducto, String medioPago, String Imagen, String Descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.edad = edad;
        this.animal = animal;
        this.color = color;
        this.tamaño = tamaño;
        this.tipoEnvio = tipoEnvio;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.medioPago = medioPago;
        this.Imagen = Imagen;
        this.Descripcion = Descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getEdad() {
        return edad;
    }
    public String getAnimal() {
        return animal;
    }
    public String getColor() {
        return color;
    }
    public String getTamaño() {
        return tamaño;
    }
    public String getTipoEnvio() {
        return tipoEnvio;
    }
    public double getPrecio() {
        return precio;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }
    public String getMedioPago() {
        return medioPago;
    }
    public String getImagen() {
        return Imagen;
    }
    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", edad=" + edad + ", animal=" + animal + ", color=" + color + ", tama\u00f1o=" + tamaño + ", tipoEnvio=" + tipoEnvio + ", precio=" + precio + ", tipoProducto=" + tipoProducto + ", medioPago=" + medioPago + ", Imagen=" + Imagen + ", Descripcion=" + Descripcion + '}';
    }

    
    
    
}
