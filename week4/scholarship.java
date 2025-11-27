package week4;
import java.util.Scanner;

/**
 * Write a description of class scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scholarship
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your gpa");
        double gpa=sc.nextDouble();

        System.out.println("enter your attendance");
        int attendance=sc.nextInt();

        System.out.println("enter your attitude score(1-10)");
        int attitude=sc.nextInt();

        if(gpa>=3.2){
            if (attendance>80)
            {
                if(attitude<5)
                    System.out.println("You are elligible for scholarship");

            }
            else{
                System.out.println("Not elligible:Attitude must be less than 5");
            }

        }
        else{
            if (attendance<80){
                System.out.println("Not elligible:Attendance less than 80");

            }
            else
                System.out.println("Not elligible:GPA less than 3.2");
        }
    }
}

