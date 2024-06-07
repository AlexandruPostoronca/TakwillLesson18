import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine().trim());
        LocalDateTime localDateTime1 = LocalDateTime.parse(scanner.nextLine().trim());

        LocalDate localDate = localDateTime.toLocalDate();
        LocalDate localDate2 = localDateTime1.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        LocalTime localTime1 = localDateTime1.toLocalTime();

        long hourOfData = localDate2.datesUntil(localDate).count();
        long secondsOfDay = minusToPlus(hourOfData * 24 * 3600);

        long secondsOfTime = minusToPlus(localTime.toSecondOfDay() - localTime1.toSecondOfDay());

        hourOfData=(secondsOfDay - secondsOfTime)/3600;
        System.out.println(minusToPlus(hourOfData));
    }

    private static long minusToPlus(long result) {
        if (result < 0) {
            result = result * -1;
        }
        return result;
    }
}
