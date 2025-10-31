package halloween;

public class Main {
    public static void main(String[] args) {

        
        do{
            
            Juego.bienvenidaJuego();
            
            if (Juego.entrarOSalir().equalsIgnoreCase("Salir")){
                break;
            }else if (Juego.entrarOSalir().equalsIgnoreCase("Entrar")) {
                Juego.abrirPuertaOVentana();
            }

            
            



        } while(true);
    }
}