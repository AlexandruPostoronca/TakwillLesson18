import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long number=Integer.parseInt(scanner.nextLine().trim());

        LocalTime localTime = LocalTime.ofSecondOfDay(number);
        System.out.println(localTime);
    }
}