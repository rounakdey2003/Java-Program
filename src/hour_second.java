import java.util.Scanner;

    public class hour_second
    {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter time in seconds: ");
            int time = input.nextInt();

            int hrs = time / 3600;
            int mins = (time % 3600) / 60;
            int secs = (time % 3600) % 60;

            System.out.println(hrs + " Hours " + mins  + " Minutes " + secs + " Seconds");
        }
    }
