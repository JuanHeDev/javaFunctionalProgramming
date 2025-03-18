package streams;

import java.util.List;
import java.util.stream.Collectors;

public class TransformarValores {
    public static void main(String[] args) {
        //Obtener el cuadrado de todos los numeros en la lista
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> cuadrados = numeros.stream()
                                                .map(num -> num * num)
                                                .collect(Collectors.toList());

        System.out.println(cuadrados);

    }
}
