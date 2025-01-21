import java.util.*;
public class Q18 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        if(a<=1)
        {
            System.out.println("It is not a prime number.");
        }
        else
        {
            for (int i=2;i<a;i++)
            {
                if (a%i==0)
                {
                    System.out.println("It is not a prime number.");
                    return ;
                }
            }
            System.out.println("It is a prime number.");
        }
    }
}