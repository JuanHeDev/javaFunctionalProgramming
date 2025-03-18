package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CrearStreams {
    public static void main(String[] args) {
        //Coleccion
        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream(); //Abstraccion

        //Stream
        Stream<User> filter = stream.filter(user -> user.age >= 18);

        //Arreglo
        int[] numbers = {1,2,3,4,5};
        Stream numbersS =Stream.of(numbers);

        //Secuencia
        Stream.of("Rafael", "Marco", "Manuel", "Raul", "Ana");
    }
}
