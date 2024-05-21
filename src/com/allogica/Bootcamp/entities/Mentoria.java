package com.allogica.Bootcamp.entities;

public class Mentoria extends CurriculoCursoImplAbstract{
    private int cargaHoraria;
    private int xp;

    public Mentoria(String titulo, String descricao) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public int calcularXp() {
        return xp;
    }
}
