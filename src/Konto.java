public class Konto {
    String kontoInhaber;
    int kontoNummer;
    double kontoStand;
    public Konto (String kInhaber, int kNum, double kStand)
    {
        this.kontoInhaber = kInhaber;
        this.kontoNummer = kNum;
        this.kontoStand = kStand;
    }
    public void einzahlen (double betrag) {
        kontoStand = kontoStand + betrag;
    }
    public void abheben (double betrag){

        if (kontoStand >= betrag){
            kontoStand = kontoStand - betrag;
        }
        else {
            System.out.println("Der Kontostand ist nicht genug, um Betrag: " + betrag + " abzuheben");
        }
    }

    public static void main(String[] args) {
        Konto Klassik1 = new Konto("Hebert",18567, 2900.58);
        Konto Preminium1 = new Konto("Alpert",24689, 83987.50);
        Klassik1.abheben(3000);
        Preminium1.einzahlen(300);
        Klassik1.einzahlen(200);
        System.out.println("Der Kontostand Klassik1: " + Klassik1.kontoStand);
        System.out.println("Der Kontostand Klassik1: " + Preminium1.kontoStand);
    }

}
