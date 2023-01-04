public class Dog extends Animals{
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark!");
    }
}