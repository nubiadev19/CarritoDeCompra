package Productos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author CAMI
 */
public class ListaEnlazada {

    // declaracion de la variable cabeza donde se incician las conexiones de entre Nodos
    private Nodo cabeza;

    // constructor 
    public ListaEnlazada() {
        cabeza = null;
    }

    //declaraccion del metodo set y get del atributo cabeza
    public void setCabeza(Nodo cab) {
        cabeza = cab;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

//con ste metodo se debuelbe el ultimo nodo de la lista
    public Nodo ultimo() {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getSiguiente() == null) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

//    con este metodo se reconoce si la lista se encuentra bacia o ya tiene informacion
    public boolean vacio() {
        return cabeza == null;

    }

    // en se metodo se consuta si la placa que se va registrar ya existe
    public boolean codigoexiste(int codigo) {
        boolean existe = false;
        Nodo temp = cabeza;
        while (temp != null) {
            if (codigo == temp.getCodigo()) {
                existe = true;
                return existe;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return existe;
    }

    //este metodo nos dice cuantos nodos hay en la lista
    public int contarNodos() {
        int contador = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            contador++;
            temp = temp.getSiguiente();
        }
        return contador;
    }

// con este metodo se enlazan los nodos en la lista
    public void agregaralfinal(Nodo nuevo) {
        if (cabeza == null) {
            setCabeza(nuevo);
        } else {
            ultimo().setSiguiente(nuevo);
        }
    }

// con estemetodo se elimina todos los nodo se la lista
    public void limpiar() {
        while (cabeza != null) {
            eliminar(cabeza);
        }
    }

    // en este eliina un odo escojido
    public void eliminar(Nodo nd) {
        Nodo anterior;
        if (nd == cabeza) {
            cabeza = cabeza.getSiguiente();
        } else {
            anterior = cabeza;
            while (anterior.getSiguiente() != nd) {
                anterior = anterior.getSiguiente();
            }

            anterior.setSiguiente(nd.getSiguiente());
        }
        nd.setSiguiente(null);
    }

    public String mostrar() {

        String mensaje = "";

        Nodo temp = getCabeza();

        if (getCabeza() == null) {
            mensaje = " no hay datos....";
        } else {
            while (temp != null) {

                mensaje += "placa: " + temp.getCodigo() + "\n"
                        + "Marca: " + temp.getNombre() + "\n"
                        + "modelo: " + temp.getAnimal() + "\n"
                        + "valor: " + temp.getColor() + "\n"
                        + "tipo vehiculo: " + temp.getEdad()
                        + "\n" + "___________________________"
                        + "\n \n";

                temp = temp.getSiguiente();

            }
        }
        return mensaje;
    }

    // con este metodo se obtiene la informacion del arcgivo y buelve a introdir en la lista 
    public void recuperarArchivo(String ruta) throws FileNotFoundException, IOException {
        LeerEscribirArchivo arch = new LeerEscribirArchivo();
        String cadena = "";
        String linea;
        int codigo = 0;
        String nombre = "";
        int cantidad = 0;
        String categoria = "";
        String edad = "";
        String animal = "";
        String color = "";
        String tamano = "";
        String tipoEnvio = "";
        double precio = 0;
        String tipoProducto = "";
        String medioPago = "";
        String imagen = "";
        String descripcion = "";
        int comprados = 0;
        FileReader fichero = new FileReader(ruta);
        try (BufferedReader leer = new BufferedReader(fichero)) {
            while ((linea = leer.readLine()) != null) {
                Nodo temp = new Nodo();
                cadena = linea.intern();
                String Codigo = cadena.split("&")[0];
                nombre = cadena.split("&")[1];
                String Cantidad = cadena.split("&")[2];
                categoria = cadena.split("&")[3];
                edad = cadena.split("&")[4];
                animal = cadena.split("&")[5];
                color = cadena.split("&")[6];
                tamano = cadena.split("&")[7];
                tipoEnvio = cadena.split("&")[8];
                String Precio = cadena.split("&")[9];
                tipoProducto = cadena.split("&")[10];
                medioPago = cadena.split("&")[11];
                imagen = cadena.split("&")[12];
                descripcion = cadena.split("&")[13];
                String Comprados = cadena.split("&")[14];
                //comvertir
                codigo = Integer.parseInt(Codigo);
                cantidad = Integer.parseInt(Cantidad);
                precio = Double.parseDouble(Precio);
                comprados=Integer.parseInt(Comprados);
// llenar lista. 
                temp.setCodigo(codigo);
                temp.setNombre(nombre);
                temp.setCantidad(cantidad);
                temp.setCategoria(categoria);
                temp.setEdad(edad);
                temp.setAnimal(animal);
                temp.setColor(color);
                temp.setTamano(tamano);
                temp.setTipoEnvio(tipoEnvio);
                temp.setPrecio(precio);
                temp.setTipoProducto(tipoProducto);
                temp.setMedioPago(medioPago);
                temp.setImagen(imagen);
                temp.setDescripcion(descripcion);
                temp.setComprados(comprados);
                agregaralfinal(temp);
            }

        }
    }

    // Método para obtener los últimos 5 nodos desde un índice específico
    public LinkedList<Nodo> obtenerUltimosCincoDesdeIndice(int indice) {
        LinkedList<Nodo> ultimosCinco = new LinkedList<>();
        int totalNodos = contarNodos();

        if (indice < 0 || indice >= totalNodos) {
            return ultimosCinco; // Indice fuera de rango
        }

        Nodo actual = cabeza;
        int contador = 0;

        // Moverse al nodo en el índice especificado
        while (contador < indice) {
            actual = actual.getSiguiente();
            contador++;
        }

        // Agregar hasta 5 nodos desde el nodo actual
        while (actual != null && ultimosCinco.size() < 5) {
            ultimosCinco.addLast(actual);
            actual = actual.getSiguiente();
        }

        return ultimosCinco;
    }

    // Método para imprimir los datos de los nodos obtenidos
    public void imprimirDatosDesdeIndice(int indice) {
        LinkedList<Nodo> nodos = obtenerUltimosCincoDesdeIndice(indice);
        for (Nodo nodo : nodos) {
            System.out.println(nodo.getImagen());
        }
    }
    
        public LinkedList<Nodo> obtenerUltimosCincoNodos() {
        LinkedList<Nodo> ultimosCinco = new LinkedList<>();
        int totalNodos = contarNodos();
        Nodo actual = cabeza;

        // Si la lista tiene menos de 5 nodos, mover hasta el final
        if (totalNodos <= 5) {
            while (actual != null) {
                ultimosCinco.addLast(actual);
                actual = actual.getSiguiente();
            }
        } else {
            // Mover hasta los últimos 5 nodos
            int skip = totalNodos - 5;
            while (skip > 0 && actual != null) {
                actual = actual.getSiguiente();
                skip--;
            }
            while (actual != null) {
                ultimosCinco.addLast(actual);
                actual = actual.getSiguiente();
            }
        }
        
        return ultimosCinco;
    }
public LinkedList<Nodo> obtenerPrimerosCincoNodos() {
    LinkedList<Nodo> primerosCinco = new LinkedList<>();
    Nodo actual = cabeza;

    // Recorrer la lista y agregar los nodos hasta tener al menos los primeros 5
    int count = 0;
    while (actual != null && count < 5) {
        primerosCinco.addLast(actual);
        actual = actual.getSiguiente();
        count++;
    }

    return primerosCinco;
}


    // Método para imprimir los datos de los últimos 5 nodos
    public void imprimirUltimosCincoDatos() {
        LinkedList<Nodo> ultimosCinco = obtenerUltimosCincoNodos();
        for (Nodo nodo : ultimosCinco) {
            System.out.println(nodo.getImagen());
        }
    }
}
