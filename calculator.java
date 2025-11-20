import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        if (num1>num2){
            System.out.println("the greater number is: "+num1);
        }else{
        System.out.println("the greater number is: "+num2);
        }
        int sum=num1+num2;
        int multi=num1*num2;
        int div=num1/num2;
        int sub=num1-num2;
        System.out.println("addition"+sum);
        System.out.println("multiplication"+multi);
        System.out.println("division "+div);
        System.out.println("subtraction "+sub);
    }
}