public class Menu {
   public static void ejecutar(){

    //Diseño del menú del ATM
      Imprimir.texto("*** Menu ***");
      Imprimir.texto("");
      Imprimir.texto("1. Consultar Saldo");
      Imprimir.texto("2. Depositar");
      Imprimir.texto("3. Retirar Efectivo");
      Imprimir.texto("4. Pagar Servicios");
      Imprimir.texto("5. Transferencia");
      Imprimir.texto("6. Salir");
      Imprimir.texto("");
      Imprimir.texto("Ingrese una opcion");    
      String opcion = Teclado.texto();
      Continua.continuar();
      
      //Borrar consola
      System.out.print("\033[H\033[2J");  
      System.out.flush(); 

      

          

      // Proceso de la estructura switch con recursividad
     switch(opcion) {
      case "1":
        Cuenta.verBalance();
        Continua.continuar();
        Continua.elegir(); 
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        break;

      case "2":
        Cuenta.depositar();
        Continua.continuar();
        Continua.elegir(); 
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        ejecutar();
        break;

        case "3":
          Cuenta.retirar();
          Continua.continuar();
          Continua.elegir(); 
          System.out.print("\033[H\033[2J");  
          System.out.flush(); 
          ejecutar();
          break;

        case "4":
         Cuenta.pagar();
         Continua.continuar();
         Continua.elegir(); 
         System.out.print("\033[H\033[2J");  
         System.out.flush(); 
         ejecutar();
         break;

          case "5":
          Cuenta.transferir();
          Continua.continuar();
          Continua.elegir(); 
          System.out.print("\033[H\033[2J");  
          System.out.flush(); 
          ejecutar();
          break;

          case "6":
          Imprimir.texto(" ****** Por favor, extraiga su tarjeta ****** ");
          System.exit(0);
          break;
  
        default:
          Imprimir.texto("La opción ingresada es incorrecta.");
          System.out.print("\033[H\033[2J");  
          System.out.flush(); 
          ejecutar();
          break;
        }
    }
  }

    