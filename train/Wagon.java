import java.util.ArrayList;

public class Wagon {
    private int seatAmount;
    private boolean isRestaurant;
    private boolean isFreight;
    ArrayList <Ticket> tickets = new ArrayList<>();

    public Wagon(int seatAmount, boolean isRestaurant, boolean isFreight){
        this.seatAmount = seatAmount;
        this.isRestaurant = isRestaurant;
        this.isFreight = isFreight;
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public void setSeatAmount(int seatAmount) {
        this.seatAmount = seatAmount;
    }

    public boolean isRestaurant() {
        return isRestaurant;
    }

    public void setRestaurant(boolean restaurant) {
        isRestaurant = restaurant;
    }

    public boolean isFreight() {
        return isFreight;
    }

    public void setFreight(boolean freight) {
        isFreight = freight;
    }

    public ArrayList <Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList <Ticket> tickets) {
        this.tickets = tickets;
    }
}