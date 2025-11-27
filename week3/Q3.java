package week3;
import java.util.Scanner;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter time in seconds");
        int input=sc.nextInt();
        int hour=(input/3600);
        int minute=(input-(3600*hour))/60;
        int second=(input-(3600*hour)-(minute*60));
        System.out.println(input+"sec is "+hour+"hrs "+minute+"mins"+second+"secs");
        
    }
}