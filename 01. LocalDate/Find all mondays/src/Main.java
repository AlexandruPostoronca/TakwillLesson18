import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), 01);
        LocalDate newLocalMount = localDate;

        while (localDate.getMonth().equals(newLocalMount.getMonth())) {
            System.out.println(localDate.getDayOfWeek());
            if (localDate.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                System.out.println();
            }
            localDate=localDate.plusDays(1);
        }
    }
}