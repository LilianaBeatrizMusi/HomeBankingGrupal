public class Menu {
   
    
    String pin = "1234";

    // Declaracion e instanciacion  de las variables
    double patrimonio = 50000.00;
    double cantidad;
    String op_menu;

    while(!opcion.contentEquals(pin)) {
      Imprimir.imprimirTexto("Bienvenido/a La Banca de Codo a Codo ");
      Imprimir.imprimirTexto("Ingrese su pin ");
      
    }

    while(true) {
  
      Imprimir.imprimirTexto("Menu");
      Imprimir.imprimirTexto("1. Consultar Saldo");
      Imprimir.imprimirTexto("2. Depositar");
      Imprimir.imprimirTexto("3. Retirar Efectivo");
      Imprimir.imprimirTexto("4. Pagar Servicios");
      Imprimir.imprimirTexto("5. Transferencia");
      Imprimir.imprimirTexto("6. Salir");
      Imprimir.imprimirTexto("Ingrese una opcion");
     
      op_menu = teclado.nextLine();

      if (op_menu.contentEquals("6")) {
        System.out.println(" ******Gracias por su visita****** ");
        break;
      }

      // Proceso de la estructura switch
      switch(op_menu) {
      case "1":
        System.out.println("El saldo es: $ " + patrimonio);
      break;

      case "2":
        System.out.println("Ingrese el monto a depositar: $ ");
        cantidad = teclado.nextDouble();
      
        if (cantidad > 0) {
          patrimonio += cantidad;
          System.out.println("Deposito: $ " + cantidad);
        } else {
          System.out.println("Deposito invalido ");
        }
        break;

        case "3":
          System.out.println("Ingrese importe a retirar: $ ");
          cantidad = teclado.nextDouble();
      
          if(cantidad > 0 && cantidad <= patrimonio){
            patrimonio -= cantidad; 
            System.out.println("Retiro $" + cantidad + "operacion exitosa");
          } else {
            System.out.println("No cuenta con fondos suficientes para dicha operacion");
          }
          break;

        case "4":
          System.out.println("Ingrese importe a pagar: $ ");
          cantidad = teclado.nextDouble();
          
          if(cantidad > 0 && cantidad <= patrimonio){
            patrimonio -= cantidad;
            System.out.println("Pago $" + cantidad+ "su pago fue registrado");
          } else {
            System.out.println("Su pago fue rechazado por falta de fondos");
          }
          break;

          case "5":
          System.out.println("Ingrese importe a transferir: $ ");
          cantidad = teclado.nextDouble();
          if (cantidad < 50000.00 && cantidad <= patrimonio){
          patrimonio -= cantidad;
          System.out.println("Transferencia $" + cantidad+ "transferencia exitosa");
          } else {

          System.out.println("Transferencia rechazada por falta de fondos");

          }
          break;
        
        default:
            break;
        }
    }

    leer.close();
    teclado.close();
  }
}








    
}
