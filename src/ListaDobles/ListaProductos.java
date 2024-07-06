/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDobles;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author pc
 */
public class ListaProductos {
    public Producto Cab;
    Producto Info;
    
    public ListaProductos(){
        Cab=null;
        Info = null;
    }
    public Producto getCab() {
        return Cab;
    }
    public void setCab(Producto Cab) {
        this.Cab = Cab;
    }
    public Producto getInfo() {
        return Info;
    }
    public void setInfo(Producto Info) {
        this.Info = Info;
    }
    
   public boolean getEsVacia(){ return Cab==null?true:false; }
   
   public Producto getUltimo(){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux.getNext() != null)
                Aux = Aux.getNext();
            return Aux;
        }
    }
   public int getLongLista(){
        if(getEsVacia()) return 0;
        else{
            Producto pedro =Cab;
            int contador=0;
            while(pedro != null){
                contador++;
                pedro = pedro.getNext();
            }
            return contador;
        }
    }
   
//--------------------------------------------------------------------//
   // METODOS DE BUSQUEDA
   public Producto getBuscarCodigo(int Codigo){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getCodigo() == Codigo)
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarNombre(String Nombre){
        if(getEsVacia())
            return null;
        else{
           Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getNombre().equals(Nombre))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarTipProd(String Tipo){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getTipoProducto().equals(Tipo))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarAnimal(String Animal){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getAnimal().equals(Animal))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    } 
   public Producto getBuscarEdad(String Edad){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getEdad().equals(Edad))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarTamaño(String Tamaño){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getTamaño().equals(Tamaño))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarColor(String Color){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getColor().equals(Color))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarPrecio(double Precio){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getPrecio() == Precio)
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarTipoEnvio(String TEnvio){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getTipoEnvio().equals(TEnvio))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarMedioPago(String MPago){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getMedioPago().equals(MPago))
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   public Producto getBuscarPopularidad(int Comprado){
        if(getEsVacia())
            return null;
        else{
            Producto Aux=Cab;
            while(Aux!=null){
                if(Aux.getComprados() == Comprado)
                    return Aux;
                else
                    Aux = Aux.getNext();
            }
            return null;
        }
    }
   
