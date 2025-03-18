package streams;

import java.util.ArrayList;
import java.util.List;

public class FiltrarElementos {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rafael", 18));
        users.add(new User("Marco", 25));
        users.add(new User("Manuel", 17));
        users.add(new User("Raul", 20));
        users.add(new User("Ana", 16));

        long cantidad = users.stream()
                .filter(user -> user.age >= 18)
                .filter(user -> user.name.startsWith("R"))
                .count();
        System.out.println(cantidad);
    }
}
