package Polimorfismo.br.com.byteBank.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; // Integer

        Integer ref = Integer.valueOf(29);
        int valor = ref.intValue();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);

//      String s = args[0]; // "10"
//      Integer num = Integer.valueOf(s);
//      int num = Integer.parseInt(s);
//      System.out.println(num);

        List<Integer> numeros = new ArrayList();

        numeros.add(idade); // AutoBoxing
        numeros.add(ref);
    }
}
