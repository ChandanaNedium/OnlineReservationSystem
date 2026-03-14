package task1;

import java.util.Scanner;

class Reservation {

    Scanner sc = new Scanner(System.in);

    int trainNo;
    String trainName;
    String passengerName;
    String classType;
    String date;
    String from;
    String to;

    void reserveTicket() {

        System.out.println("===== RESERVATION FORM =====");

        System.out.print("Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Train Number: ");
        trainNo = sc.nextInt();
        sc.nextLine();

        trainName = "Express Train"; // auto filled

        System.out.print("Class Type (Sleeper/AC): ");
        classType = sc.nextLine();

        System.out.print("Date of Journey: ");
        date = sc.nextLine();

        System.out.print("From: ");
        from = sc.nextLine();

        System.out.print("To: ");
        to = sc.nextLine();

        System.out.println("\nReservation Successful!");
        System.out.println("Train Name: " + trainName);
    }
}
