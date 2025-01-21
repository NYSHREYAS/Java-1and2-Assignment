import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b=1;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            b=b*i;
        }
        System.out.println("The factorial is: "+b);
    }
}