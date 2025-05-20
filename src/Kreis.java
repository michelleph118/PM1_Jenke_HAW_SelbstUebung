public class Kreis {
    int durchmesser;
    final static double PI = 3.1415;
    public Kreis(int durchmesser) {
        this.durchmesser = durchmesser;
    }
     public double berechnenumfang() {
         return durchmesser * PI;
     }

    public static void main(String[] args) {
        Kreis kreis1 = null;
        if (kreis1 != null) {
            double umfang = kreis1.berechnenumfang();
        } else throw new RuntimeException();
    }
}
