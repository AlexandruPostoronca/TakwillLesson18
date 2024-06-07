import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String text = scanner.nextLine().trim();
        LocalDateTime localDateTime = LocalDateTime.parse(text);
        localDateTime = localDateTime.plusHours(11);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
    }
}