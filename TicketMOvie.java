import java.util.Scanner;

/**
 * Write a description of class TicketMOvie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketMOvie
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age group (child, adult, senior):");
        String age = sc.nextLine();

        System.out.println("Enter movie language (nepali, hindi, english):");
        String lang = sc.nextLine();

        System.out.println("Are you a student? (yes/no):");
        String student = sc.nextLine();

        System.out.println("Is it a festival day? (yes/no):");
        String festival = sc.nextLine();

        double price = 0;

        if (age.equals("child")) {
            price = 150;
        } else if (age.equals("adult")) {
            price = 250;
        } else if (age.equals("senior")) {
            price = 200;
        }

        if (lang.equals("hindi")) {
            price = price + 50;
        } else if (lang.equals("english")) {
            price = price + 100;
        }

        if (student.equals("yes")) {
            price = price - (price * 0.20);
        }

        if (festival.equals("yes")) {
            price = price - (price * 0.15);
        }

        System.out.println("Final Ticket Price: Rs. " + price);
    }
}