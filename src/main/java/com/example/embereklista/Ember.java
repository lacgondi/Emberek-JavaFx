package com.example.embereklista;

public class Ember {
    private String nev;
    private int eletkor;

    public Ember(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
    }

    @Override
    public String toString() {
        return String.format("%-30s %3d", nev, eletkor);
    }
}
