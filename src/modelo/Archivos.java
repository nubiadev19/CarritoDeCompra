/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import listaSimple.ListaUsuario;

/**
 *
 * @author LENOVO 14ALC6
 */
public class Archivos {
    
    //public Archivos archivos;
    public ListaUsuario usuarios;
    private File archivo;
    
    public Archivos(String nombreArchivo) {
        archivo = new File(nombreArchivo);
        usuarios = new ListaUsuario();
        usuarios.cargarDesdeArchivo(archivo);
        agregarAdministradores();
    }
    
    private void agregarAdministradores() {
        // Añadir cuentas de administrador directamente en el código
        Usuario admin1 = new Usuario(122, "Administrador Uno", "admin1@example.com", "admin123", "Admin");
        Usuario admin2 = new Usuario(333, "Administrador Dos", "admin2@example.com", "admin123", "Admin");
        usuarios.setAddInicio(admin1);
        usuarios.setAddInicio(admin2);
    }
    
    public void registrarUsuario(Usuario usuario) {
        // Verificar si el usuario ya existe
        if (usuarios.getBuscarPorEmail(usuario.getEmail()) == null) {
            usuarios.setAddInicio(usuario);
            usuarios.guardarEnArchivo(archivo);
        } else {
            System.out.println("El usuario con este email ya existe.");
        }
    }
    
    public Usuario iniciarSesion(String email, String clave) {
        return usuarios.buscarPorEmailYClave(email, clave);
    }
}
