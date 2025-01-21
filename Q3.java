import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        float e;
        System.out.print("Enter first number: ");
        a= scanner.nextInt();
        System.out.print("Enter second number: ");
        b= scanner.nextInt();
        c=a-b;
        d=a*b;
        e= (float) a/b;
        System.out.println("Difference: " +c);
        System.out.println("Product: " +d);
        System.out.println("Division: " +e);
    }
}
