import java.awt.*;

/**
 * Clase Pantalon que hereda de PrendaDeVestir.
 */
class Rectangulo extends FigurasGeometricas {
    private String estilo;

    /**
     * Constructor de la clase Pantalon.
     *
     * @param nombre
     * @param color
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color) {
        super(nombre, color);

    }

    /**
     * Método para imprimir en consola los datos del pantalón.
     * Redefine el método mostrarInfo de la clase padre PrendaDeVestir.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rectangulo " + estilo);
    }
}