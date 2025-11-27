import java.util.Scanner;

/**
 * Write a description of class senarioTAX here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senarioTAX
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;

        if(income > 500000){
            tax += 500000 * 1 / 100;
        } else {
            tax += income * 1 / 100;
        }

        if(income > 700000){
            tax += 200000 * 10 / 100;
        } else if(income > 500000){
            tax += (income - 500000) * 10 / 100;
        }

        if(income > 700000){
            if(income > 1200000){
                tax += (1200000 - 700000) * 20 / 100;
            } else {
                tax += (income - 700000) * 20 / 100;
            }
        }

        System.out.println(tax);
    }
}