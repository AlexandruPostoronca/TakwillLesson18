import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // write your code here
        LocalDateTime localTime=LocalDateTime.of(compare(dateTime1.getYear(),dateTime2.getYear()),
                compare(dateTime1.getMonthValue(),dateTime2.getMonthValue()),compare(dateTime1.getDayOfMonth(),dateTime2.getDayOfMonth()),
                compare(dateTime1.getHour(),dateTime2.getHour()),compare(dateTime1.getMinute(),dateTime2.getMinute()),
                compare(dateTime1.getSecond(),dateTime2.getSecond()));

        return localTime;
    }

    private static int compare(int dateTime1, int dateTime2) {
        return dateTime1 >= dateTime2 ? dateTime1 : dateTime2;

    }

    /* Do not change the code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}
