import java.util.Scanner;
public class Add
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a;
        a=read.nextInt();
        double pi=3.14;
        System.out.printf("%.2f
",pi*a*a);
        System.out.printf("%.2f",2*pi*a);
    }
}