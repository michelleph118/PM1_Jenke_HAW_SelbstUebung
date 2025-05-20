public class Bruch {
    int zaehler;
    int nenner;
    public Bruch (int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }
    public void substrahierenDavon(Bruch andererBruch) {

        int neuZaehler = this.zaehler * andererBruch.nenner - andererBruch.zaehler * this.nenner;
        int neuNenner = this.nenner * andererBruch.nenner;
        this.zaehler = neuZaehler;
        this.nenner = neuNenner;
    }
    public boolean istKleiner (int zaehler, int nenner){
        return this.zaehler * nenner < this.nenner * zaehler;
    }

    public static void main(String[] args) {
        Bruch bruch1 = new Bruch(2,3);
        Bruch bruch2 = new Bruch(4,5);
        bruch1.substrahierenDavon(bruch2);
        boolean istgroesser = bruch2.istKleiner(5,6);

        System.out.println(istgroesser);
    }

}
