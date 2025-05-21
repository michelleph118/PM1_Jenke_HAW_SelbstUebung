package Niveau_medium;

/**
 *  In dieser Aufgabe musst du die Methode fizzBuzz() der FizzBuzz-Klasse implementieren.
 * Die Methode überprüft eine Zeichenkette und gibt entsprechend folgende Werte aus:
 * Anforderungen
 *
 * Die Methode fizzBuzz() soll Folgendes ausgeben:
 *
 *     Fizz, falls der String mit "f" beginnt.
 *     Buzz, falls der String mit "b" endet.
 *     FizzBuzz, falls beides zutrifft.
 *     Den ursprünglichen String, falls keine der Bedingungen erfüllt ist.
 *
 * Beispiel:
 *
 * Falls der ursprüngliche String foo ist, sollte die Ausgabe sein:Fizz
 *
 * Falls der ursprüngliche String grab ist, sollte die Ausgabe sein:Buzz
 *
 * Falls der ursprüngliche String fab ist, sollte die Ausgabe sein: FizzBuzz
 *
 * Falls der ursprüngliche String hello ist, sollte die Ausgabe unverändert bleiben: hello
 *
 */
public class FizzBuzz {
    private String text;
    private String ergebnis;
    public FizzBuzz (String text)
    {
        this.text = text;
    }

    public void fizzBuzz() {
        
        if (text.toLowerCase().charAt(0) == 'f' && text.toLowerCase().charAt(text.length() -1) == 'b')
        {
            ergebnis = "FizzBuzz";
        } else if (text.toLowerCase().charAt(0) == 'f')
        {
            ergebnis = "Fizz";
        }
        else if (text.toLowerCase().charAt(text.length() -1) == 'b')
        {
            ergebnis = "Buzz";
        }
        else
        {
            ergebnis = text;
        }
        // TODO: Implementiere die Methode

        System.out.println(ergebnis);
    }

    public static void main(String[] args) {
        FizzBuzz text1 = new FizzBuzz("Favourite");
        FizzBuzz text2 = new FizzBuzz("fonb");
        text1.fizzBuzz();
        text2.fizzBuzz();

    }
}
