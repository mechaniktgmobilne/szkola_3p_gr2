package com.company;

public class Nauczyciel extends Osoba implements Dyzurny{
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

    @Override
    public void wykonajDyzur() {
        System.out.println("Spacer po korytarzu");
    }
}
