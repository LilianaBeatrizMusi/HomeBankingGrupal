import java.util.Calendar;
import java.util.GregorianCalendar;   
    public class SignIn {
        
        public static void validar() {
                       
            int intentos = 0;
            final int MAX_INTENTOS = 3;
        
            do {
                Imprimir.texto("Ingrese su usuario: ");
                String usuarioIngresado = Teclado.texto();
                Imprimir.texto("Ingrese su contraseña: ");
                String contraseñaIngresada = Teclado.texto();
    
                boolean isUserExist = Database.isUserExists(usuarioIngresado, contraseñaIngresada);
    
                intentos++;
                
                if (isUserExist) {
                    Imprimir.texto("");
                    Calendar c1 = GregorianCalendar.getInstance();
                    Imprimir.texto("Dia y hora actual: " + c1.getTime());
                    Imprimir.texto("");
                    Imprimir.texto("BIENVENIDO AL ATM DEL BANCO CODO A CODO.");
                    Imprimir.texto("USTED HA INGRESADO AL CÓDIGO DESARROLLADO");
                    Imprimir.texto("POR JÓVENES PRINCIPIANTES Y FUTUROS DESARROLLADORES");
                    Imprimir.texto("");
                    Menu.ejecutar();
                    break;
                } else if (intentos < MAX_INTENTOS) {
                    Imprimir.texto("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
                } else {
                    Imprimir.texto("Demasiados intentos. Inténtelo más tarde.");
                    System.exit(0); // Exit the program
                }
                
            } while (intentos < MAX_INTENTOS);
        }

       
        }   
        

