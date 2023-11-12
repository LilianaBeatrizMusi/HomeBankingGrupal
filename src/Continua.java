public class Continua {

    public static void continuar() {
        Imprimir.texto("Oprima una tecla para continuar...");
        Teclado.texto();
    }

    public static void elegir() {
        String seguir = "si";
        Imprimir.texto("¿Quiere volver al MENU? si/NO");
        seguir = Teclado.texto();
        if (seguir.equalsIgnoreCase("si")) {
            Menu.ejecutar();
        } else
            Imprimir.texto(" ****** Gracias por su visita ****** ");
            System.exit(0);

    }
}
