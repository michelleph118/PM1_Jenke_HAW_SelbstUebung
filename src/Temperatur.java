/**
 * Die Klasse Temperatur ermöglicht die Umrechnung zwischen Celsius und Fahrenheit.
 * Sie speichert eine Temperatur und eine Information darüber, ob sie in Celsius oder Fahrenheit vorliegt.
 */
public class Temperatur {
    private double temperatur; // Speichert die Temperatur
    private boolean istCelsius; // Gibt an, ob die Temperatur in Celsius ist (true) oder in Fahrenheit (false)

    /**
     * Konvertiert die gespeicherte Temperatur in die jeweils andere Einheit.
     * Falls die Temperatur in Celsius gespeichert ist, wird sie in Fahrenheit umgerechnet.
     * Falls die Temperatur in Fahrenheit gespeichert ist, wird sie in Celsius umgerechnet.
     * Das Ergebnis wird auf der Konsole ausgegeben.
     *
     * Ausgabeformat:
     * - Falls konvertiert zu Fahrenheit: "Die Temperatur in Fahrenheit betraegt: X.X F"
     * - Falls konvertiert zu Celsius: "Die Temperatur in Celsius betraegt: X.X C"
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
