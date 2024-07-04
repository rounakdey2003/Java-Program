import java.util.Scanner;

    public class calculater{

        public static void main(String[] args){
            float result;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            float f = input.nextFloat();

            System.out.print("Enter the second number: ");
            float s = input.nextFloat();

            System.out.print("Enter the operator (+ - * / %): ");
            char c = input.next().charAt(0);

            switch(c) {

                case '+':
                    result = (f + s);
                    System.out.print("Addition: " + f + " + " + s + " = " + result);
                    break;

                case '-':
                    result = (f - s);
                    System.out.print("Subtraction: " + f + " - " + s + " = " + result);
                    break;

                case '*':
                    result = (f * s);
                    System.out.print("Multiplication: " + f + " * " + s + " = " + result);
                    break;

                case '/':
                    result = (f / s);
                    System.out.print("Division: " + f + " / " + s + " = " + result);
                    break;

                case '%':
                    result = (f % s);
                    System.out.print("Remainder: " + f + " % " + s + " = " + result);
                    break;

                default:
                    System.out.print("Wrong Operator !!");
                    break;
            }
        }
    }
