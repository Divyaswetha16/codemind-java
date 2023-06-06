import java.util.*;
public class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float area;
        final float pi=3.14f;
        r=sc.nextInt();
        area=pi*r*r;
        System.out.format("%.2f",area);
        sc.close();
    }
}