package halloween;

public class Main {
    public static void main(String[] args) {

        
        do{
            
            Juego.bienvenidaJuego();
            
            int decision = -1;
            String resultadobibliotecaosalon = "" ;

            if (Juego.entrarOSalir().equalsIgnoreCase("Salir")){
                break;
            }else {
                decision = Juego.abrirPuertaOVentana();
            }
            

            if (decision == 0){
                resultadobibliotecaosalon = Juego.entrarPorPuerta();
            
            if (decision == 1){
                resultadobibliotecaosalon = Juego.entrarPorVentana();
            }
        }
        int resultadosituacionbiblio = -1;
        boolean resultadoadivina;
            if (resultadobibliotecaosalon.equalsIgnoreCase("Biblioteca"));{
                resultadosituacionbiblio = Juego.situacionBiblioteca();
                if (resultadosituacionbiblio == 0) {
                    resultadoadivina = Juego.juegoAdivinaNumero();
                    if(resultadoadivina = false)
                        System.out.println("¡Felicidades! Has ganado el juego.");
                        break;
                    }
             }else {             
                   break;
                }
                
            }

            if (resultadobibliotecaosalon.equalsIgnoreCase("Salón"));{
                Juego.situacionSalon();
            }
            
            



        } while(true);
    }}