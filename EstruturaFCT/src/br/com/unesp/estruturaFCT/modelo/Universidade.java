package br.com.unesp.estruturaFCT.modelo;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public void removaDepartamento(Departamento departamento){
        this.departamentos.remove(departamento);
    }

}
