/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Usuario;
import java.io.*;
import java.util.*;
import listaSimple.ListaUsuario;
/**
 *
 * @author LENOVO 14ALC6
 */
public class UsuarioFileManager {
     private static final String FILE_PATH = "usuarios.txt";

     public static ListaUsuario loadUsers() {
        ListaUsuario listaUsuarios = new ListaUsuario();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    try {
                        Usuario usuario = new Usuario(
                               Integer.parseInt( parts[0]),
                                parts[1],
                                parts[2],
                                parts[3],
                                parts[4],
                                parts[5]
                        );
                        listaUsuarios.setAddInicio(usuario);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir identificación: " + parts[0]);
                    }
                } else {
                    System.err.println("Línea incorrecta: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }


    public static void saveUser(Usuario usuario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(usuario.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
