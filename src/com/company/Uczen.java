package com.company;

public class Uczen extends  Osoba{

    //dziedziczenie
    //klasa Uczen jest klasą potomną dla klasy Osoba

    private int nrUcznia;
    private static int liczbaUczniow = 0;

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow++;
        nrUcznia = liczbaUczniow;
    }
    //hermetyzacja


    @Override
    public String toString() {
        return "Uczen{" +
                " imię: "+ getImie()+
                " wiek: "+getWiek()+
                " nrUcznia=" + nrUcznia +
                '}';
    }
}
