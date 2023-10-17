/**
 * Clase Camisa que hereda de PrendaDeVestir.
 */
class Camisa extends PrendaDeVestir {
    private boolean mangaLarga;

    /**
     * Constructor de la clase Camisa.
     *
     * @param nombre
     * @param talla
     * @param color
     * @param precio
     * @param mangaLarga
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Camisa(String nombre, String talla, String color, double precio, boolean mangaLarga) {
        super(nombre, talla, color, precio);
        this.mangaLarga = mangaLarga;
    }

    /**
     * Método para imprimir en consola los datos de la camisa.
     * Redefine el método mostrarInfo de la clase padre PrendaDeVestir.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        if (mangaLarga) {
            System.out.println("Tipo de prenda: Camisa de manga larga");
        } else {
            System.out.println("Tipo de prenda: Camisa de manga corta");
        }
    }
}