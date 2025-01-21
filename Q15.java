import java.util.*;
public class Q15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        b=0;
        while(a!=0)
        {
            b=b+(a%10);
            a/=10;
        }
        System.out.println("Sum of digits: " +b);
    }
}
