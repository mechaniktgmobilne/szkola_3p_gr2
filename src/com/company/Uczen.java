package com.company;

public class Uczen extends  Osoba{

    //dziedziczenie
    //klasa Uczen jest klasą potomną dla klasy Osoba

    private int nrUcznia;
    private static int liczbaUczniow = 0;

    //static pole klasy a nie obiektu
    //może służyć do zliczania liczby instancji

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
