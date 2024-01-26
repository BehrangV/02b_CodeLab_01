package com.cc.java;

public class App {

    public static void main(String[] args) {
        // Erstellen von drei Konto-Objekten mit einem Anfangskontostand von 10000
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        // Ausgabe des Anfangskontostands aller drei Konten
        printKontostand("Anfangs-Kontostand", konto1, konto2, konto3);

        // Manipulation der Kontostände: Verdoppeln, Verdreifachen, Verzehnfachen
        konto1.verdoppeln();
        konto2.verdreifachen();
        konto3.verzehnfachen();

        // Ausgabe der aktuellen Kontostände nach der Manipulation
        printKontostand("Aktueller Kontostand", konto1, konto2, konto3);
    }

    // Methode zum Ausgeben des Kontostands für eine variable Anzahl von Konten
    private static void printKontostand(String prefix, Konto... konten) {
        for (Konto konto : konten) {
            output(prefix + " konto: " + konto.getKontostand());
        }
    }

    // Hilfsmethode zum Ausgeben von Text in der Konsole
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

