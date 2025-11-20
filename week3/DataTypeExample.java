package week3;


/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main (String[]arg)
    {
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(Integer.BYTES);
        //System.out.println(Integer.SIZE);
        //System.out.println(Float.MAX_VALUE+"\n"+Float.MIN_VALUE+"\n"+Float.BYTES+"\n"+Float.SIZE);
    
        System.out.println("my name is\"bibhuti\" ");
        
        byte b=12;
        byte c=13;
        byte d=(byte)(b+c);
        float f=233.3f;
        long l=200l;
        
        int a= 20;
        float g=2.33f;
        double e=2.334;
        
        int x=(int)(a+g+e);
        
        System.out.println(x);
    
        int h='A'+'B';
        
        System.out.println((int)h);
        
        int i=50;
        System.out.println((char)i);
        
        
        int length=10;
        int breadth=20;
        
        int area=length*breadth;
        int peri=2*(length+breadth);
        
        System.out.println("Area="+area+"\nPerimeter="+peri);
        
        
        int principle=500;
        int time=2;
        float rate=2.4f;
        
        float SI=(principle*time*rate)/100f;
        
        double CI=principle*Math.pow(1+rate,time);
        
        System.out.println("SimpleInterest="+SI+"\nCompoundInterest="+CI);
        
        
        
        
        
    
    }
}