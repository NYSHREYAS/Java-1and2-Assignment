import java.util.*;
public class Q11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,r="";
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        for (int i=s.length()-1;i>=0;i--) {
            r=r+s.charAt(i);
        }
        if (s.equals(r)) {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
    }
}
