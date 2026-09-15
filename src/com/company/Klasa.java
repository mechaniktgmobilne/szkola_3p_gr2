package com.company;

import java.util.ArrayList;

public class Klasa {
    private String nazwa;
    private ArrayList<Uczen> uczniowie;
    private Wychowawca wychowawca;

    public Klasa(String nazwa, Wychowawca wychowawca) {
        this.nazwa = nazwa;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }

    //dodaj ucznia do klasy
    public void dodajUczniaDoKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            System.out.println(uczen+" jest już w tej klasie ");
        }
        else{
            uczniowie.add(uczen);
        }

    }

    //usuń ucznia z klasy
    public void usunUczniaZKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            uczniowie.remove(uczen);
        }
        else{
            System.out.println(uczen +" nie występuje w tej klasie");
        }
    }
    //to string -> wypisanie wszystkich uczniów w klasie
    public void wypiszInfoOKlasie(){

    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwa='" + nazwa + '\'' +
                ", uczniowie=" + uczniowie +
                ", wychowawca=" + wychowawca +
                '}';
    }
}
