import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            Scanner input = new Scanner(System.in);
            System.out.println("******** Linked List ********\n");
            System.out.println("\t\t\tMenu");
            System.out.println("1) Adding Elements. \n2) Updating Elements. \n3) Removing Elements.\n------------------------");
            int loop = 1;
            while(loop==1) {
                System.out.print("\nChoose: ");
                int choose =input.nextInt();
                switch (choose) {
                    case 1:
                        System.out.print("Enter any string: ");
                        String write = input.next();
                        list.add(write);
                        System.out.println("Stores Successfully");
                        System.out.println(write);
                        break;
                    case 2:
                        System.out.print("Update the previous (index,element): ");
                        int writeupd = input.nextInt();
                        write = input.next();
                        list.set(writeupd, write);
                        System.out.println("Updated Successfully");
                        System.out.println(writeupd);
                        break;
                    case 3:
                        System.out.print("Enter the removing element (object): ");
                        write = input.next();
                        list.remove(write);
                        System.out.println("Removed Successfully");
                        System.out.println(write);
                        break;
                }
                System.out.print("Press 1 to repeat / 0 to exit: ");
                int loop1 = input.nextInt();
                if (loop1 == 1) continue;
                else if (loop1 == 0) {
                    System.out.println("Loop terminated!!");
                }
            }
            System.out.println("Program terminated!!");
    }
}
