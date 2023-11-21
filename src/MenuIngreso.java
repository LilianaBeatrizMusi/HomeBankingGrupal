//import java.util.InputMismatchException;

import java.util.InputMismatchException;

public class MenuIngreso {

    public static void printMenu() {
        Imprimir.texto("***********************************************");
        Imprimir.texto("");
        Imprimir.texto("1- Si usted ya es cliente oprima 1 para ingresar");
        Imprimir.texto("");
        Imprimir.texto("2- Si es un cliente nuevo oprima 2 para registrarse");
        Imprimir.texto("");
        Imprimir.texto("***********************************************");
        //String opcion = Teclado.texto();
       
        try {
            int opcion = Integer.parseInt(Teclado.texto());

            // Process the user input (e.g., switch statement or if-else statements based on 'opcion')
            switch (opcion) {
                case 1:
                    SignIn.validar();
                    break;
                case 2:
                    SignUp.registrar();
                    break;
                default:
                    Imprimir.texto("Opción no válida. Introduzca 1 o 2.");
                    printMenu();
            }
        } catch (NumberFormatException e) {
            Imprimir.texto("Debe introducir un número válido");
            printMenu();
        } catch (InputMismatchException e) {
            Imprimir.texto("Debe introducir una opción válida");
            printMenu();
        }


       /* if (opcion.equals("1")) {
            SignIn.validar();
        }

        if (opcion.equals("2")) {
            SignUp.registrar();
        }*/
    }

    
    }

