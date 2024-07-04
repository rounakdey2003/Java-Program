import java.util.Scanner;

    public class number {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter any number: ");
            int num = input.nextInt();

            if (num > 0) {
                System.out.print("\n" + num + " is a positive number");
            }
            else if (num < 0) {
                System.out.print("\n" + num + " is a negetive number");
            }
            else{
                System.out.print("\nThe number is " + num);
            }
        }
    }

