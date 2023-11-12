public class SignUp {
    public static void registrar() {
       // Definición de variables
        String usuario;
        String contrasena;

        // Procedimiento
        do {
            Imprimir.texto("Ingrese su usuario: ");
            usuario = Teclado.texto(null);
        } while (usuario.length() == 0);

        do {
            Imprimir.texto("Ingrese su contraseña: ");
            contrasena = Teclado.texto(null);
        } while (contrasena.length() == 0);

        boolean isCreated = Database.createUser(usuario, contrasena);

        if (isCreated) {
            Imprimir.texto("***********************************");
            Imprimir.texto("¡Usuario registrado correctamente!");
            Imprimir.texto("Usuario: " + usuario);
            Imprimir.texto("Contraseña: " + contrasena);
            Imprimir.texto("***********************************");
        } else {
            Imprimir.texto("***********************************");
            Imprimir.texto("¡Error al registrar el usuario!");
            Imprimir.texto("***********************************");
        }
       
    }

    }

