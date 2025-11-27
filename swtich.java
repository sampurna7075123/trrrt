import java.util.Scanner;

/**
 * Write a description of class swtich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class swtich
{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mp = sc.nextFloat();
        char c = sc.next().charAt(0);
        float sp = 0;

        switch(Character.toUpperCase(c)){
            case 'A': sp = mp - (mp*0.60f); 
            break;
            case 'B': sp = mp - (mp*0.40f); 
            break;
            case 'C': sp = mp - (mp*0.20f);
            break;
            case 'D': sp = mp - (mp*0.10f);
            break;
        }
        System.out.println(sp);
    }
}