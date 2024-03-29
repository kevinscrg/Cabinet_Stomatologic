package com.example.lab4.Domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Programare extends Entity implements Serializable {

    private Pacient pacient;
    private String scop;
    private String ora;
    private String data;


    public Programare(int id, Pacient p, String s, String d, String o) {
        super(id);
        this.pacient = p;
        this.data = d;
        this.ora = o;
        this.scop = s;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public String getScop() {
        return scop;
    }
    public int getLuna(){return Integer.parseInt(data.split("/")[1]);}

    public LocalDate getLocalDate() {
        String[] parts = data.split("/");
        int zi = Integer.parseInt(parts[0]);
        int luna = Integer.parseInt(parts[1]);
        return LocalDate.of(LocalDate.now().getYear(), luna, zi);
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }


    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public void setScop(String scop) {
        this.scop = scop;
    }

    @Override
    public String toString() {
        return ("\n"+this.id +": "+this.data+ " la ora: "+ this.ora+" " + this.pacient + "\n " + "avand ca scop: "+ this.scop);
    }
}
