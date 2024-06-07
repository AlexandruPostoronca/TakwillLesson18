import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime1 = LocalDateTime.parse(scanner.nextLine().trim());
        LocalDateTime localDateTime2 = LocalDateTime.parse(scanner.nextLine().trim());

        int number = Integer.parseInt(scanner.nextLine().trim());
        int result = 0;
        if (localDateTime1.isEqual(localDateTime2)) {
            result = 1;
        } else {
            for (int i = 0; i < number; i++) {
                String data = scanner.nextLine().trim();
                int numberOfRepeated = localDateTime1.isEqual(LocalDateTime.parse(data)) ? 1 : 0;
                int numberOfRepeated1 = localDateTime2.isEqual(LocalDateTime.parse(data)) ? 1 : 0;
                if (LocalDateTime.parse(data).isBefore(localDateTime1) && LocalDateTime.parse(data).isAfter(localDateTime2)) {
                    result = +1;
                }
                result = result + numberOfRepeated1 + numberOfRepeated;
            }
        }
        System.out.println(result);
    }
}