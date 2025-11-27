package week4;
import java.util.Scanner;


/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFail
{
    public static void main (String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        if(marks>=40)
        { 
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}