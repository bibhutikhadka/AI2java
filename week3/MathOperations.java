package week3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)
    {
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String positive="PASSED";
        String negative="FAILED";
        String out=(a>=40)?positive:negative;
        System.out.println(""+out);
    }
}