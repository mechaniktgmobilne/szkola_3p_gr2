package com.company;

import java.util.ArrayList;
import java.util.SortedMap;

public class Klasa {
    private String nazwa;
    private ArrayList<Uczen> uczniowie;
    private Wychowawca wychowawca;

    public Klasa(String nazwa, Wychowawca wychowawca) {
        this.nazwa = nazwa;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setWychowawca(Wychowawca wychowawca) {
        this.wychowawca = wychowawca;
    }

    public ArrayList<Uczen> getUczniowie() {
        return uczniowie;
    }

    public Wychowawca getWychowawca() {
        return wychowawca;
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
        System.out.println("Klasa: "+nazwa);
        System.out.println("Wychowawca "+wychowawca);
        for (Uczen uczen:uczniowie) {
            System.out.println("- "+uczen);
        }
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
