import java.util.Scanner;

/**
 * Write a description of class PositiveNegativeZero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegativeZero
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("Positive");
        } else if(n < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}