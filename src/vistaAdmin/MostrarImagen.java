/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaAdmin;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jhonatan
 */
public class MostrarImagen {
    private String Ruta;
    public MostrarImagen(String Ruta){
        this.Ruta=Ruta;
        
    }
    
    public void MostrarImagen(javax.swing.JLabel jLabel1){
       Image miImagen = new ImageIcon(Ruta).getImage();
        ImageIcon mIcono = new ImageIcon(miImagen.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
        jLabel1.setIcon(mIcono);
    }
    
    
    
}
