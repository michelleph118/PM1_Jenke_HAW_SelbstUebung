package Niveau_einfach;

/**
     * Die Klasse Niveau_einfach.TeaParty bewertet die Qualität einer Tea Party
     * basierend auf der Anzahl von Tee und Keksen.
     *
     * Die Bewertung erfolgt nach folgenden Regeln:
     * - Wenn sowohl die Anzahl der Tees als auch die Anzahl der Kekse mindestens 5 beträgt:
     *   - Falls die Anzahl des Tees mindestens doppelt so hoch ist wie die Anzahl der Kekse
     *     oder umgekehrt, ist die Party "super".
     *   - Andernfalls ist die Party "gut".
     * - Falls eine der beiden Mengen weniger als 5 beträgt, ist die Party "schlecht".
     */
    public class TeaParty {
        private String qualitaet;
        private int anzahlTee;
        private int anzahlKekse;

        /**
         * Bewertet die Qualität der Tea Party basierend auf den Mengen von Tee und Keksen
         * und gibt das Ergebnis in der Konsole aus.
         *
         * Beispiele:
         * teaParty(6, 8) → "Die Tea Party ist gut"
         * teaParty(3, 8) → "Die Tea Party ist schlecht"
         * teaParty(20, 5) → "Die Tea Party ist super"
         */
        public void teaParty() {
            //TODO: Implementiere die Methode
            if (anzahlTee >= 5 && anzahlKekse >= 5) {
                if (anzahlTee >= 2 * anzahlKekse || anzahlKekse >= 2 * anzahlTee) {
                    qualitaet = "super";
                } else {
                    qualitaet = "gut";
                }
            }
            else
            {
                qualitaet = "schlecht";
            }

            System.out.println("Die Tea Party ist " + qualitaet);
        }

        public static void main(String[] args) {
            TeaParty Party1 = new TeaParty();
            TeaParty Geburtstag2 = new TeaParty();
            Party1.anzahlTee = 10;
            Party1.anzahlKekse = 5;
            Geburtstag2.anzahlKekse = 5;
            Geburtstag2.anzahlTee = 1;
            Party1.teaParty();
            Geburtstag2.teaParty();
        }
    }


