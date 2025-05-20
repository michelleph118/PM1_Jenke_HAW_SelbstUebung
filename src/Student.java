public class Student {
    String name;
    int matrikelNummer;
    public Student(String name, int matrNummer ) {
        this.name = name;
        this.matrikelNummer = matrNummer;
    }
    public void vorstellen() {
        System.out.println("Mein Name ist: " + name + ", " + "Mein MatrikelNummer ist: " + matrikelNummer);
    }

    public static void main(String[] args) {
        new Student("Max", 12345).vorstellen();
    }
}
