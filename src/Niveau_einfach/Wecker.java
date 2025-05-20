package Niveau_einfach;

public class Wecker {
    private int tag;
    private boolean istUrlaub;

    public void weckerErstellen() {
        String uhrzeit;
        if (tag < 1) {
            uhrzeit = "aus";
        }
        else if (tag <= 5) {
            if (istUrlaub) {
                uhrzeit = "10:00";
            } else {
                uhrzeit = "06:00";
            }
        } else {
            if (istUrlaub) {
                uhrzeit = "aus";
            } else {
                uhrzeit = "10:00";
            }
        }

        if (uhrzeit.equals("aus")) {
            System.out.println("Der Niveau_einfach.Wecker ist ausgeschaltet.");
        } else {
            System.out.println("Der Niveau_einfach.Wecker klingelt um " + uhrzeit);
        }
    }

    public static void main(String[] args) {
        Wecker wecker1 = new Wecker();
        wecker1.tag = 5;
        wecker1.istUrlaub = false;
        wecker1.weckerErstellen();
    }
}

