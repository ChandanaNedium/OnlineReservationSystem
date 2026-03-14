package task1;

import java.util.Scanner;

class Cancellation {

    Scanner sc = new Scanner(System.in);

    void cancelTicket() {

        System.out.println("===== CANCELLATION FORM =====");

        System.out.print("Enter PNR Number: ");
        int pnr = sc.nextInt();

        System.out.println("Ticket Found for PNR: " + pnr);

        System.out.print("Confirm Cancellation? (1=Yes / 2=No): ");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("Ticket Cancelled Successfully!");
        }
        else {
            System.out.println("Cancellation Aborted.");
        }
    }
}
