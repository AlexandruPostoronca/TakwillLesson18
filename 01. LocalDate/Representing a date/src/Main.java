import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      System.out.println(LocalDate.ofYearDay(2018, 2));

      System.out.println(LocalDate.of(2018, 1, 1).withDayOfMonth(1));

      System.out.println(LocalDate.of(2018, 2, 1));

      System.out.println(LocalDate.of(2018, 1, 1).plusDays(1));

      System.out.println(LocalDate.of(2018, 3, 2).minusMonths(2));
   }
}