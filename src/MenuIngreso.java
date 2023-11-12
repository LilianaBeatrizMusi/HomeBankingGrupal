
public class MenuIngreso {

    public static void printMenu() {

        Imprimir.texto("Elija el número de opción que corresponda");
        Imprimir.texto("1. Ingresar");
        Imprimir.texto("2. Registrarse");
        String opcion = Teclado.texto();


        if (opcion.equals("1")) {
            SignIn.validar();
        }

        if (opcion.equals("2")) {
            SignUp.registrar();
        }
    }
}
