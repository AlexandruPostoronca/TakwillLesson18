import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String text = scanner.nextLine().trim();
        LocalDateTime localDateTime = LocalDateTime.parse(text);
//        LocalDateTime localDateTime1 = LocalDateTime.of(localDateTime.getYear(), 01, 01, 00, 0);
        LocalDate localDate1 = LocalDate.of(localDateTime.getYear(), 01, 01);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        long numbersOfDay = localDate1.datesUntil(localDate).count();
        long hours = numbersOfDay*24 + localTime.getHour();
        System.out.println(hours);

    }
}