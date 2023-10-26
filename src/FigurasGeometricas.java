import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Clase para una prenda de vestir.
 */
public class FigurasGeometricas {
    private String nombre;
    private String color;
    public double obtenerArea(){
        Scanner ola=new Scanner(System.in);
        int op;
            do {System.out.println("Seleccione alguna de las siguientes opciones para el area"
                    System.out.println(););

        }

    }
    public double obtenerPerimetro(){

    }

    /**
     * Constructor de la clase.
     * 
     * @param nombre nombre de la prenda
     * @param color color de la prenda
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public FigurasGeometricas(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;

    }

    /**
     * Método para imprimir en consola los datos de la prenda.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);

    }
}
