public class Animals {
    public String food;
    public String location;

    public Animals(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is sleeping");
    }

    public void eat() {
        System.out.println("Eating " + this.food);
    }

    public void sleep() {
        System.out.println("Sleeping at " + this.location);
    }
}








