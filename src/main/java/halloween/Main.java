package halloween;

public class Main {
    public static void main(String[] args) {

        
        // do{
            
            Juego.bienvenidaJuego();

            Juego.abrirPuertaOVentana();

            Juego.entrarOSalir();

            switch (Juego.abrirPuertaOVentana()) {
                case 0: // PUERTA
                String decision = Juego.entrarPorPuerta();
                System.out.println(decision);
                    
                    break;
            
                case 1: // VENTANA
                
                String decision2 = Juego.entrarPorVentana();
                System.out.println(decision2);


                    break;

                default:
                    break;
            }



        // } while(true);
    }
}