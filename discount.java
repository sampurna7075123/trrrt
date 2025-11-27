import java.util.Scanner;

/**
 * Write a description of class discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class discount
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mp = sc.nextFloat();
        char c = sc.next().charAt(0);
        float sp = 0;

        if(c=='A'){
            sp = mp - (mp*0.60f);
        } else if(c=='B'){
            sp = mp - (mp*0.40f);
        } else if(c=='C'){
            sp = mp - (mp*0.20f);
        } else if(c=='D'){
            sp = mp - (mp*0.10f);
        }
        System.out.println(sp);
    }
}