//--------------------------------------------------------------------//    
    
  public Boolean getCrearNodo(JTextField jTCodigo,
                              JTextField jTNombre,
                              JComboBox jCCategoria,
                              JTextField jTCantidad,
                              JTextField jTAnimal,
                              JTextField jTEdad,
                              JTextField jTTamaño,
                              JTextField jTColor,
                              JTextField jTPrecio,
                              JComboBox jCTipoEnvio,
                              JComboBox jCMedioPago,
                              JComboBox jCTipoProd,
                              JTextField jTImagen,
                              JTextField jTDescripcion){
        Producto Codigo ,Aux = null;        
        
        try {
            do{
            Codigo = getBuscarCodigo(Integer.parseInt(jTCodigo.getText()));
            
            if (Codigo != null ){
                JOptionPane.showMessageDialog(null, "Error: El Producto Ingresado Ya se Encuentra Disponible, Intentenuevamente"); 
                jTCodigo.setText("");
                jTCodigo.requestFocus();
              }
            }while(Aux!=null);            
            Info = new Producto(Integer.parseInt(jTCodigo.getText()),
                            jTNombre.getText(),
                            Integer.parseInt(jTCantidad.getText()),
                            jCCategoria.getSelectedItem().toString(),
                            jTEdad.getText(),
                            jTAnimal.getText(),
                            jTColor.getText(),
                            jTTamaño.getText(),
                            jCTipoEnvio.getSelectedItem().toString(),
                            Double.parseDouble(jTPrecio.getText()),
                            jCTipoProd.getSelectedItem().toString(),
                            jCMedioPago.getSelectedItem().toString(),
                            jTImagen.getText(),
                            jTDescripcion.getText(),
                            0);
            JOptionPane.showMessageDialog(null,"Se ha creado un nuevo nodo.");
            return true;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
            Info=null;
            return false;
        }
    }  
  
     public void setAddI(JTextField jTCodigo,
                              JTextField jTNombre,
                              JComboBox jCCategoria,
                              JTextField jTCantidad,
                              JTextField jTAnimal,
                              JTextField jTEdad,
                              JTextField jTTamaño,
                              JTextField jTColor,
                              JTextField jTPrecio,
                              JComboBox jCTipoEnvio,
                              JComboBox jCMedioPago,
                              JComboBox jCTipoProd,
                              JTextField jTImagen,
                              JTextField jTDescripcion
    ){
        getCrearNodo(jTCodigo,
                jTNombre,
                jCCategoria,
                jTCantidad,
                jTAnimal,
                jTEdad,
                jTTamaño,
                jTColor,
                jTPrecio,
                jCTipoEnvio,
                jCMedioPago,
                jCTipoProd,
                jTImagen,
                jTDescripcion);
        
        if(Info!=null){
            if(Cab==null){
                Cab=Info;
                JOptionPane.showMessageDialog(null,
                    "Se ha registrado el nodo a la lista, " + "la lista estaba vacía.");
            }else{
                Info.setNext(Cab);
                Cab.setPrevious(Info);
                Cab=Info;
                JOptionPane.showMessageDialog(null,"Se ha registrado el nodo al principio "+ "de la lista.");
            }
        }
    }
    
    public void setAddInicio(Producto usuario){
        Producto info = getCrearNodo(usuario);
        if (info != null) {
            if (Cab == null) {
                Cab = info;
     
            } else {
                info.setNext(Cab);
                Cab=info;
            }
        }else{            
        }
    }
      public Producto getCrearNodo(Producto usuario){
        Producto buscar = null;        
        try {                        
            buscar = getBuscarCodigo(usuario.getCodigo());
            if (buscar != null) {
                JOptionPane.showMessageDialog(null,
                    "Error: Este usuario ya se encuentra "
                    + "registrado.  Reemplazar Email!");               
                return null;
            }         
            Producto info = usuario;
            return info;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);            
            return null;
        }
    }
   
    public void setRegistrarFilaJTable(DefaultTableModel miModelo,int pFila, Producto A){
        
        miModelo.setValueAt(A.getCodigo(), pFila, 0);
        miModelo.setValueAt(A.getImagen(), pFila, 1);
        miModelo.setValueAt(A.getNombre(), pFila, 2);
        miModelo.setValueAt(A.getPrecio(), pFila, 3);
        miModelo.setValueAt(A.getCategoria(), pFila, 4);
        
    }    
    public void setLlenarJTable(JTable tab){
        int posFilaT=0; //Este índice recorre los elementos de la fila Tabla
        Producto p=Cab;  //Este nodo me mueve posición x posición en la lista
        DefaultTableModel miModelo=new DefaultTableModel();

        miModelo.addColumn("Codigo");
        miModelo.addColumn("Imagen");
        miModelo.addColumn("Nombre");  
        miModelo.addColumn("Precio");
        miModelo.addColumn("Categoria");
        
        while(p!=null){                        
            miModelo.addRow(new Object[]{"", "", "", "", ""});              
            setRegistrarFilaJTable(miModelo,posFilaT,p);            
            p=p.getNext();
            posFilaT++;
        }
        tab.setModel(miModelo);
    } 
    
    public Producto getAnterior(Producto p){
        Producto q=Cab;
        if(Cab==null)
            return null;
        else{
            while(q.getNext()!=p)
                q=q.getNext();
            return q;
        }
    }
    public void setEliminar(int nro){
        if(getEsVacia()){
            JOptionPane.showMessageDialog(null, 
                "La lista se encuentra vacía!!");
        }else{
            Producto b= getBuscarCodigo(nro);
            if(b==null){
                JOptionPane.showMessageDialog(null,"El código a eliminar no existe!!");
            }else{
                if((b==Cab)&&(Cab.getNext()==null)){
                    Cab=null;
                    JOptionPane.showMessageDialog(null, "Elemento eliminado de la cabecera!! " + "La lista quedó vacía.");
                }
                else if((b==Cab)&&(Cab.getNext()!=null)){
                    Cab=Cab.getNext();
                    b.setNext(null);
                    Cab.setPrevious(null);
                    b=null;
                    JOptionPane.showMessageDialog(null, "Elemento eliminado de la cabecera!! "+ "La lista tiene elementos.");
                }
                else if(b.getNext()==null){
                    b.getPrevious().setNext(null);
                    b.setNext(null);
                    b=null;
                    b=null;
                    JOptionPane.showMessageDialog(null, "Elemento eliminado al final de la lista!!");
                }
                else{
                    b.getPrevious().setNext(b.getNext());
                    b.getNext().setPrevious(b.getNext());
                    b.setNext(null);
                    b.setPrevious(null);
                    b=null;
                    JOptionPane.showMessageDialog(null, "Elemento eliminado entre dos nodos de " + "la lista!!");
                }
            }
        }
    }  
      
      
}
