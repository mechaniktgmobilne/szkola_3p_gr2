package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Osoba osoba = new Uczen("Jaś",8);
        //przy tworzeniu obiektu wywoluje się konstruktor
        Uczen uczen = new Uczen("Małgosia",7);
        Uczen uczen2 = new Uczen("Marysia",7);
        Uczen uczen3 = new Uczen("Zosia",7);
        Uczen uczen4 = new Uczen("Filip",7);
        System.out.println(osoba);
        System.out.println(uczen);//wywołanie toString
        uczen.wykonajDyzur();
        Nauczyciel nauczyciel = new Nauczyciel("Joanna","muzyka");
        System.out.println(nauczyciel);
        nauczyciel.wykonajDyzur();
        Wychowawca wychowawca = new Wychowawca("Tadeusz","matematyka");

        Klasa klasa1p = new Klasa("1p",wychowawca);
        klasa1p.dodajUczniaDoKlasy(uczen);
        klasa1p.dodajUczniaDoKlasy(uczen);
        klasa1p.dodajUczniaDoKlasy(uczen2);
        klasa1p.dodajUczniaDoKlasy(uczen3);
        klasa1p.dodajUczniaDoKlasy(uczen4);
        System.out.println(klasa1p);
        klasa1p.wypiszInfoOKlasie();
    }
}
