package br.com.alura.gerenciadorCursos.aula;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Conhecendo ainda mais de listas";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula : " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("Primeira aula é: " + primeiraAula);

        for (int i =0; i< aulas.size(); i++){
            System.out.println("aula :" + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo :" + aula);
        });

        Collections.sort(aulas);
    }
}
