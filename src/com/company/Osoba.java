package com.company;

public abstract class Osoba {
    //klasa abstrakcyjna nie można utworzyć obiektów tej klasy
    private String imie;
    private int wiek;

    //przeciążanie konstruktorów
    public Osoba(String imie) {
        this.imie = imie;
        wiek = 0;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }
}
