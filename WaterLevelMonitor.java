import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main (String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter water level:");
        int water_level=sc.nextInt();
        System.out.println("your water level is:"+water_level+ "liters");
        int remaining_level=1000-water_level;
        
        String Level=(water_level>=1000)?("WARNING:The water level has reached 1000 liter or more"):("Status normal");
        System.out.println(Level);
        
    }
    
    
    
    
}