import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      System.out.println(LocalDateTime.of(LocalDate.of(2020, 1, 1), LocalTime.MIDNIGHT).minusSeconds(1));
      System.out.println(LocalDateTime.of(2020, 1, 1, 0, 1, 1).minusSeconds(61));
      System.out.println(LocalDateTime.parse("2017-12-31T23:59").withYear(2019));
      System.out.println(LocalDateTime.of(LocalDate.of(2019, 12, 31), LocalTime.MAX));
      System.out.println(LocalDateTime.of(2020, 12, 31, 23, 59, 59).minusYears(1));
      System.out.println(LocalDateTime.parse("2019-12-31T23:59").withSecond(59));

   }
}