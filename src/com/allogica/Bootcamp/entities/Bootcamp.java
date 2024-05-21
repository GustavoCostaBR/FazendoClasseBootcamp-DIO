package com.allogica.Bootcamp.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private LocalDateTime dataFinal;
    private LocalDateTime dataInicial;
    private String nome;
    private String descricao;

    public Bootcamp(LocalDateTime dataInicial, LocalDateTime dataFinal, String nome, String descricao) {
        this.dataFinal = dataFinal;
        this.dataInicial = dataInicial;
        this.nome = nome;
        this.descricao = descricao;
        this.atividades = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    private List<Mentoria> mentorias;
    private List<Atividade> atividades;
    private List<Dev> devs;

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void addMentoria(Mentoria mentoria) {
        this.mentorias.add(mentoria);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void addAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }

    public void addDev(Dev dev){
        devs.add(dev);
    }

}
