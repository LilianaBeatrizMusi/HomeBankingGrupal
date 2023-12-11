import java.util.ArrayList;
import java.util.List;

public class Database {    
    public static boolean isUserExists(String name, String password) {
        return UserDBHandler.authenticateUser(name, password);
    }

    public static boolean createUser(String nombre, String password) {
        return UserDBHandler.createUser(nombre, password);
    }
}

