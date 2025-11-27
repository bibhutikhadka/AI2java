package week3;
import java.util.Scanner;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
     public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of days");
        int d=sc.nextInt();
        int year=(d/365);
        int month=(d-(year*365))/30;
        int days=(d-(60*year)-(month*30));
        System.out.println(d+"days is "+year+"years "+month+"months"+days+"days");
    }
}