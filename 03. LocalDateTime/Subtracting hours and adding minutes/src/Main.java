import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String text = scanner.nextLine().trim();
        String[] number = scanner.nextLine().split("\\s+");

        LocalDateTime localDateTime = LocalDateTime.parse(text);
        localDateTime = localDateTime.minusHours(Integer.parseInt(number[0]));
        localDateTime = localDateTime.plusMinutes(Integer.parseInt(number[1]));
        System.out.println(localDateTime);
    }
}
