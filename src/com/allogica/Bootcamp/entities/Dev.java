package com.allogica.Bootcamp.entities;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Mentoria> mentorias;
    private List<Atividade> atividades;

    private int totalXp;

    private List<Bootcamp> bootcamps;

    public List<Bootcamp> getBootcamps() {
        return bootcamps;
    }

    public Dev(String nome) {
        this.nome = nome;
        this.bootcamps = new ArrayList<>();
        this.atividades = new ArrayList<>();
        this.mentorias = new ArrayList<>();
    }

    public void inscreverNoBootcamp(Bootcamp bootcamp){
        bootcamps.add(bootcamp);
        bootcamp.addDev(this);
    }

    public void progredir(CurriculoCursoImplAbstract atividadeGenerica){
        if (atividadeGenerica instanceof Mentoria){
            mentorias.add((Mentoria)atividadeGenerica);
        }
        else if (atividadeGenerica instanceof Atividade){
            atividades.add((Atividade) atividadeGenerica);
        }
    }
    public int calcularTotalXp(){
        totalXp = 0;
        for(Atividade atividade : atividades){
            totalXp += atividade.calcularXp();
        }
        for(Mentoria mentoria : mentorias){
            totalXp += mentoria.calcularXp();
        }
        return totalXp;
    }

    public void exibirCursos(){
        System.out.println("Cursos inscrito: ");
        for(Atividade atividade : atividades){
            System.out.println(atividade);
        }
    }
}
