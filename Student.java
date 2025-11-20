import java.util.Scanner;

/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
   public static void main (String[]arg)
   {
      Scanner sc = new Scanner (System.in);
      System.out.println("enter student name");
      String student_name=sc.nextLine();
      System.out.println("enter students age");
      int age=sc.nextInt();
      System.out.println("enter students gpa");
      float gpa=sc.nextFloat();
      System.out.println(student_name);
      System.out.println(age);
      System.out.println(gpa);

      
       
   }
}