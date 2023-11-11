    import java.util.Calendar;
    import java.util.GregorianCalendar;
    
    public class SignIn {
    
        public static void ejecutar() {
            String pin = "1234";
            String opcion = "";
            int intentos = 0;
            final int MAX_INTENTOS = 3;
        
            do {
                Imprimir.texto("");
                Calendar c1 = GregorianCalendar.getInstance();
                Imprimir.texto("Dia y hora actual: " + c1.getTime());
                Imprimir.texto("      ");
                Imprimir.texto("Bienvenido al cajero automático del Banco Codo a Codo. ");
                Imprimir.texto("Usted a ingresado al menú desarrolado");
                Imprimir.texto("por jóvenes principiantes futuros desarrolladores");
                Imprimir.texto("Ingrese su pin ");
                opcion = Teclado.texto();
                intentos++;
    
                if (opcion.equals(pin)) {
                    Imprimir.texto("¡Inicio de sesión exitoso!");
                    break;
                } else if (intentos < MAX_INTENTOS) {
                    Imprimir.texto("PIN incorrecto. Inténtelo de nuevo.");
                } else {
                    Imprimir.texto("Demasiados intentos. Inténtelo más tarde.");
                    System.exit(0); // Exit the program
                }
    
            } while (intentos < MAX_INTENTOS);
        }   
    
}
