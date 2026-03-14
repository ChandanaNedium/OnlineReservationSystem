package task1;

import java.util.Scanner;

public class OnlineReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(LoginSystem.login()) {

            Reservation r = new Reservation();
            Cancellation c = new Cancellation();

            while(true) {

                System.out.println("\n===== ONLINE RESERVATION SYSTEM =====");
                System.out.println("1. Reserve Ticket");
                System.out.println("2. Cancel Ticket");
                System.out.println("3. Exit");

                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();

                switch(choice) {

                    case 1:
                        r.reserveTicket();
                        break;

                    case 2:
                        c.cancelTicket();
                        break;

                    case 3:
                        System.out.println("Thank You!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        }
    }
}
