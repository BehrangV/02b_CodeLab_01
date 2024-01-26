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
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        printKontostand("Anfangs-Kontostand", konto1, konto2, konto3);

        konto1.verdoppeln();
        konto2.verdreifachen();
        konto3.verzehnfachen();

        printKontostand("Aktueller Kontostand", konto1, konto2, konto3);
    }

    private static void printKontostand(String prefix, Konto... konten) {
        for (Konto konto : konten) {
            output(prefix + " konto: " + konto.getKontostand());
        }
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

class Konto {
    private int kontostand;

    public Konto(int anfangsKontostand) {
        this.kontostand = anfangsKontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

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