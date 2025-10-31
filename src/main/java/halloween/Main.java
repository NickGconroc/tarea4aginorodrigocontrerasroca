package halloween;

public class Main {
    public static void main(String[] args) {

        
        do{
            
            Juego.bienvenidaJuego();
            
            if (Juego.entrarOSalir().equalsIgnoreCase("Salir")){
                break;
            }

            switch (Juego.abrirPuertaOVentana()) {
                case 0: // PUERTA
                String decision = Juego.entrarPorPuerta();
                
                if(Juego.entrarPorPuerta().equalsIgnoreCase("Biblioteca")){
                    Juego.situacionBiblioteca();
                if(Juego.situacionBiblioteca() == 1){
                    break;
                }
                }
                else if(Juego.entrarPorPuerta().equalsIgnoreCase("Salón")){
                    Juego.situacionSalon();
                }

                
                    
                    break;
            
                case 1: // VENTANA
                
                String decision2 = Juego.entrarPorVentana();
                System.out.println(decision2);


                    break;

                default:
                    break;
            }



        } while(true);
    }
}