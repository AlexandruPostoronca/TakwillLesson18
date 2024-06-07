import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime initLocalDataTime = LocalDateTime.MIN;

        int number = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < number; i++) {
            LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine().trim());
            initLocalDataTime = initLocalDataTime.isAfter(localDateTime) ? initLocalDataTime : localDateTime;
        }
        System.out.println(initLocalDataTime);
    }
}