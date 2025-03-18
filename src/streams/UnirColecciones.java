package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnirColecciones {
    public static void main(String[] args) {
        //FlatMap

        List<String> nombres1 = Arrays.asList("Rafael", "Marco");
        List<String> nombres2 = Arrays.asList("Manuel", "Raul", "Ana");
        List<String> nombres3 = Arrays.asList("Rafael", "Marco");

        List<String> result = Stream.of(nombres1, nombres2, nombres3)
                .flatMap(elemento -> elemento.stream()) //Genera una abstraccion
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
