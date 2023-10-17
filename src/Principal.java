/**
 * Clase Principal
 */
public class Principal {
    /**
     * Primer método que se ejecuta al correr el programa.
     *
     * @param args
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public static void main(String[] args) {
        Camisa camisaMangaCorta = new Camisa("Camisa Casual", "M", "Azul", 35000, false);
        Pantalon pantalonChino = new Pantalon("Pantalón Jean", "L", "Negro", 75000, "Slim Fit");

        camisaMangaCorta.mostrarInfo();
        System.out.println("\n");
        pantalonChino.mostrarInfo();
    }
}
