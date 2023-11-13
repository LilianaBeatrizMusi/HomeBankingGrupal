public class Cuenta {
  // Declaración e inicialización de variables

  public static double patrimonio = 50000.0;

  // Métodos del switch
  public static void pagarServicio() {
    Imprimir.texto("Ingrese el importe a pagar: $ ");
    double cantidad = Teclado.nbr();
    if (cantidad > 0 && cantidad <= patrimonio) {
      patrimonio -= cantidad;
      Imprimir.texto("Pago $" + cantidad + " - Su pago fue registrado");
    } else {
      Imprimir.texto("Su pago fue rechazado por falta de fondos");
    }
  }

  public static double verBalance() {
    Imprimir.texto("El saldo es: $ " + patrimonio);
    return patrimonio;
  }

  public static void depositar() {
    Imprimir.texto("Ingrese el monto a depositar: $ ");
    double cantidad = Teclado.nbr();
    if (cantidad > 0) {
      patrimonio += cantidad;
      Imprimir.texto("Deposito: $ " + cantidad);
    } else {
      Imprimir.texto("Deposito invalido ");
    }
  }

  public static void retirar() {
    Imprimir.texto("Ingrese el monto a retirar: $ ");
    double cantidad = Teclado.nbr();
    if (cantidad > 0 && cantidad <= patrimonio) {
      patrimonio -= cantidad;
      Imprimir.texto("Retiro $" + cantidad + "operacion exitosa");
    } else {
      Imprimir.texto("No cuenta con fondos suficientes para dicha operacion");
    }
  }

  public static void pagar() {
    String opcion;

    Imprimir.texto("Listados de servicios a pagar:");
    Imprimir.texto("1. Electridad");
    Imprimir.texto("2. Gas");
    Imprimir.texto("3. Telefonia celular");
    Imprimir.texto("4. Pre-paga");
    Imprimir.texto("              ");
    Imprimir.texto("Ingrese la opcion que desea pagar y oprima ENTER");
    // Proceso 2.1.1.1 - SWITCH para elegir opcion del menu de pago de servicios
    opcion = Teclado.texto();
    switch (opcion) {
      case "1": // SWITCH menu de pago de servicios - Opcion 1: Electricidad
        Imprimir.texto("Ustedes esta por abonar la factura de Electricidad.");
        pagarServicio();
        break;
      case "2": // SWITCH menu de pago de servicios - Opcion 2: Gas
        Imprimir.texto("Ustedes esta por abonar la factura de Gas.");
        pagarServicio();
        break;
      case "3": // SWITCH menu de pago de servicios - Opcion 3: Telefonia Celular
        Imprimir.texto("Ustedes esta por abonar la factura de Telefonia Celular.");
        pagarServicio();
        break;
      case "4": // SWITCH menu de pago de servicios - Opcion 4: Pre-Paga
        Imprimir.texto("Ustedes esta por abonar la factura de la Pre-Paga.");
        pagarServicio();
        break;
      default:
        Imprimir.texto("La opcion ingresada no es correcta. Intente nuevamente");
        pagar();
        return;
    }
  }

  public static void transferir() {
    Imprimir.texto("Ingrese el importe a transferir: $ ");
    double cantidad = Teclado.nbr();
    if (cantidad > 0 && cantidad <= patrimonio) {
      patrimonio -= cantidad;
      Imprimir.texto("Pago $" + cantidad + "su transferencia fue registrada");
    } else {
      Imprimir.texto("Su transferencia fue rechazada por falta de fondos");
    }
  }
}
