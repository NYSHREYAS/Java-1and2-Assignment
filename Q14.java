import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,r=0;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        b=a;
        while(a!= 0)
        {
            r=r*10+a%10;
            a/=10;
        }
        if (b==r) {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
    }
}
