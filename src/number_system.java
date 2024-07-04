import java.util.Scanner;

public class number_system {
    public static void main(String[] args){
        System.out.println("Enter the decimal number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int [10];
        int i = 0,j;

        while(n!=0){
            arr[i]=n%16;
            n=n/16;
            i++;
        }
        for(j=i-1;j>=0;j--){
            if(arr[i]>9)
                System.out.println();
        }
    }
}