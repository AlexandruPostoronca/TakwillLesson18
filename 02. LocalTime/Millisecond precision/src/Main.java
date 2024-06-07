import java.time.LocalTime;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      long millis = 1000;
      LocalTime.ofSecondOfDay(millis * 1000);

      LocalTime.ofSecondOfDay(millis / 1000);

      LocalTime.ofNanoOfDay(millis * 1000000);

      LocalTime.ofNanoOfDay(millis / 1000000);
   }
}