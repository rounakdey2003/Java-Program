import java.util.Scanner;

    public class commission
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter amount: ");
            double amount = input.nextDouble();

            if(amount <=10000){
                System.out.print("Sales amount upto 10000");
                System.out.print("\nCommission rate is 2%");
                double commission = (0.02)*amount;
                System.out.println("\nCommission amount = " + commission);
            }
            else if (amount >= 10001 && amount <= 20000){
                System.out.print("Sales amount 10001 - 20000");
                System.out.print("\nCommission rate is 3%");
                double commission = (0.03)*amount;
                System.out.println("\nCommission amount = " + commission);
            }
            else if (amount >= 20001 && amount <= 50000){
                System.out.print("Sales amount 20001 - 50000");
                System.out.print("\nCommission rate is 5%");
                double commission = (0.05)*amount;
                System.out.println("\nCommission amount = " + commission);
            }
            else if (amount >= 50001 && amount <= 70000){
                System.out.print("Sales amount 50001 - 70000");
                System.out.print("\nCommission rate is 8%");
                double commission = (0.08)*amount;
                System.out.println("\nCommission amount = " + commission);
            }
            else if (amount > 70000){
                System.out.print("Sales amount above 70000");
                System.out.print("\nCommission rate is 10%");
                double commission = (0.10)*amount;
                System.out.println("\nCommission amount = " + commission);
            }
        }
    }

