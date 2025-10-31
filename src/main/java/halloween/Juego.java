package halloween;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    /*
     * El juego se inicia dando la bienvenida al usuario a la casa del terror.
     * Al iniciar el juego, el espíritu de la casa informa al usuario del
     * sufrimiento
     * que va a padecer si entra y lo asusta para que no lo haga.
     * Aleatoriamente, el espíritu decide abrir una puerta o una ventana de la casa
     * y se lo indica al jugador.
     * En este momento le pregunta si realmente quiere entrar o está tan aterrado
     * que prefiere salir.
     * 
     * Si decide entrar y lo hace por la puerta, el usuario avanza hasta el
     * recibidor de la casa y debe elegir
     * si quiere abrir la puerta de la biblioteca o la puerta del salón.
     * En cada una de estas estancias pueden pasar dos situaciones, una siempre es
     * tenebrosa
     * y en la otra consigue escapar de la casa. Por ejemplo, si decide entrar en la
     * biblioteca puede pasar
     * que salga un grupo de zombis del suelo buscándote para comerte o que
     * encuentres un agujero en el suelo
     * que te permite escapar de la casa. Si decide entrar al salón puede pasar que
     * venga Frankenstein con intención
     * de estrangularte o que haya una escalera en la chimenea y consigas escapar...
     * 
     * Si el jugador decide entrar por la ventana, el usuario llega a la cocina de
     * la casa y debe elegir
     * si quiere abrir la puerta de despensa o la puerta que da al pasillo. En cada
     * una de estas estancias pueden
     * pasar dos situaciones, una siempre es tenebrosa y la otra es que consigues
     * escapar.
     * Inventa tus propias situaciones. Dale un toque personal al juego.
     * 
     * En cualquier caso, al entrar en una estancia el juego elige aleatoriamente
     * entre una de las dos posibles
     * situaciones. Si surge la situación tenebrosa, entonces el espíritu de la casa
     * aparece para jugar contigo.
     * El maligno pensará un número entre 1 y 20 (aleatoriamente) y le dará 3 vidas
     * al jugador para adivinarlo.
     * Si el jugador lo adivina antes de las tres rondas, entonces libera a la casa
     * del espíritu y se proclama
     * héroe del pueblo. En caso contrario, el espíritu maligno devuelve al jugador
     * a la posición inicial para
     * seguir torturándolo.
     */

    

    // El juego se inicia dando la bienvenida al usuario a la casa del terror.
    // Al iniciar el juego, el espíritu de la casa informa al usuario del
    // sufrimiento
    // que va a padecer si entra y lo asusta para que no lo haga.

    public static void bienvenidaJuego() {
        System.out.println("Bienvenido a la casa del terror");
        System.out.println("El espíritu de la casa te informa del sufrimiento que vas a padecer si entras");
        System.out.println("¡¡¡BUAHAHAHAHAHA!!!");
    }

    // PUERTA O VENTANA

    // Aleatoriamente, el espíritu decide abrir una puerta o una ventana de la casa
    // y se lo indica al jugador.

    public static int abrirPuertaOVentana() {

        Random ran = new Random();
        int eleccion = ran.nextInt(2); // 0 puerta, 1 ventana

        if (eleccion == 0) {
            System.out.println("El espíritu ha abierto una puerta de la casa");
        } else {
            System.out.println("El espíritu ha abierto una ventana de la casa");
        }
        return eleccion;

    }

    // SEGUIR O SALIR
    // En este momento le pregunta si realmente quiere entrar o está tan aterrado
    // que prefiere salir.
    public static String entrarOSalir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Quieres entrar en la casa o prefieres salir? (Entrar/Salir)");
        String eleccion = teclado.nextLine();
        do{
        if (eleccion.equalsIgnoreCase("Entrar")) {
            System.out.println("Has decidido entrar en la casa del terror");
        } else if( eleccion.equalsIgnoreCase("Salir")) {
            System.out.println("Has decidido salir corriendo de la casa del terror. ¡Hasta luego!");
            break;
        }
        }while(!eleccion.equalsIgnoreCase("Entrar") && !eleccion.equalsIgnoreCase("Salir"));
        return eleccion;
    }

    // 1 PUERTA
    // BIBLIOTECA O SALÓN
    // Si decide entrar y lo hace por la puerta, el usuario avanza hasta el
    // recibidor de la casa y debe elegir
    // si quiere abrir la puerta de la biblioteca o la puerta del salón.

    public static String entrarPorPuerta() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Has entrado por la puerta y estás en el recibidor de la casa");
        String eleccion = "";
        do{          
        System.out.println("¿Quieres abrir la puerta de la biblioteca o la del salón? (Biblioteca/Salón)");
        eleccion = teclado.nextLine();
        if (eleccion.equalsIgnoreCase("Biblioteca")) {
            System.out.println("Has decidido abrir la puerta de la biblioteca");
        } else if (eleccion.equalsIgnoreCase("Salón")) {
            System.out.println("Has decidido abrir la puerta del salón");

        }
        }while(!eleccion.equalsIgnoreCase("Biblioteca") && !eleccion.equalsIgnoreCase("Salón"));
        return eleccion;
    }

    // 1.2 PUERTA
    // BIBLIOTECA
    // En cada una de estas estancias pueden pasar dos situaciones, una siempre es
    // tenebrosa
    // y en la otra consigue escapar de la casa. Por ejemplo, si decide entrar en la
    // biblioteca puede pasar
    // que salga un grupo de zombis del suelo buscándote para comerte o que
    // encuentres un agujero en el suelo
    // que te permite escapar de la casa...

    public static int situacionBiblioteca() {
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 tenebrosa, 1 escapar

        if (situacion == 0) {
            System.out.println("¡Un grupo de zombis ha salido del suelo para comerte!");
            Juego.juegoAdivinaNumero();
        } else {
            System.out.println("¡Has encontrado un agujero en el suelo que te permite escapar de la casa!");
        }
        return situacion;
    }

    // 1.2 PUERTA
    // SALÓN
    // Si decide entrar al salón puede pasar que
    // venga Frankenstein con intención
    // de estrangularte o que haya una escalera en la chimenea y consigas escapar...

    public static int situacionSalon() {
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 tenebrosa, 1 escapar

        if (situacion == 0) {
            System.out.println("¡Frankenstein ha venido con intención de estrangularte!");
            Juego.juegoAdivinaNumero();
        } else {
            System.out.println("¡Hay una escalera en la chimenea que te permite escapar de la casa!");
        }
        return situacion;

    }

    // 2. VENTANA
    // DESPENSA O PASILLO
    // * Si el jugador decide entrar por la ventana, el usuario llega a la cocina de
    // * la casa y debe elegir
    // * si quiere abrir la puerta de despensa o la puerta que da al pasillo.

    public static String entrarPorVentana() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Has entrado por la ventana y estás en la cocina de la casa");
        String eleccion = "";
        do{
        System.out.println("¿Quieres abrir la puerta de la despensa o la del pasillo? (Despensa/Pasillo)");
        eleccion = teclado.nextLine();
        if (eleccion.equalsIgnoreCase("Despensa")) {
            System.out.println("Has decidido abrir la puerta de la despensa");
        } else if (eleccion.equalsIgnoreCase("Pasillo")) {
            System.out.println("Has decidido abrir la puerta del pasillo");

        }
        }while(!eleccion.equalsIgnoreCase("Despensa") && !eleccion.equalsIgnoreCase("Pasillo"));
        return eleccion;
    }

    //2.1 VENTANA
    //DESPENSA
    // En cada
    // una de estas estancias pueden
    // pasar dos situaciones, una siempre es tenebrosa y la otra es que consigues
    // escapar.
    // Inventa tus propias situaciones. Dale un toque personal al juego.

    public static int situacionDespensa(){
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 tenebrosa, 1 escapar

        if (situacion == 0) {
            System.out.println("¡Un fantasma ha aparecido y te asusta hasta la muerte!");
            Juego.juegoAdivinaNumero();
        } else {
            System.out.println("¡Has encontrado una trampilla secreta que te permite escapar de la casa!");
        }
        return situacion;

    }
    //2.2 VENTANA
    //PASILLO

    public static int situacionPasillo(){
        Random ran = new Random();
        int situacion = ran.nextInt(2); // 0 tenebrosa, 1 escapar

        if (situacion == 0) {
            System.out.println("¡Un hombre lobo ha salido de las sombras para atacarte!");
            Juego.juegoAdivinaNumero();
        } else {
            System.out.println("¡Has encontrado una puerta trasera que te permite escapar de la casa!");
        }
        return situacion;

    }
    // En cualquier caso, al entrar en una estancia el juego elige aleatoriamente
    //  * entre una de las dos posibles
    //  * situaciones. Si surge la situación tenebrosa, entonces el espíritu de la casa
    //  * aparece para jugar contigo.
    //  * El maligno pensará un número entre 1 y 20 (aleatoriamente) y le dará 3 vidas
    //  * al jugador para adivinarlo.
    //  * Si el jugador lo adivina antes de las tres rondas, entonces libera a la casa
    //  * del espíritu y se proclama
    //  * héroe del pueblo. En caso contrario, el espíritu maligno devuelve al jugador
    //  * a la posición inicial para
    //  * seguir torturándolo.

    public static boolean juegoAdivinaNumero() {
        Scanner teclado = new Scanner(System.in);
        Random ran = new Random();
        int numeroSecreto = ran.nextInt(20) + 1;
        int vidas = 3;
        boolean haGanado = false;

        System.out.println("El espíritu maligno ha pensado un número entre 1 y 20. ¡Tienes 3 vidas para adivinarlo!");

        while (vidas > 0) {
            System.out.println("Introduce tu número:");
            int intento = teclado.nextInt();

            if (intento == numeroSecreto) {
                haGanado = true;
                System.out.println("¡Felicidades! Has adivinado el número y has liberado a la casa del espíritu maligno.");
                break;
            } else {
                vidas--;
                System.out.println("Número incorrecto. Te quedan " + vidas + " vidas.");
            }
        }

        if (!haGanado) {
            System.out.println("No has adivinado el número. El espíritu maligno te devuelve a la posición inicial.");
        }

        return haGanado;
    }

}
