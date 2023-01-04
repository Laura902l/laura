public class Horse extends Animals {
    private int age;

    public Horse(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }
}