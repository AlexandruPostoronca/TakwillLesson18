import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");

        LocalDateTime localDateTime = LocalDateTime.parse(text[0]);
        localDateTime = localDateTime.plusDays(Integer.parseInt(text[1]));
        localDateTime = localDateTime.minusHours(Integer.parseInt(text[2]));
        System.out.println(localDateTime);
    }
}