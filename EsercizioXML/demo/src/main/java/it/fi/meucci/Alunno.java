package it.fi.meucci;

import java.util.GregorianCalendar;

public class Alunno {
    public String nome;
    public String cognome;
    GregorianCalendar dataNascita;


    public Alunno() {
    }

    public Alunno(String nome, String cognome, GregorianCalendar dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public GregorianCalendar getDataNascita() {
        return this.dataNascita;
    }

    public void setDataNascita(GregorianCalendar dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Alunno nome(String nome) {
        setNome(nome);
        return this;
    }

    public Alunno cognome(String cognome) {
        setCognome(cognome);
        return this;
    }

    public Alunno dataNascita(GregorianCalendar dataNascita) {
        setDataNascita(dataNascita);
        return this;
    }
}