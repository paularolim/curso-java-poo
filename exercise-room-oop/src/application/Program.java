package application;

import entities.Guest;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Guest[] guests = new Guest[10];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            guests[room] = new Guest(name, email);

            sc.nextLine();
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null)
                System.out.println(i + ": " + guests[i].getName() + ", " + guests[i].getEmail());
        }

        sc.close();
    }
}
