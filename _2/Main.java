public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person person2 = new Person("Malika M", 13);
        person.move();
        person.talk();

        person2.move();
        person2.talk();
    }
}
