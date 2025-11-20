package week3;
import java.util.Scanner;


/**
 * Write a description of class Maths here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maths
{
    public static void main (String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("the greater number is "+num1);
        }else{
            System.out.println("the greater number is "+num2);
        }
        int sum=num1+num2;
        System.out.println("sum: "+sum);
        System.out.println("enter third number : ");
        int num3=sc.nextInt();
        System.out.println("In Comparision of three numbers : ");
        if(num1>num2 && num2>num3){
            System.out.println("the greatest num is "+num1);
        }else if (num2>num1 && num2>num3){
          System.out.println("the greatest num is "+num2);
        }else{
          System.out.println("the greatest num is "+num3);  
        }
        
        }
    }
