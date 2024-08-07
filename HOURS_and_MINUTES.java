import java.util.*;
public class hAndM
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n,h,m;
        n = read.nextInt();
        h = n/60;
        m = n%60;
        System.out.printf("%d Hour(s) %d Minute(s)",h,m);
    }
}