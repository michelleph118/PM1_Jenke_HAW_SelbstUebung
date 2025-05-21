package Niveau_medium;

/**
*In dieser Aufgabe musst du die Methode max() der ArrayMax-Klasse implementieren.
Die Methode soll die größte Zahl in einem Array von Ganzzahlen finden und ausgeben.
 */

/**
 * Anforderungen
 *
 * Die Methode max() erhält ein Array von Ganzzahlen. Sie soll die größte Zahl ermitteln und ausgeben.
 *
 * Dein Programm sollte die größte Zahl in folgendem Format ausgeben:
 *
 * Die größte Zahl ist: 5
 *
 * Beispiele
 *
 * Falls das ursprüngliche Array {1, 2, 3, 4, 5} ist, sollte die Ausgabe sein:
 *
 * Die größte Zahl ist: 5
 *
 * Falls das ursprüngliche Array {-10, -20, -3, -40, -5} ist, sollte die Ausgabe sein:
 *
 * Die größte Zahl ist: -3
 *
 * Falls das ursprüngliche Array {-1, 2, -3, 4, -5, 6} ist, sollte die Ausgabe sein:
 *
 * Die größte Zahl ist: 6
 */

public class ArrayMax {
    private int[] zahlen;
    public ArrayMax (int[] zahl){
        this.zahlen = zahl;
    }

    public void max() {
        int max = Integer.MIN_VALUE;

        // TODO: Implementiere die Logik
        for (int i = 0; i < zahlen.length; i ++)
        {
            if (zahlen[i] > max )
            {
                max = zahlen[i];
            }
        }

        System.out.println("Die größte Zahl ist: " + max);
    }

    public static void main(String[] args) {
        int[] zahlen1 = new int[] {2,4,5,-1};
        ArrayMax arrTest = new ArrayMax(zahlen1);
        arrTest.max();

    }
}
