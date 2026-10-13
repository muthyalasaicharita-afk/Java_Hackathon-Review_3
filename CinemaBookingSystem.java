class TicketBookings 
{
    String customerName, movieName;
    double ticketPrice;
    int tickets;

    
     TicketBookings(String customer, String movie, double price, int count) 
     {
        customerName = customer.toUpperCase();
        movieName = movie.toUpperCase();
        ticketPrice = price;
        tickets = count;
    }

    
     TicketBookings(String customer, String movie, int count) 
     {
        this(customer, movie, 200.00, count);
    }

    
     void bookTicket() 
     {

        displaySummary();
    }


     void bookTicket(int extraTickets) 
     {
        tickets += extraTickets;
        displaySummary();
    }

     void displaySummary() 
     {
        if (tickets <= 0) 
        {
            System.out.println("Booking Failed: Invalid Ticket Count\n");
            return;
        }

        double total = ticketPrice * tickets;
        double discount = (tickets >= 5) ? total * 0.10 : 0.0;
        double finalAmount = total - discount;

        System.out.println("========== CINEMA TICKET BOOKING ==========");
        System.out.println("Customer Name    : " + customerName);
        System.out.println("Movie Name       : " + movieName);
        System.out.println("Ticket Price     : Rs. " + String.format("%.2f", ticketPrice));
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Booking Status   : Booking Successful");
        System.out.println("Total Amount     : Rs. " + String.format("%.2f", total));
        System.out.println("Discount         : Rs. " + String.format("%.2f", discount));
        System.out.println("Final Amount     : Rs. " + String.format("%.2f", finalAmount));
        System.out.println("===========================================\n");
    }
}

public class CinemaBookingSystem
{
    public static void main(String[] args) 
    {
        new TicketBookings("VIKRAM", "Avatar", 200.00, 5).bookTicket();
        new TicketBookings("ARUN", "Avatar", 2).bookTicket();
    }
}