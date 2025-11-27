package week4;
import java.util.Scanner;


/**
 * Write a description of class NestedIfExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedIfExample
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num1=sc.nextInt();
       if(num1%3==0)
       {
           if(num1%5==0)
           {
               System.out.println("Divide by both 3 and 5");
           }
               else{
                    System.out.println("Divide by 3 and not by 5");
               }
           }
         else{
               if(num1%5==0)
               {
                 System.out.println("Divide by 5 and not by 3");
    
               }
               else
               {
                System.out.println("Divide by both 3 and 5");           
               }
    
           }
       }
}