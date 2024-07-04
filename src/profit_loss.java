import java.util.Scanner;

    public class profit_loss
    {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter cost price of the article: ");
            double cost = input.nextDouble();

            System.out.print("Enter selling price of the article: ");
            double sell = input.nextDouble();

            double profitLoss = sell - cost;
            double percentage = Math.abs(profitLoss) / cost * 100;
            if (profitLoss > 0) {
                System.out.println("Profit = " + profitLoss);
                System.out.println("Profit percentage = " + percentage + "%");
            }
            else if (profitLoss < 0) {
                System.out.println("Loss = " + Math.abs(profitLoss));
                System.out.println("Loss percentage = " + percentage + "%");
            }
            else {
                System.out.println("Neither profit nor loss");
            }
        }
    }

