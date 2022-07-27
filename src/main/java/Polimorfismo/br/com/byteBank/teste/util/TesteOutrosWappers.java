package Polimorfismo.br.com.byteBank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWappers {

    public static void main(String[] args) {

        Integer ref = Integer.valueOf(29);
        System.out.println(ref.doubleValue());

        Double doubleRef =2.4;
        System.out.println(doubleRef.doubleValue());

        Boolean booleanRef = Boolean.TRUE;
        System.out.println(booleanRef.booleanValue());

        Number numero = Float.valueOf(29f);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(56.8);
    }
}
