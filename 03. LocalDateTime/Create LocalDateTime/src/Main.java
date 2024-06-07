import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      LocalDate date = LocalDate.of(1993, 8, 30);
      LocalTime time = LocalTime.of(23, 45);

      LocalDateTime myBirthDay = LocalDateTime.of(date, time);
      System.out.println(myBirthDay);
   }
}