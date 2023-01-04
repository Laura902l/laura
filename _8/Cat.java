public class Cat extends Animals {
    private double weight;
    public Cat(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
}
