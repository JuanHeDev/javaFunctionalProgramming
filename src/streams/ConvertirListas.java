package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertirListas {
    public static void main(String[] args) {
        //Obtener todos los usuarios que tengan una edad mayor a 18

        List<User> users = new ArrayList<>();
        users.add(new User("Rafael", 18));
        users.add(new User("Marco", 25));
        users.add(new User("Manuel", 17));
        users.add(new User("Raul", 20));
        users.add(new User("Ana", 19));

        List<User> newUsers = users.stream()
                .filter(user -> user.age >= 18)
                .collect(Collectors.toList());
        System.out.println(newUsers);
    }
}
