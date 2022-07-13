package Polimorfismo.br.com.byteBank.teste;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Gabriel";
        String trim = "  Gabriel   ";
        String empty = "";

        //String novo = nome.replace("G", "g");
        //String novo = nome.toLowerCase();
        //String novo = nome.toUpperCase();

        //System.out.println(novo);

        char c = nome.charAt(3);
        System.out.println(c);

        int pos = nome.indexOf("el");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        for (int i = 0; i < nome.length(); i++){

            System.out.println(nome.charAt(i));
        }

        System.out.println(trim.trim());
        System.out.println(empty.isEmpty());


    }
}
