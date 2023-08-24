package Clases;

public class Perfumería extends Producto{

    private Double contenido;
    public Perfumería(String nombre, Double precio, Double contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {

        return "Nombre: " + this.nombre +
                " /// Contenido: " + Math.round(this.contenido) + "ml" +
                " /// Precio: $" + Math.round(this.precio);

    }
}
