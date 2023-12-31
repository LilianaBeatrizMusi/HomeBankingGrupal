import java.util.Scanner;

public class Continua {

    public static void continuar() {
        Imprimir.texto("Oprima una tecla para continuar...");
        Teclado.texto();
    }

    public static void elegir() {
        String seguir = "si";
        Imprimir.texto("¿Quiere realizar otra operación? si/NO");
        seguir = Teclado.texto();
        if (seguir.equalsIgnoreCase("si")) {
            Menu.ejecutar();
        } else
            Imprimir.texto(" ");
            Imprimir.texto("***Gracias por operar en nuestro banco.***");
            Imprimir.texto(" ");
            Imprimir.texto(" ****** Por favor, extraiga su tarjeta ****** ");
        System.exit(0);
    }

    public static void repagar() {// Volver a pagar un servicio

        Imprimir.texto("¿Desea realizar otro pago de servicios?");
        Imprimir.texto("1 (SI)");
        Imprimir.texto("2 (NO)");

        // String opcionRepago = Teclado.texto();
        Scanner scanner = new Scanner(System.in);
        String opcionRepago = scanner.nextLine();
        System.out.println("Usted presionó la opción: " + opcionRepago);
        scanner.close();

        switch (opcionRepago) {
            case "1":
                Cuenta.pagar();
                break;
            case "2":
                Continua.elegir();
                break;
            default:
                // Imprimir.texto("Opcion inexistente");
                repagar();
                break;
        }
    }
}

