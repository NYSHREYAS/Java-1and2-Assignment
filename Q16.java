import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,d;
        System.out.print("Enter the number:");
        c=sc.nextInt();
        System.out.println("Fibonacci series: ");
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<c;i++) {
            d=a+b;
            System.out.println(d);
            a=b;
            b=d;
        }
    }
}
