import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b=0;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        while (a!= 0) {
            b=b*10+a%10;
            a/=10;
        }
        System.out.println("Reversed number: " +b);
    }
}