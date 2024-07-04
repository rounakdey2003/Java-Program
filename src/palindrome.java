import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int dum, rev = 0, rem;
        dum = n;
        while(n!=0){
            rem = n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(dum == rev)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
}
