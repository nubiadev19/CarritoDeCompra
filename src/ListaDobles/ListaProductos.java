/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDobles;

import javax.swing.JOptionPane;
import modelo.Producto;

/**
 *
 * @author pc
 */
public class ListaProductos {
    Nodo Cab;
    Nodo Info;
    modelo.Producto producto1,producto2;
    ListaProductos ListaPrueba;
   
    public ListaProductos(){
        Cab=null;
        
    }

    public Producto getProducto1() {
        return producto1;
    }
    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }
    public Producto getProducto2() {
        return producto2;
    }
    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }
    
    
    
    public Nodo getCab() {
        return Cab;
    }

    public void setCab(Nodo Cab) {
        this.Cab = Cab;
    }

    public Nodo getInfo() {
        return Info;
    }

    public void setInfo(Nodo Info) {
        this.Info = Info;
    }
    
   public boolean getEsVacia(){ return Cab==null?true:false; }
    
   public Nodo getUltimo(){
        if(getEsVacia())
            return null;
        else{
            Nodo Aux=Cab;
            while(Aux.next != null)
                Aux = Aux.next;
            return Aux;
        }
    }
   
   public int getLongLista(){// Revisa que tan grande esta la lista
        if(getEsVacia()) return 0;
        else{
            Nodo pedro =Cab;
            int contador=0;
            while(pedro != null){
                contador++;
                pedro = pedro.next;
            }
            return contador;
        }
    }
   
   public Nodo Recorrer(int posicion){
            Nodo Aux=getUltimo();
            while(Aux!=null){
                if(getEsVacia() == false)
                    for(posicion = 0; posicion <= getLongLista() ;posicion ++)
                    return Aux;
                else
                    Aux = Aux.previous;
            }
            return null;
        }
  
    public Nodo getBuscarCodigo(int Codigo){
        if(getEsVacia())
            return null;
        else{
            Nodo Aux=Cab;
            while(Aux!=null){
                if(Aux.getProduto().getCodigo() == Codigo)
                    return Aux;
                else
                    Aux = Aux.next;
            }
            return null;
        }
    }
    
    public void setAddInicio(Producto producto){
        Nodo info = getCrearNodo(producto);
        if (info != null) {
            if (Cab == null) {
                Cab = info;
     
            } else {
                info.next = Cab;
                Cab=info;
            }
        }else{            
        }
    }
      public Nodo getCrearNodo(Producto producto){
        Nodo buscar = null;        
        try {                        
            buscar = getBuscarCodigo(producto.getCodigo());
            if (buscar != null) {
                JOptionPane.showMessageDialog(null,
                    "Error: Este usuario ya se encuentra "
                    + "registrado.  Reemplazar Email!");               
                return null;
            }         
            //Una vez capturados los datos, se crea en memoria el nodo
            Nodo info = new Nodo(producto);
            return info;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);            
            return null;
        }
    }
    
    
}
