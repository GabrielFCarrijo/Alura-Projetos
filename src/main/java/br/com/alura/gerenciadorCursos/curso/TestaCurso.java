package br.com.alura.gerenciadorCursos.curso;

import br.com.alura.gerenciadorCursos.aula.Aula;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Coleções", "Gabriel");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Trabalhando Com Array List", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando COm Coleções", 22));

        System.out.println(aulas);
        System.out.println(javaColecoes.getAulas());

    }
}

