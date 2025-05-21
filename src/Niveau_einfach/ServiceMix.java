package Niveau_einfach;

/**
 * Abgerundete Summe
 *
 * Vervollständige die Methode public int abgerundeteSumme(double a, double b), die ihre beiden Parameter addiert und die Summe abgerundet zurück liefert.
 *
 * Hinweis: Abgerundet bedeutet in diesem Kontext, dass der der Wert zur 0 gerundet wird, also Nachkommastellen wegfallen.
 *
 * Beispiel 1: a = 13.37; b = 42.42; Rückgabewert: 55
 * Beispiel 2: a = 3.8; b = 1.5; Rückgabewert: 5
 */
public class ServiceMix
{

    /**
     * Berechnet die abgerundete Summe der beiden Parameter.
     *
     * @param a Erster Summand
     * @param b Zweiter Summand
     *
     * @return Abgerundete Summe beider Summanden
     */
    public int abgerundeteSumme(double a, double b)
    {
        // Hier Code einfügen
        int ergebnis = (int) a + (int) b;
        return ergebnis;
    }
    /**
     * Gibt den n-ten Nachfolger von buchstabe zurück.
     *
     * Beispiel: buchstabe='a', n=3 -> Ergebnis: 'd'
     *
     * @param buchstabe Der char mit dem begonnen wird
     * @param n         Anzahl der Positionen die gesprungen werden sollen
     *
     * @return n-ter Nachfolger ausgehend von buchstabe
     */
    /*
    Schreibe eine Methode public char gibNtenNachfolger(char buchstabe, int n),
    die als Rückgabewert den n-ten Nachfolgebuchstaben ausgehend von buchstabe liefert.
    Beispiel: buchstabe = 'a'; n = 3; Rückgabewert: 'd'
    Hinweis: Alle weiteren char-Werte nach 'z' gelten hier ebenfalls als
    gültige Nachfolgebuchstaben.
    Negative Werte für n können vernachlässigt werden.
     */
    public char gibNtenNachfolger(char buchstabe, int n)
    {
        // Hier Code einfügen
        char nachfolge = (char) (buchstabe +  n); // char + int = int und dann wandeln wir wieder zum char um
        return nachfolge;
    }


    public static void main(String[] args) {
        ServiceMix Num = new ServiceMix();
        Num.abgerundeteSumme(2.5, 3.9);
        System.out.println("Ergebnis: " + Num.abgerundeteSumme(2.5,3.9));
        ServiceMix Chacha = new ServiceMix();
        System.out.println(Chacha.gibNtenNachfolger('e', -4));

    }

}
