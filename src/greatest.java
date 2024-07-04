import java.util.Scanner;

    public class greatest
    {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter First Number: ");
            int a = input.nextInt();

            System.out.print("\nEnter Second Number: ");
            int b = input.nextInt();

            System.out.print("\nEnter Third Number: ");
            int c = input.nextInt();

            int greatest = Math.max(a, b);
            greatest = Math.max(greatest, c);

            int smallest = Math.min(a, b);
            smallest = Math.min(smallest, c);

            System.out.println("\n\nGreatest Number = " + greatest);
            System.out.println("\nSmallest Number = " + smallest);
        }
    }

