import java.util.Arrays;
import java.util.Scanner;
public class sort_menu {
    static void bubble(int size, int arr[]){
        int i,j;
        for(i=0;i<size-1;i++){
            for(j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void selection(int size, int arr[]){
            int i,j;
        for (i=0;i<arr.length - 1;i++)
        {
            int min_index = i;
            for (j=i+1;j<arr.length;j++){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    static void insertion(int size, int arr[]){
        int i,j;
        for (j=1; j<arr.length;j++) {
             int min_index = arr[j];
            i = j-1;
            while ((i > -1) && ( arr[i]>min_index)) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = min_index;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Press 1 to Continue / Press 0 to Exit: ");
        int press = input.nextInt();
        while(press==1){
            int i;
            System.out.print("\nEnter the size of array: ");
            int size = input.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements: ");
            for(i=0;i<size;i++)
                arr[i] = input.nextInt();
            System.out.print("\t\t\t\tMenu");
            System.out.print("\n-----------------------------------");
            System.out.print("\n1) Bubble Sort"+"\n2) Selection Sort"+"\n3) Insertion Sort");
            System.out.print("\n-----------------------------------");
            System.out.print("\nChoose: ");
            int choose = input.nextInt();
            switch (choose){
                case 1:
                    sort_menu.bubble(size,arr);
                    System.out.println("########### Bubble Sort ###########");
                    System.out.print("Sorted array: "+ Arrays.toString(arr));
                    break;

                case 2:
                    sort_menu.selection(size,arr);
                    System.out.println("########### Selection Sort ###########");
                    System.out.println("Sorted array: "+ Arrays.toString(arr));
                    break;

                case 3:
                    sort_menu.insertion(size,arr);
                    System.out.println("########### Insertion Sort ###########");
                    System.out.println("Sorted array: "+ Arrays.toString(arr));
                    break;
                default:
                    System.out.println("Wrong operator!!!");
            }
            System.out.print("\n\nPress 1 to repeat / Press 0 to exit: ");
            int press1 = input.nextInt();
            if(press1==1) continue;
            else if (press1==0){
                System.out.print("Loop terminated!");
                break;
            }
        }
        System.out.print("\nProcess terminated!");
        }
    }
