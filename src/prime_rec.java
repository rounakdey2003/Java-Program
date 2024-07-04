import java.util.Scanner;
public class prime_rec {
    static boolean prime(int n){
        int count=2;
        if(n<=2)
            return (n==2)?true:false;
        if(n%count==0)
            return false;
        if(count*count>n)
            return true;

        return prime(n);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        if(prime(n))
            System.out.println("The number is prime");
        else
            System.out.println("The number is non prime");
    }
}
