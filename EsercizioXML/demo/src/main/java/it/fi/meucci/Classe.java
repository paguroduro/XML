package it.fi.meucci;

import java.util.ArrayList;

public class Classe {
    int numero;
    String sezione;
    String aula;
    ArrayList<Alunno> A;


    public Classe() {
    }

    public Classe(int numero, String sezione, String aula, ArrayList<Alunno> A) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.A = A;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return this.sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getA() {
        return this.A;
    }

    public void setA(ArrayList<Alunno> A) {
        this.A = A;
    }

    public Classe numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Classe sezione(String sezione) {
        setSezione(sezione);
        return this;
    }

    public Classe aula(String aula) {
        setAula(aula);
        return this;
    }

    public Classe A(ArrayList<Alunno> A) {
        setA(A);
        return this;
    }
}