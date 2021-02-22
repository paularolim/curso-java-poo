package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int room = scanner.nextInt();

            System.out.print("Check-in date (dd/mm/yyyy): ");
            Date checkIn = simpleDateFormat.parse(scanner.next());

            System.out.print("Check-out date (dd/mm/yyyy): ");
            Date checkOut = simpleDateFormat.parse(scanner.next());

            Reservation reservation = new Reservation(room, checkIn, checkOut);
            System.out.println();
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = simpleDateFormat.parse(scanner.next());

            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = simpleDateFormat.parse(scanner.next());

            reservation.updateDates(checkIn, checkOut);

            System.out.println();
            System.out.println("Updated reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e ) {
            System.out.println("Reservation error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected exception");
        }

        scanner.close();
    }
}
