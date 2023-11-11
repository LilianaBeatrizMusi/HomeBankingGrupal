public class Menu {
   public static void ejecutar(){

    String opcion;
      Imprimir.texto("Menu");
      Imprimir.texto("1. Consultar Saldo");
      Imprimir.texto("2. Depositar");
      Imprimir.texto("3. Retirar Efectivo");
      Imprimir.texto("4. Pagar Servicios");
      Imprimir.texto("5. Transferencia");
      Imprimir.texto("6. Salir");
      Imprimir.texto("Ingrese una opcion");
      opcion = Teclado.texto();
     
     

  

      // Proceso de la estructura switch por recursión
     switch(opcion) {
      case "1":
        Cuenta.verBalance();
        Imprimir.texto("Oprima una tecla para continuar...");
        Teclado.texto();
        ejecutar();
        break;

      case "2":
        Cuenta.depositar();
        Imprimir.texto("Oprima una tecla para continuar...");
        Teclado.texto();
        ejecutar();
        break;

        case "3":
          Cuenta.retirar();
          Imprimir.texto("Oprima una tecla para continuar...");
          Teclado.texto();
          ejecutar();
          break;

        case "4":
         Cuenta.pagar();
         Imprimir.texto("Oprima una tecla para continuar...");
         Teclado.texto();
         ejecutar();
         break;

          case "5":
          Cuenta.transferir();
          Imprimir.texto("Oprima una tecla para continuar...");
          Teclado.texto();
          ejecutar();
          break;

          case "6":
          Imprimir.texto(" ****** Gracias por su visita ****** ");
          System.exit(0);
          break;
  
        default:
          Imprimir.texto("La opción ingresada es incorrecta.");
          ejecutar();
          break;
        }
    }
  }

    