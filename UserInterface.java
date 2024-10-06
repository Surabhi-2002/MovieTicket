import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();

        System.out.println("Enter no of bookings");
        int bookings = scanner.nextInt();

        System.out.println("Enter the available tickets");
        int availableTickets = scanner.nextInt();
        Ticket.setAvailableTickets(availableTickets);

        for (int i = 0; i < bookings; i++) {
            System.out.println("Enter the ticketid");
            int ticketid = scanner.nextInt();

            System.out.println("Enter the price");
            int price = scanner.nextInt();

            System.out.println("Enter the no of tickets");
            int noOfTickets = scanner.nextInt();

            Ticket ticket = new Ticket();
            ticket.setTicketid(ticketid);
            ticket.setPrice(price);

            int totalAmount = ticket.calculateTicketCost(noOfTickets);
            if (totalAmount == -1) {
                System.out.println("Tickets are not available");
            } else {
                System.out.println("Available tickets: " + Ticket.getAvailableTickets());
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
            }
        }

        if (Ticket.getAvailableTickets() == 0) {
            System.out.println("House full");
        }
    }
}