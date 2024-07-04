import java.util.Scanner;

    public class temperature {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Press '1' to start or '0' to stop: ");
            int loop = input.nextInt();

            while (loop == 1){

                System.out.print("\nMain Menu \n--------- \n1) Fahrenheit to Celsius \n2) Celsius to Fahrenheit \n--------- \nChoose: ");
                int choice = input.nextInt();

                switch (choice){

                    case 1:
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double f = input.nextDouble();
                        double result = (5/9)*(f - 32);
                        System.out.print(f + "'F = " + result + "'C" );
                        break;

                    case 2:
                        System.out.print("Enter temperature in Celsius: ");
                        double c = input.nextDouble();
                        double result1 = 1.8 * (c + 32);
                        System.out.print(c + "'C = " + result1 + "'F" );
                        break;

                    default:
                        System.out.print("Wrong Operator !!");
                }
                System.out.print("\nPress '1' to continue or '0' to stop: ");
                int stop = input.nextInt();
                if(stop == 1){
                    continue;
                } else if (stop == 0) {
                    break;
                }
            }
            System.out.print("Successfully terminated");
        }
    }




