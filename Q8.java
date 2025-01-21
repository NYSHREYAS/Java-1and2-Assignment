import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        System.out.println("Table for" +a+ ":");
        for (int i=1;i<=10;i++)
        {
            System.out.println(a+" x "+i+"="+(a* i));
        }
    }
}
