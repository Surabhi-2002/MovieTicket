import java.util.Scanner;

class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    // Getters and Setters
    public int getTicketid() { return ticketid; }
    public void setTicketid(int ticketid) { this.ticketid = ticketid; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public static int getAvailableTickets() { return availableTickets; }
    public static void setAvailableTickets(int availableTickets) { Ticket.availableTickets = availableTickets; }

    // Method to calculate ticket cost
    public int calculateTicketCost(int nooftickets) {
        if (availableTickets >= nooftickets) {
            int totalAmount = nooftickets * price;
            availableTickets -= nooftickets;
            return totalAmount;
        } else {
            return -1;
        }
    }
}
