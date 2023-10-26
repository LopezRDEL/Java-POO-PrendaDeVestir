/**
 * Clase Circulo que hereda de FigurasGeometricas.
 */
class Circulo extends FigurasGeometricas {

    /**
     * Constructor de la figura circulo.
     *
     * @param nombre
     * @param color
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color) {
        super(nombre, color);
    }

    /**
     * Método para imprimir en consola la figura circulo.
     * Redefine el método mostrarInfo de la clase padre FigurasGeometricas.
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