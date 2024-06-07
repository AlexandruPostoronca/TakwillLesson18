import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      LocalDate localDate = LocalDate.of(2017, 10, 11).withDayOfMonth(12);
      System.out.println(localDate);

      System.out.println(LocalDate.of(2017, 12, 10));

      System.out.println(LocalDate.of(2017, 1, 1).plusMonths(9).withDayOfMonth(12));

      System.out.println(LocalDate.of(2017, 10, 1).withDayOfYear(12));

      System.out.println(LocalDate.of(2018, 10, 12).minusYears(1));
   }
}