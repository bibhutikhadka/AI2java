package week4;
import java.util.Scanner;


/**
 * Write a description of class DiscountPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiscountPrice
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marked price");
        float MP=sc.nextFloat();
        
        System.out.println("enter chatagory");
        char category=sc.next().charAt(0);
        float discount;
        switch(category)
        {
          case 'A':
              discount=60;
               System.out.println("you got 60% discount");
          break;
          case 'B':
              discount=40;
              System.out.println("you got 40% discount");
          break;
          case 'C':
               discount=20;
               System.out.println("you got 20% discount");
          break;
          case 'D':
               discount=10;
               System.out.println("you got 10% discount");
          break;
          default:
             System.out.println("invalid category");
          return;
        
        }
        float sp=MP-(MP*discount/100);
        System.out.println("Selling price= "+sp);
        
        
        
    }
}