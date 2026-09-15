package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Osoba osoba = new Uczen("Jaś",8);
        //przy tworzeniu obiektu wywoluje się konstruktor
        Uczen uczen = new Uczen("Małgosia",7);
        System.out.println(osoba);
        System.out.println(uczen);//wywołanie toString
        Nauczyciel nauczyciel = new Nauczyciel("Joanna","muzyka");
        System.out.println(nauczyciel);
    }
}
