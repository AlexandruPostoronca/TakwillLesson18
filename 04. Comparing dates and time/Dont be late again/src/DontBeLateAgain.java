import java.time.LocalTime;
import java.util.Scanner;

public class DontBeLateAgain {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine().trim());
        LocalTime localTimeToClosedShop = LocalTime.of(19, 30);
        localTimeToClosedShop = localTimeToClosedShop.plusMinutes(30);
        for (int i = 0; i < number; i++) {
            String[] date = scanner.nextLine().trim().split("\\s+");
            if (LocalTime.parse(date[1]).isAfter(localTimeToClosedShop)) {
                System.out.println(date[0]);
            }
        }
    }
}