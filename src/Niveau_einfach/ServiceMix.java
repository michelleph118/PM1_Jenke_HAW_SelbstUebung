package Niveau_einfach;


public class ServiceMix
{
    /*
    Abgerundete Summe
    Vervollständige die Methode public int abgerundeteSumme(double a, double b),
    die ihre beiden Parameter addiert und die Summe abgerundet zurück liefert.
    Hinweis: Abgerundet bedeutet in diesem Kontext, dass der der Wert zur 0 gerundet wird,
    also Nachkommastellen wegfallen.
    Beispiel 1: a = 13.37; b = 42.42; Rückgabewert: 55
    Beispiel 2: a = 3.8; b = 1.5; Rückgabewert: 5
     */
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
    /*
    Nachfolgebuchstabe Zyklisch
    Vervollständige die Methode public char gibNtenNachfolgerZyklisch(char buchstabe, int n),
    die den n-ten Nachfolgebuchstaben ihres Parameters liefern soll.
    Am Ende des Alphabets ('z') soll von vorne begonnen ('a') werden.
    Hinweis: Du kannst davon ausgehen, dass nur Kleinbuchstaben von 'a' bis 'z'
    als erster Parameter übergeben werden und nur positive Werte als zweiter Parameter.
    Hinweis: Das Verwenden des Modulo Operators (%) ist nützlich für diese Aufgabe.
    Beispiel: gibNtenNachfolgerZyklisch('z', 2) soll 'b' liefern.
     */
    /**
     * Gibt den n-ten Nachfolger von buchstabe zurück.
     * Am Ende folgt nach 'z' wieder ein 'a'.
     * Beispiel: buchstabe='z', n=2 -> Ergebnis: 'b'
     * @param buchstabe Der char bei dem angefangen wird.
     *                  (Ein Kleinbuchstabe zwischen 'a' und 'z')
     * @param verschiebung   Anzahl der Positionen die gesprungen werden sollen
     * @return n-ter Nachfolger von buchstabe.
     */
    public char gibNtenNachfolgerZyklisch(char buchstabe, int verschiebung)
    {
        // Hier Code einfügen
        int positionImAlphabetReihfolge = buchstabe - 'a'; // Berechnet die Position der Buchstabe im Alphabet
        int neuePosition = (positionImAlphabetReihfolge + verschiebung) % 26; // hier wird es gesichert, dass es trotz Verschiebung noch im Zyklus des Alphabet
        return (char) (neuePosition + 'a'); // hier wird das Zyklus gesichert
        /*
        buchstabe - 'a' gibt die Position des Buchstabens im Alphabet zurück.
        Zum Beispiel:
        'a' - 'a' = 0
        'b' - 'a' = 1
        'z' - 'a' = 25
        bei 'z' (Position 25) bist und 3 Schritte weiter gehst (n=3),
        wird die neue Position 28. Aber, durch % 26 wird das Ergebnis 28 % 26 = 2 sein,
        was der Position von 'c' entspricht.
         */
    }



    public static void main(String[] args) {
        ServiceMix Num = new ServiceMix();
        Num.abgerundeteSumme(2.5, 3.9);
        System.out.println("Ergebnis: " + Num.abgerundeteSumme(2.5,3.9));
        ServiceMix Chacha = new ServiceMix();
        ServiceMix ZyklusAlpha = new ServiceMix();
        System.out.println(ZyklusAlpha.gibNtenNachfolgerZyklisch('w', 8));
        System.out.println(Chacha.gibNtenNachfolger('e', -4));

    }

}
