package com.cc.java;

class Konto {
    // Private Instanzvariable für den Kontostand
    private int kontostand;

    // Konstruktor für die Initialisierung des Anfangskontostands
    public Konto(int anfangsKontostand) {
        this.kontostand = anfangsKontostand;
    }

    // Getter-Methode für den Kontostand
    public int getKontostand() {
        return kontostand;
    }

    // Methoden zur Kontostandmanipulation: Verdoppeln, Verdreifachen, Verzehnfachen
    public void verdoppeln() {
        kontostand *= 2;
    }

    public void verdreifachen() {
        kontostand *= 3;
    }

    public void verzehnfachen() {
        kontostand *= 10;
    }
}
