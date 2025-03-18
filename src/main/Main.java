package main;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //El compilador infiere el tipo de los parametros
        //Podemos modificar el nombre de los parametros
        //Siempre que tengamos un solo parametro podemos omitir los parentesis
        //Siempre que se ejecute una unica sentencia podemos omitir las llaves

        //ISaludar saludar = usuario -> { System.out.println("hola mundo "+ usuario); };
        //saludar.saluda("Codi");

        /*
        ISaludar saludar2 = nombre -> {
            if(nombre.equals("Codi")){
                System.out.println("hola codi");
            }else {
                System.out.println("hola "+ nombre);
            }
        };
        saludar2.saluda("Marco");
        */

        ISuma suma = (val1, val2) -> val1 + val2;
        int resultado = suma.suma(10,20);
        //System.out.println(resultado);

        /*
        suma = (val1, val2) -> {
            int res = val1 + val2;
            System.out.println("EL RESULTADO ES "+ res);
            return res;
        };
        */

        resultado = suma.suma(100,200);
        //System.out.println(resultado);

        IPromedio operaciones;

        double numeros[] = {7.9,8.9,10};
        operaciones = (double calificaciones[]) -> {
            int sum = 0;
            for (int i=1; i < calificaciones.length; i++){
                sum += calificaciones[i];
            }
            return sum / calificaciones.length;
        };

        float promedio = operaciones.promedio(numeros);
        //System.out.println("El promedio es "+ promedio);

        Function<Integer,Integer> factorial = n -> {
            if (n==0||n==1) return 1;
            int res = 1;
            for (int i=1; i <= n; i++){
                res *= i;
            }
            return res;
        };
        int numero = 5;
        System.out.println("El factorial de "+ numero + " es "+ factorial.apply(numero));

        UnaryOperator<Integer> factorial2 = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n) {
                return (n == 0 || n == 1) ? 1 : n * this.apply(n - 1);
            }
        };
        System.out.println("El factorial de "+ numero + " es "+ factorial2.apply(numero));

    }
}