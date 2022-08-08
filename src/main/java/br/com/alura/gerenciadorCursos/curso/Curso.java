package br.com.alura.gerenciadorCursos.curso;

import br.com.alura.gerenciadorCursos.aula.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String name;
    private String instructor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
}
