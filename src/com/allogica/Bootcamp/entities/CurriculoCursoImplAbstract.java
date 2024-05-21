package com.allogica.Bootcamp.entities;

public abstract class CurriculoCursoImplAbstract implements CurriculoCurso{

    protected String titulo;
    protected String descricao;

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
