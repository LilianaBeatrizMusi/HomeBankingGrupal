public class Cuenta {
    // Declaración e inicialización de variables
       
   public static double patrimonio = 50000.0;
       

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

    public static void pagar(){
      Imprimir.texto("Ingrese el importe a pagar: $ ");
      double cantidad = Teclado.nbr();
      if(cantidad > 0 && cantidad <= patrimonio){
        patrimonio -= cantidad;
        Imprimir.texto("Pago $" + cantidad+ "su pago fue registrado");
      } else {
        Imprimir.texto("Su pago fue rechazado por falta de fondos");
      } 
    }

    public static void transferir(){
        Imprimir.texto("Ingrese el importe a transferir: $ ");
      double cantidad = Teclado.nbr();
      if(cantidad > 0 && cantidad <= patrimonio){
        patrimonio -= cantidad;
        Imprimir.texto("Pago $" + cantidad+ "su transferencia fue registrada");
      } else {
        Imprimir.texto("Su transferencia fue rechazada por falta de fondos");
      } 
    }



}
