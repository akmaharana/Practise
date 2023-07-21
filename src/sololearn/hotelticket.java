package sololearn;

import java.util.Scanner;

public class hotelticket {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();
        Ticket ticket = new Ticket(movie, row, seat);
        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}

class Ticket {
    private final String movie;
    private final int row;
    private final int seat;

    //complete the constructor
    public Ticket(String s, int b, int a) {
        this.movie = s;
        this.row = b;
        this.seat = a;

    }

    public String getMovie() {
        return movie;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}

