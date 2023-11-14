
public class MenuIngreso {

    public static void printMenu() {
        Imprimir.texto("***********************************************");
        Imprimir.texto("");
        Imprimir.texto("1- Si usted ya es cliente oprima 1 para ingresar");
        Imprimir.texto("");
        Imprimir.texto("2- Si es un cliente nuevo oprima 2 para registrarse");
        Imprimir.texto("");
        Imprimir.texto("***********************************************");
        String opcion = Teclado.texto();


        if (opcion.equals("1")) {
            SignIn.validar();
        }

        if (opcion.equals("2")) {
            SignUp.registrar();
        }
    }
}
