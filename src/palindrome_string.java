import java.util.Scanner;
public class palindrome_string {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String n = input.nextLine();
        String rev="";
        int length = n.length();
        int i;
        for(i=(length-1);i>=0;i--){
            rev=rev+n.charAt(i);
        }
        if(n.toLowerCase().equals(rev.toLowerCase()))
            System.out.println("The string is palindrome");
        else
            System.out.println("The string is not palindrome");
    }
}
