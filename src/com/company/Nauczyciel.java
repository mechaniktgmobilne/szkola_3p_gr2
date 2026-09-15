package com.company;

public class Nauczyciel extends Osoba {
    private String przedmiot;

    public Nauczyciel(String imie, String przedmiot) {
        super(imie);
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                " imię "+ getImie()+
                " przedmiot='" + przedmiot ;
    }
}
