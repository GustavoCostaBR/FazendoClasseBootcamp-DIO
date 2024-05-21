package com.allogica.Bootcamp.entities;

public class Atividade extends CurriculoCursoImplAbstract{
    private int cargaHoraria;

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public Atividade(String titulo, String descricao) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);

    }

    @Override
    public int calcularXp() {
        return cargaHoraria * 20;
    }
}
