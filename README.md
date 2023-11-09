* Programar un menú ATM - Cajero Automático (home-banking).
	1.	Que tenga una pantalla de bienvenida y pida usuario y clave no es necesario plantear límites de ingresos.
	2.	Que al ingresar el menú muestre:
	a.	Datos del usuario, al seleccionarlo mostrará por pantalla los datos y podremos volver al menú inicial o bien salir del home-banking. 
	b.	Un saldo ficticio,  al seleccionarlo mostrará por pantalla el saldo disponible y podremos volver al menú inicial o bien salir del home-banking. 
	c.	Una opción transferencia 
	d.	Y una opción pago online.
	3.	Tras el cierre de sesión en todos los casos arrojará la leyenda por favor extraiga su tarjeta. 
	4.	La operación de transferencia será a una cuenta ficticia donde podremos colocar CBU o Alias y el monto a transferir, el sistema nos dará aviso de que la operación de transferencia a dicho usuario por el monto establecido fue realizada con éxito, adicionalmente tendremos en cuenta la validación de que el fondo a transferir sea menor o igual al disponible, en caso de que no valide, el sistema nos devolverá la leyenda “La operación no puede realizarse por falta de fondos”, tras esta operación el descuento se verá reflejado en el saldo. Esta sección también contendrá la opción cerrar sesión o regresar al menú.
	5.	La sección de pago de algún servicio, El usuario podrá ingresar o seleccionar el nombre de la empresa o servicio a pagar y a continuación el monto a pagar, luego del pago, deberá descontarse este monto del saldo. El sistema deberá permitir seguir pagando servicios mientras el saldo disponible sea mayor al monto a pagar, cuando el saldo sea insuficiente la operación no podrá realizarse y mostrará la leyenda “Saldo insuficiente”, esta sección también, tendrá una opción cerrar sesión, o regresar al menú.
	6.	Los usuarios y claves podrán ser consumidos desde un listado dinámico dentro del código o bien desde un archivo .dat que guarde las estructuras dinámicas.
	7.	Dejen volar su imaginación tanto como quieran.