import java.util.Scanner;

    public class area{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Press '1' to start or '0' to stop: ");
            int loop = input.nextInt();

            while(loop == 1) {

                System.out.print("Main Menu \n--------- \n1) Area of Square \n2) Perimeter of Square \n3) Area of Circle \n4) Circumference of Circle \n--------- \nChoose: ");
                int menu = input.nextInt();

                switch (menu) {

                    case 1:
                        System.out.print("Enter the side of the sq: ");
                        float side = input.nextFloat();
                        System.out.print("Area: " + (side * side));
                        break;

                    case 2:
                        System.out.print("Enter the side of the sq: ");
                        float side1 = input.nextFloat();
                        System.out.print("Perimeter: " + (4 * side1));
                        break;

                    case 3:
                        System.out.print("Enter the radius of circle: ");
                        float radius = input.nextFloat();
                        System.out.print("Area: " + (3.14 * radius * 2));
                        break;

                    case 4:
                        System.out.print("Enter the radius of circle: ");
                        float radius1 = input.nextFloat();
                        System.out.print("Circumference: " + (2 * 3.14 * radius1));
                        break;

                    default:
                        System.out.print("Wrong Operator !!");
                        break;
                }

                System.out.print("\nPress '1' to continue or '0' to stop: ");
                int stop = input.nextInt();
                if(stop == 1){
                    continue;
                }
                else if (stop == 0){
                    break;
                }
            }
            System.out.print("Successfully terminated");
        }
    }


