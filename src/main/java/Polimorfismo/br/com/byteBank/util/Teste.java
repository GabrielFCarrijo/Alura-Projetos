package Polimorfismo.br.com.byteBank.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String [] nomes = new String[5];

        int idade = 29; // Integer
        Integer ref = new Integer(29);

        List<Integer> numeros = new ArrayList();

        numeros.add(idade); // AutoBoxing
        numeros.add(ref);
    }
}
