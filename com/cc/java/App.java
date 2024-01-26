package com.cc.java;

// public class App {

//     public static void main(String[] args) {
//         // Erzeugen der Konto-Objekte
//         Konto konto1 = new Konto();
//         Konto konto2 = new Konto();
//         Konto konto3 = new Konto();

//         // Anfangs-Kontostand ausgeben
//         output("Anfangs-Kontostand konto1: " + konto1.getKontostand());
//         output("Anfangs-Kontostand konto2: " + konto2.getKontostand());
//         output("Anfangs-Kontostand konto3: " + konto3.getKontostand());

//         // Kontostand manipulieren
//         konto1.verdoppeln();
//         konto2.verdreifachen();
//         konto3.verzehnfachen();

//         // Aktuellen Kontostand ausgeben
//         output("Aktueller Kontostand konto1: " + konto1.getKontostand());
//         output("Aktueller Kontostand konto2: " + konto2.getKontostand());
//         output("Aktueller Kontostand konto3: " + konto3.getKontostand());
//     }

//     private static void output(String outputStr) {
//         System.out.println(outputStr);
//     } 
// }

// class Konto {
//     private int kontostand = 10000;

//     public int getKontostand() {
//         return kontostand;
//     }

//     public void verdoppeln() {
//         kontostand *= 2;
//     }

//     public void verdreifachen() {
//         kontostand *= 3;
//     }

//     public void verzehnfachen() {
//         kontostand *= 10;
//     }
// }

// package com.cc.java;

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
