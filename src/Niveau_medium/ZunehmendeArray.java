package Niveau_medium;

/**
 * Zunehmende Array
 * ZunehmendeArraySolution
 *
 * In dieser Aufgabe musst du die Methode istZunehmend() der ZunehmendeArraySolution-Klasse implementieren.
 * Die Methode soll überprüfen, ob die Elemente in einem Array in zunehmender Reihenfolge angeordnet sind.
 * Anforderungen
 *
 * Die Methode istZunehmend() erhält ein Array von Ganzzahlen. Sie soll überprüfen, ob jedes Element im Array kleiner oder gleich dem nächsten Element ist.
 *
 * Dein Programm sollte die folgende Ausgabe machen:
 *
 * Das Array ist zunehmend.
 *
 * Falls das Array nicht in aufsteigender Reihenfolge ist, sollte die Ausgabe sein:
 *
 * Das Array ist nicht zunehmend.
 *
 * Beispiele
 *
 * Falls das ursprüngliche Array {1, 2, 3, 4, 5} ist, sollte die Ausgabe sein:
 *
 * Das Array ist zunehmend.
 *
 * Falls das ursprüngliche Array {5, 4, 3, 2, 1} ist, sollte die Ausgabe sein:
 *
 * Das Array ist nicht zunehmend.
 *
 * Falls das ursprüngliche Array {1, 3, 2, 4, 5} ist, sollte die Ausgabe sein:
 *
 * Das Array ist nicht zunehmend.
 *
 * Falls das ursprüngliche Array {} (leeres Array) ist, sollte die Ausgabe sein:
 *
 * Das Array ist zunehmend.
 *
 * Falls das ursprüngliche Array {42} (ein Element) ist, sollte die Ausgabe sein:
 *
 * Das Array ist zunehmend.
 */

public class ZunehmendeArray {
    private int[] zahlen;
    public ZunehmendeArray (int[] zahl) {
        this.zahlen = zahl;
    }
    public void istZunehmend() {
        // TODO: Implementiere die Methode
        boolean istZunehmen = true; // ein boolean Variable setzen um zu überprüfen
        for (int i = 0; i < zahlen.length -1; i ++){ // zahlen.length -1 da wir vergleichen zahlen[i] bis [i+1]
           if (zahlen[i] < zahlen[i + 1]) {
           }
           else
           {
               istZunehmen = false;
               break;
           }
        }
        if (istZunehmen) {
            System.out.println("Das ist ein zunehmendes Array.");
        } else {
            System.out.println("Das ist kein zunehmendes Array.");
        }
    }

    public static void main(String[] args) {
        int[] zahlT = new int[] {1,4,6,2};
        ZunehmendeArray array1 = new ZunehmendeArray(zahlT);
        array1.istZunehmend();
    }
}


