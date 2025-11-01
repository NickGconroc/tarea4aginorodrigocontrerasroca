package halloween;

/**
 * Clase Main que controla el bucle principal del juego.
 * El juego se repite mientras el jugador sea devuelto al inicio por el espíritu.
 */
public class Main {
    public static void main(String[] args) {

        boolean continuar = true;

        // Bucle principal: se repite hasta que el jugador escape o gane
        while (continuar) {

            // 1) Bienvenida
            Juego.bienvenidaJuego();

            // 2) Entrar o salir
            String eleccion = Juego.entrarOSalir();
            if (eleccion.equalsIgnoreCase("Salir")) {
                break; // termina el programa si el jugador sale
            }

            // 3) El espíritu abre puerta o ventana
            int decision = Juego.abrirPuertaOVentana();

            // 4) Dependiendo de la decisión, se obtiene la elección de sala
            String lugar;
            if (decision == 0) {
                lugar = Juego.entrarPorPuerta(); // Biblioteca o Salon
            } else {
                lugar = Juego.entrarPorVentana(); // Despensa o Pasillo
            }

            // 5) Se ejecuta la situación correspondiente (0 = tenebrosa, 1 = escapar)
            int resultadoSituacion = -1;
            if (lugar.equalsIgnoreCase("Biblioteca")) {
                resultadoSituacion = Juego.situacionBiblioteca();
            } else if (lugar.equalsIgnoreCase("Salon")) {
                resultadoSituacion = Juego.situacionSalon();
            } else if (lugar.equalsIgnoreCase("Despensa")) {
                resultadoSituacion = Juego.situacionDespensa();
            } else if (lugar.equalsIgnoreCase("Pasillo")) {
                resultadoSituacion = Juego.situacionPasillo();
            }

            // 6) Evaluar resultado:
            if (resultadoSituacion == 1) {
                // Caso: ha encontrado la forma de escapar
                System.out.println("¡Has escapado con vida! Fin del juego.");
                continuar = false;
            } else if (resultadoSituacion == 0) {
                // Caso: situación tenebrosa -> jugar contra el espíritu
                boolean haGanado = Juego.juegoAdivinaNumero();
                if (haGanado) {
                    System.out.println("¡Eres el héroe del pueblo! Has liberado la casa del espíritu maligno.");
                    continuar = false; // termina el juego si ganas
                } else {
                    // Si no adivinas, el espíritu te devuelve al inicio: continuar = true (bucle repite)
                    System.out.println("El espíritu te devuelve al inicio... Vuelve a intentarlo.");
                    // el while se repetirá automáticamente
                }
            } 
        }

        System.out.println("Gracias por jugar a 'La casa del terror'.");
    }
}