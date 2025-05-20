public class Person {
    String name;
    public void setzeName(String name)
    {
        this.name = name;
    }
    public static void main (String args[])
    {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = person1;

        person1.setzeName("Anna");
        person2.setzeName("Anna");
        System.out.println(person1 == person2);
        System.out.println(person1 == person3);
    }
}
// dies ist Vergleich zw. 2 Objekt und gibt dann Boolean wert zurück
