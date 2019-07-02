package br.com.tutorialjava8.streams;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Tutorial");
        palavras.add("Java8");
        palavras.add("Estudo");

        palavras.stream()
                .filter(s -> s.length() < 6)
                .forEach(System.out::println);
    }
}
