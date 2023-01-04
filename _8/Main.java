public class Main {
    public static void main(String[] args) {
        Animals[] animals = {new Dog("dog food", "house", "Akita"),
                new Cat("cat food", "house", 8.5),
                new Horse("horse food", "horse stable", 14)};

        Veterinary vet = new Veterinary();
        for (Animals i : animals) {
            vet.treatAnimal(i);
        }
        for (Animals i : animals) {
            i.eat();
            i.makeNoise();
        }
        System.out.println();

        Animals dog = new Dog("Cookie", "home","f");

        dog.makeNoise();
        dog.eat();
        dog.sleep();
        System.out.println();
        Animals cat = new Cat("Ambrosia", "home",5.4);
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        System.out.println();
        Animals horse = new Horse("hay", "Buttermint",4);
        horse.makeNoise();
        horse.eat();
        horse.sleep();
    }
}
