import java.util.Scanner;

/**
 * Write a description of class TAX here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TAX
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax = 0;

        if(income <= 500000){
            tax = income * 0.01;
        } 
        else if(income <= 700000){
            tax = 500000 * 0.01;
            tax += (income - 500000) * 0.10;
        } 
        else if(income <= 1000000){
            tax = 500000 * 0.01;
            tax += 200000 * 0.10;
            tax += (income - 700000) * 0.20;
        } 
        else if(income <= 2000000){
            tax = 500000 * 0.01;
            tax += 200000 * 0.10;
            tax += 300000 * 0.20;
            tax += (income - 1000000) * 0.30;
        } 
        else if(income <= 5000000){
            tax = 500000 * 0.01;
            tax += 200000 * 0.10;
            tax += 300000 * 0.20;
            tax += 1000000 * 0.30;
            tax += (income - 2000000) * 0.36;
        } 
        else {
            tax = 500000 * 0.01;
            tax += 200000 * 0.10;
            tax += 300000 * 0.20;
            tax += 1000000 * 0.30;
            tax += 3000000 * 0.36;
            tax += (income - 5000000) * 0.39;
        }

        System.out.println(tax);
    }
}