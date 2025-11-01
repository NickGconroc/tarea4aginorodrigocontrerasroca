package halloween;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase que contiene la lógica del juego "La casa del terror".
 * Cada método corresponde a una acción o situación del juego.
 */
public class Juego {

    // Scanner único para toda la clase (evita problemas de buffer y múltiples scanners)
    private static final Scanner teclado = new Scanner(System.in);

    /**
     * Muestra la bienvenida y la introducción al juego.
     */
    public static void bienvenidaJuego() {
        System.out.println("Bienvenido a la casa del terror...");
        System.out.println("El espíritu de la casa te informa del sufrimiento que vas a padecer si entras.");
        System.out.println("¡¡¡BUAHAHAHAHAHA!!!");
    }

    /**
     * Pregunta si el jugador quiere entrar o salir.
     * @return "Entrar" o "Salir" según lo elegido por el usuario.
     */
    public static String entrarOSalir() {
        String eleccion;
        do {
            System.out.println("¿Quieres entrar en la casa o prefieres salir? (Entrar/Salir)");
            eleccion = teclado.nextLine().trim();

            if (eleccion.equalsIgnoreCase("Entrar")) {
                System.out.println("Has decidido entrar en la casa del terror...");
            } else if (eleccion.equalsIgnoreCase("Salir")) {
                System.out.println("Has decidido salir corriendo de la casa del terror. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (!eleccion.equalsIgnoreCase("Entrar") && !eleccion.equalsIgnoreCase("Salir"));

        return eleccion;
    }

    /**
     * El espíritu decide al azar abrir una puerta o una ventana.
     * @return 0 si abre puerta, 1 si abre ventana.
     */
    public static int abrirPuertaOVentana() {
        Random ran = new Random();
        int eleccion = ran.nextInt(2); // 0 = puerta, 1 = ventana

        if (eleccion == 0) {
            System.out.println("El espíritu ha abierto una puerta de la casa...");
        } else {
            System.out.println("El espíritu ha abierto una ventana de la casa...");
        }
        return eleccion;
    }

    /**
     * Si entra por la puerta: pregunta si abre biblioteca o salon (sin tilde).
     * @return "Biblioteca" o "Salon"
     */
    public static String entrarPorPuerta() {
        String eleccion;
        do {
            System.out.println("Has entrado por la puerta y estás en el recibidor de la casa.");
            System.out.println("¿Quieres abrir la puerta de la biblioteca o la del salon? (Biblioteca/Salon)");
            eleccion = teclado.nextLine().trim();

            if (eleccion.equalsIgnoreCase("Biblioteca")) {
                System.out.println("Has decidido abrir la puerta de la biblioteca...");
            } else if (eleccion.equalsIgnoreCase("Salon")) {
                System.out.println("Has decidido abrir la puerta del salon...");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (!eleccion.equalsIgnoreCase("Biblioteca") && !eleccion.equalsIgnoreCase("Salon"));

        return eleccion;
    }

    /**
     * Si entra por la ventana: pregunta si abre despensa o pasillo.
     * @return "Despensa" o "Pasillo"
     */
    public static String entrarPorVentana() {
        String eleccion;
        do {
            System.out.println("Has entrado por la ventana y estás en la cocina de la casa.");
            System.out.println("¿Quieres abrir la puerta de la despensa o la del pasillo? (Despensa/Pasillo)");
            eleccion = teclado.nextLine().trim();

            if (eleccion.equalsIgnoreCase("Despensa")) {
                System.out.println("Has decidido abrir la puerta de la despensa...");
            } else if (eleccion.equalsIgnoreCase("Pasillo")) {
                System.out.println("Has decidido abrir la puerta del pasillo...");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (!eleccion.equalsIgnoreCase("Despensa") && !eleccion.equalsIgnoreCase("Pasillo"));

        return eleccion;
    }

    /**
     * Situación aleatoria en la biblioteca.
     * @return 0 si ocurre la situación tenebrosa (se jugará contra el espíritu), 1 si escapas.
     */
    public static int situacionBiblioteca() {
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 = tenebrosa, 1 = escapar

        if (situacion == 0) {
            System.out.println("¡Un grupo de zombis ha salido del suelo para comerte!");
        } else {
            System.out.println("¡Has encontrado un agujero en el suelo que te permite escapar de la casa!");
        }
        return situacion;
    }

    /**
     * Situación aleatoria en el salon.
     * @return 0 si ocurre la situación tenebrosa, 1 si escapas.
     */
    public static int situacionSalon() {
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 = tenebrosa, 1 = escapar

        if (situacion == 0) {
            System.out.println("¡Frankenstein ha venido con intención de estrangularte!");
        } else {
            System.out.println("¡Hay una escalera en la chimenea que te permite escapar de la casa!");
        }
        return situacion;
    }

    /**
     * Situación aleatoria en la despensa.
     * @return 0 si ocurre la situación tenebrosa, 1 si escapas.
     */
    public static int situacionDespensa() {
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 = tenebrosa, 1 = escapar

        if (situacion == 0) {
            System.out.println("¡Un fantasma ha aparecido y te asusta hasta la muerte!");
        } else {
            System.out.println("¡Has encontrado una trampilla secreta que te permite escapar de la casa!");
        }
        return situacion;
    }

    /**
     * Situación aleatoria en el pasillo.
     * @return 0 si ocurre la situación tenebrosa, 1 si escapas.
     */
    public static int situacionPasillo() {
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 = tenebrosa, 1 = escapar

        if (situacion == 0) {
            System.out.println("¡Un hombre lobo ha salido de las sombras para atacarte!");
        } else {
            System.out.println("¡Has encontrado una puerta trasera que te permite escapar de la casa!");
        }
        return situacion;
    }

    /**
     * Juego para adivinar el número que piensa el espíritu.
     * Maneja InputMismatchException con la variable ime (como solicitaste).
     * @return true si el jugador adivina el número, false si agota vidas.
     */
    public static boolean juegoAdivinaNumero() {
        Random ran = new Random();
        int numeroSecreto = ran.nextInt(20) + 1;
        int vidas = 3;

        System.out.println("El espíritu maligno ha pensado un número entre 1 y 20. ¡Tienes 3 vidas para adivinarlo!");

        while (vidas > 0) {
            System.out.print("Introduce tu número: ");
            try {
                int intento = teclado.nextInt();
                teclado.nextLine(); // limpiar buffer

                if (intento == numeroSecreto) {
                    System.out.println("¡Felicidades! Has adivinado el número y has liberado a la casa del espíritu maligno.");
                    return true;
                } else {
                    vidas--;
                    if (intento < numeroSecreto) {
                        System.out.println("El número es mayor. Te quedan " + vidas + " vidas.");
                    } else {
                        System.out.println("El número es menor. Te quedan " + vidas + " vidas.");
                    }
                }
            } catch (InputMismatchException ime) {
                System.out.println("Entrada no válida. Debes introducir un número entero.");
                teclado.nextLine(); // limpia la entrada no numérica
            }
        }

        System.out.println("No has adivinado el número. El espíritu maligno te devuelve a la posición inicial.");
        return false;
    }
}
