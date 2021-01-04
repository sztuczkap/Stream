package pl.sztuczkap;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

/*
        // 1. Strumień z kolekcji
        List<String> names = List.of("Ania", "Ola", "Tomek", "Adam");
        Stream<String> stream = names.stream();

        // 2. Strumień z Tablicy
        String[] languages = new String[]{"Java", "Python", "C++"};
        Stream<String> languagesStream = Stream.of(languages);
        Stream<String> languagesStream2 = Arrays.stream(languages, 1, 2);

        // 3. Strumień zero lub wiele elementów
        Stream<String> emptyStream = Stream.empty();
        Stream<String> elementsStream = Stream.of("One", "Two", "Three", "Four");

        // 4. Nieskończone strumienie
        Stream<String> infinityStream = Stream.generate(() -> "repeat");
        Stream<Double> infinityRandomStream = Stream.generate(Math::random); // strumień nieskończonych liczb losowych
        Stream<BigInteger> infinitySequence = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));  // nieskonczony ciąg 1,2,3...
*/

        // Metoda Filter
        List<String> names = List.of("Ania", "Ola", "Tomek", "Adam");
/*       for(String name : names){ // klasycznie za pomoca petli for
           if(name.contains("a")){
               System.out.println(name);
           }
       }*/

        names.stream()
                .filter(name -> name.contains("a"))
                .forEach(System.out::println);

    }
}
