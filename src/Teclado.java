//En esta clase generamos los métodos para utilizar teclados

import java.util.Scanner;

public class Teclado {
    //Declarar e instanciar el objeto scanner comode clase
    public static Scanner teclado = new Scanner(System.in);

    //Lectura de datos tipo String(alfanumérico)
    public static String texto(String string){
        return teclado.nextLine();
    }
    
    //Lectura de datos tipo double
    public static double nbr() {
        return teclado.nextDouble();
    }
}
