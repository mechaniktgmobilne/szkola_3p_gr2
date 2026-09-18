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
}
