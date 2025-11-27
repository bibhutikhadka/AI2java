package week4;
import java.util.Scanner;


/**
 * Write a description of class gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gpa
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter gpa");
        double gpa=sc.nextDouble();
        if(gpa<0.0 || gpa>4.0)
        {
            System.out.println("Invalid gpa");
            return;
        }
        String grade;
         if (gpa >= 3.6) {
            grade = "A+";
        } else if (gpa >= 3.0) {
            grade = "A";
        } else if (gpa >= 2.0) {
            grade = "B+";
        } else if (gpa >= 1.0) {
            grade = "B";
        } else {
            grade = "F";
        }

       
        System.out.println("Your Grade: " + grade);
    }
}

  