package com.company;

import java.util.ArrayList;

public class Szkola {
    private static Szkola szkola;
    private String nazwa;
    private ArrayList<Uczen> uczniowie;
    private ArrayList<Klasa> klasy;
    private ArrayList<Nauczyciel> nauczyciele;
    //singleton prywatny konstruktor, żeby nie tworzyć bez kontroli

    private Szkola(String nazwa) {
        this.nazwa = nazwa;
        uczniowie = new ArrayList<>();
        klasy = new ArrayList<>();
        nauczyciele = new ArrayList<>();
    }
    public static Szkola getSzkola(String nazwa){
        if(szkola == null){
            szkola = new Szkola(nazwa);
        }
        return szkola;
    }

    @Override
    public String toString() {
        return "Szkola{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }

    public void dodajUczniaDoSzkoly (String imie, int wiek){
        //tworzymy ucznia i dadajemy do listy
        Uczen uczen = new Uczen(imie,wiek);
        uczniowie.add(uczen);
    }
    public void dodajUczniaDoKlasy(Uczen uczen, Klasa klasa){
        klasa.dodajUczniaDoKlasy(uczen);
    }
    public void przepiszUczniaMiedzyKlasami(Uczen uczen, Klasa klasaZ, Klasa klasaDo){
        if(!klasaZ.equals(klasaDo)) {
            klasaZ.usunUczniaZKlasy(uczen);
            klasaDo.dodajUczniaDoKlasy(uczen);
        }
    }
    public void wypiszNaEkranieUczniowZKlasy(Klasa klasa){

    }
    public void dodajNauczyciela(Nauczyciel nauczyciel){

    }
    public void dodajKlase(String nazwa){

    }
    public void przypiszWychowawce(Wychowawca wychowawca, Klasa klasa){
        //przypisz Wychowawce do klasy jezeli ten wychowawca nie jest jeszcze w żadnej klasie
        boolean czyMaKlase = false;
        for (Klasa klasa:klasy) {
            if(klasa.getWychowawca() == wychowawca){
                czyMaKlase = true;
                break;
            }
        }
        if (!czyMaKlase) {
            klasa.setWychowawca(wychowawca);
        }
    }


}
