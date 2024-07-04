import java.util.Scanner;

    public class discount
    {
        public static void main(String[] args){

            System.out.print("Enter the marked price: ");
            Scanner input = new Scanner (System.in);
            float price = input.nextFloat();

            if(price <= 1000){

                System.out.print("\nDiscount given: 2%");
                float discount = (float) (price * 0.02);
                float sell = price - discount;
                System.out.print("\nDiscount price: " + discount);
                System.out.print("\nPrice after discount: " + sell);
            }
            else if(price >= 1001 && price <= 5000) {

                System.out.print("\nDiscount given: 4%");
                float discount = (float) (price * 0.04);
                float sell = price - discount;
                System.out.print("\nDiscount price: " + discount);
                System.out.print("\nPrice after discount: " + sell);
            }
            else if (price >= 5001 && price <= 10000) {

                System.out.print("\nDiscount given: 8%");
                float discount = (float) (price * 0.08);
                float sell = price - discount;
                System.out.print("\nDiscount price: " + discount);
                System.out.print("\nPrice after discount: " + sell);
            }
            else if (price > 10000 ) {

                System.out.print("\nDiscount given: 10%");
                float discount = (float) (price * 0.10);
                float sell = price - discount;
                System.out.print("\nDiscount price: " + discount);
                System.out.print("\nPrice after discount: " + sell);
            }
        }
    }

