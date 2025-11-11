package br.com.abstração;

import br.com.interfaces.IGestaoCurso;

public abstract class Curso implements IGestaoCurso {
    private String nomeCurso;
    private double duracao; // em anos - (podendo ser 2 anos ou 2,5 dois anos e meio)
    private int qtdAlunos;


}
