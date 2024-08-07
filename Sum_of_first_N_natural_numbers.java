import java.util.*;
public class sumOFFirstN
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n,sum=0,i;
        n = read.nextInt();
        sum=n*(n+1)/2;
        System.out.printf("%d",sum);
    }
}