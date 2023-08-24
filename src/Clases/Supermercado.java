package Clases;

import java.util.*;

public class Supermercado {
    private String nombre;
    private LinkedList<Producto> productos = new LinkedList<>();

    //Constructor
    public Supermercado(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public boolean añadirProducto(Producto producto){
        return productos.add(producto);
    }

    public void ordenarAscendentemente(){
        Collections.sort(productos);
    }

    public Producto obtenerProductoDeMenorValor(){
        ordenarAscendentemente();
        return productos.getFirst();
    }

    public Producto obtenerProductoDeMayorValor(){
        ordenarAscendentemente();
        return productos.getLast();
    }

    @Override
    public String toString() {
        String toString = "";

        for (Producto producto: productos
             ) {
            toString += producto + "\n";
        }

        toString += "=============================\n";

        toString += "Producto más caro: " + obtenerProductoDeMayorValor().getNombre() + "\nProducto más barato: " + obtenerProductoDeMenorValor().getNombre();

        return toString;
    }
}
