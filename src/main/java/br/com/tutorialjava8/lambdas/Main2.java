package br.com.tutorialjava8.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Tutorial");
        palavras.add("Java");
        palavras.add("Estudo");

        palavras.forEach(s -> System.out.println(s));
    }
}
