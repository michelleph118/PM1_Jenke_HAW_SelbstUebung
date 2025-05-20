public class Zaehler {
    int zaehlerstand;

    public Zaehler() {
        zaehlerstand = 0;
    }

    public void inkrement(){
        zaehlerstand++;
    }

    public static void main(String[] args) {
        Zaehler zaehler1 = new Zaehler();
        zaehler1.inkrement();
        System.out.println(zaehler1.zaehlerstand);
    }
}
