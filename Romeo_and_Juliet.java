import java.util.*;
public class romeoAndJuliet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y,z,max;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        max = ((x*5)+(y*10))/z;
        System.out.printf("%d",max);
    }
}