import java.util.*;
public class grossSalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float BS,HRA,DA,PF,GS;
        BS = sc.nextFloat();
        HRA = sc.nextFloat();
        DA = sc.nextFloat();
        PF = (BS*12)/100;
        GS = BS+HRA+DA+PF;
        System.out.printf("%.2f
%.2f",PF,GS);
    }
}