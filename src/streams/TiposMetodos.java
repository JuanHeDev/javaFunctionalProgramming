package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TiposMetodos {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rafael", 18));
        users.add(new User("Marco", 25));
        users.add(new User("Manuel", 17));
        users.add(new User("Raul", 20));
        users.add(new User("Ana", 16));

        //Proceso
        //Iteracion interna

        //Retornan un nuevo Stream
        //Retornan un valor en concreto
        Stream<User> stream = users.stream();
        //Filter -> Abstraccion -> Nuevo Stream
        System.out.println(stream.filter(user -> user.age >= 18));

    }
}
