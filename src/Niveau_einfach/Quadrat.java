package Niveau_einfach;

public class Quadrat {
    int laenge;

    public int spassMitQuadraten(int laenge){
        laenge = 32;
        return laenge;
    }

    public static void main(String[] args) {
        Quadrat quadrat = new Quadrat();
        quadrat.laenge = 12;
        int laenge = quadrat.spassMitQuadraten(30);
        System.out.println(quadrat.laenge);
    }
}
