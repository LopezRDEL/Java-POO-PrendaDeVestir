import java.text.NumberFormat;
import java.util.Locale;

/**
 * Clase para una prenda de vestir.
 */
public class PrendaDeVestir {
    private String nombre;
    private String talla;
    private String color;
    private double precio;

    /**
     * Constructor de la clase.
     * 
     * @param nombre nombre de la prenda
     * @param talla talla de la prenda
     * @param color color de la prenda
     * @param precio precio de la prenda
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public PrendaDeVestir(String nombre, String talla, String color, double precio) {
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
    }

    /**
     * Método para obtener el precio de la prenda en formato de moneda colombiana.
     * 
     * @return nombre de la prenda
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getPrecio() {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        // Formatear el precio en formato colombiano
        String precioFormateado = formatoColombiano.format(this.precio);
        return precioFormateado;
    }

    /**
     * Método para imprimir en consola los datos de la prenda.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + getPrecio());
    }
}
