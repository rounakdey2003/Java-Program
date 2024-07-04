import java.util.Scanner;

    public class time_period
    {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter Length: ");
            double lenght = input.nextDouble();

            System.out.print("Enter Gravity: ");
            double gravity = input.nextDouble();

            double time = 2 * 3.14159 * Math.sqrt(lenght / gravity);
            System.out.println("Time Period = " + time);
            input.close();
        }
    }
