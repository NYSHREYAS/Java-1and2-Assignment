import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.print("Enter a string: ");
        String str=sc.nextLine().toLowerCase();
        for (char a : str.toCharArray()) {
            if ("aeiou".indexOf(a)!=-1) {
                c++;
            }
        }
        System.out.println("Vowels: " +c);
    }
}
