package Clases;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Producto implements Comparable<Producto>{
protected String nombre;
protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Producto aux = (Producto) obj;
        return Objects.equals(precio,aux.precio);
    }

    @Override
    public int compareTo(Producto producto) {
        if (this.precio > producto.getPrecio()) return 1;
        if (this.precio == producto.getPrecio()) return 0;
        return -1;
    }
}
