import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String[] string = scanner.nextLine().split("\\s+");
        LocalTime localTime = LocalTime.parse(s);
        localTime = localTime.minusHours(Integer.parseInt(string[0]));
        localTime = localTime.minusMinutes(Integer.parseInt(string[1]));
        System.out.println(localTime);
    }
}