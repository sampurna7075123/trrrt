import java.util.Scanner;

/**
 * Write a description of class gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gpa
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        if(gpa < 0 || gpa > 4.0){
            System.out.println("Invalid GPA");
        } else if(gpa >= 3.6){
            System.out.println("A");
        } else if(gpa >= 3.0){
            System.out.println("B");
        } else if(gpa >= 2.0){
            System.out.println("C");
        } else if(gpa >= 1.0){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}