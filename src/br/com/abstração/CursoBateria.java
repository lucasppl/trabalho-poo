package br.com.abstração;

public class CursoBateria extends Curso {
    private String nomeCurso = "BATERIA";

    @Override
    public void iniciarCurso() {
        System.out.println("Parabéns! Você iniciou o curso de " + nomeCurso);
    }

    @Override
    public void finalizarCurso() {
        System.out.println();
    }
}
