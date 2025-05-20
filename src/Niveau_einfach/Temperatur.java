package Niveau_einfach;

/**
 * Die Klasse Niveau_einfach.Temperatur ermöglicht die Umrechnung zwischen Celsius und Fahrenheit.
 * Sie speichert eine Niveau_einfach.Temperatur und eine Information darüber, ob sie in Celsius oder Fahrenheit vorliegt.
 */
public class Temperatur {
    private double temperatur; // Speichert die Niveau_einfach.Temperatur
    private boolean istCelsius; // Gibt an, ob die Niveau_einfach.Temperatur in Celsius ist (true) oder in Fahrenheit (false)

    /**
     * Konvertiert die gespeicherte Niveau_einfach.Temperatur in die jeweils andere Einheit.
     * Falls die Niveau_einfach.Temperatur in Celsius gespeichert ist, wird sie in Fahrenheit umgerechnet.
     * Falls die Niveau_einfach.Temperatur in Fahrenheit gespeichert ist, wird sie in Celsius umgerechnet.
     * Das Ergebnis wird auf der Konsole ausgegeben.
     *
     * Ausgabeformat:
     * - Falls konvertiert zu Fahrenheit: "Die Niveau_einfach.Temperatur in Fahrenheit betraegt: X.X F"
     * - Falls konvertiert zu Celsius: "Die Niveau_einfach.Temperatur in Celsius betraegt: X.X C"
     */
    public void konvertiere() {
        // TODO: implementiere die Methode

        if (istCelsius)
        {
            temperatur  = temperatur * 9.0 / 5.0 + 32;
        }
        else
        {
            temperatur  = ( temperatur -32) * 5.0 / 9.0;
        }
        System.out.println(temperatur);

    }

    public static void main(String[] args) {
        Temperatur temperatur1 = new Temperatur();
        temperatur1.temperatur = 95.38;
        temperatur1.istCelsius = false;
        temperatur1.konvertiere();
    }
}
