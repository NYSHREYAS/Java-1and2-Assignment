import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        if (a<1) {
            System.out.println("Please enter a positive integer.");
        }
        else
        {
            b=0;
            for (int i = 1; i <=a; i++)
            {
                b=b+i;
            }
            System.out.println("The sum of natural numbers are: " +b);
        }
    }
}
