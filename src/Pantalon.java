/**
 * Clase Pantalon que hereda de PrendaDeVestir.
 */
class Pantalon extends PrendaDeVestir {
    private String estilo;

    /**
     * Constructor de la clase Pantalon.
     *
     * @param nombre
     * @param talla
     * @param color
     * @param precio
     * @param estilo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Pantalon(String nombre, String talla, String color, double precio, String estilo) {
        super(nombre, talla, color, precio);
        this.estilo = estilo;
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
        System.out.println("Tipo de prenda: Pantalón de estilo " + estilo);
    }
}