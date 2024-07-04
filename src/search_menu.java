import java.util.Scanner;
public class search_menu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Press 1 to Continue / Press 0 to Exit: ");
        int menu = input.nextInt();

        if(menu == 1){
            System.out.print("\n\t\t\tMenu\n");
            System.out.print("---------------------------\n");
            System.out.print("1) Linear Search\n");
            System.out.print("2) Binary Search\n");
            System.out.print("---------------------------\n");
            System.out.print("Choose: ");
            int choose = input.nextInt();

            if(choose == 1){
                int i,position=0;
                System.out.println("\n######### Linear Search #########");
                System.out.print("\nEnter the size of array: ");
                int size = input.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements: ");
                for(i=0;i<size;i++)
                    arr[i] = input.nextInt();

                System.out.print("Enter the Search element: ");
                int search = input.nextInt();
                for(i=0;i<size;i++){
                    if(search==arr[i]){
                        position=i+1;
                        break;
                    }
                }
                if(position==0)
                    System.out.print("Position error!");
                else
                    System.out.println("The position is: "+position);
            }

            if(choose==2){
                int i;
                System.out.println("\n######### Binary Search #########");
                System.out.print("\nEnter the size of array: ");
                int size = input.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements: ");
                for(i=0;i<size;i++)
                    arr[i] = input.nextInt();

                System.out.print("Enter the Search element: ");
                int search = input.nextInt();
                int firstpos = 0;
                int lastpos = arr.length-1;
                int midpos = (firstpos+lastpos)/2;
                while(firstpos<=lastpos){
                    if(arr[midpos]<search){
                        firstpos=midpos+1;
                    } else if (arr[midpos]==search) {
                        System.out.println("The position is: "+midpos);
                        break;
                    }
                    else
                        lastpos=midpos-1;
                    midpos=(firstpos+lastpos)/2;
                }
                if(firstpos>lastpos){
                    System.out.println("Position error!");
                }
            }
        }
        if(menu == 0){
            System.out.println("Terminated Successfully");
        }
    }
}
