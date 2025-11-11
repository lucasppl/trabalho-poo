package br.com.main;
import br.com.abstração.*;

// Sistema para gerenciamento de uma escola de música online

public class Main {
    public static void main(String[] args) {

        CursoGuitarra cursoGuitarra = new CursoGuitarra();
        cursoGuitarra.iniciarCurso();
    }
}