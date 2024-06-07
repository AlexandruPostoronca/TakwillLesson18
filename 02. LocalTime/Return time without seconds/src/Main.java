import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().trim();
        LocalTime localTime = LocalTime.parse(text);
        System.out.println(localTime.withSecond(0));
    }
}