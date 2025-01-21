import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        if (a%2==0) {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }
    }
}
