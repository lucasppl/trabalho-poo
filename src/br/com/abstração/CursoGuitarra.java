package br.com.abstração;

public class CursoGuitarra extends Curso {

    @Override
    public void iniciarCurso() {
        System.out.println("Parabéns! Você iniciou o curso de Guitarra!");
    }

    @Override
    public void finalizarCurso() {
        System.out.println("Meus parabéns! Você chegou ao fim do curso de !");
    }
}
