import java.util.*;
public class surfaceAndVolume
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int area = 6*a*a;
        int volume = a*a*a;
        System.out.printf("Surface area = %d and Volume = %d",area,volume);
    }
}