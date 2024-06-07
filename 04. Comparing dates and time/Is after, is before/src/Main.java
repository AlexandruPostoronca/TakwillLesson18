import java.time.LocalTime;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      LocalTime time = LocalTime.of(22, 10);
      System.out.println(time.isAfter(LocalTime.of(22, 0, 10)));
      System.out.println(time.isAfter(LocalTime.of(22, 10, 10)));
      System.out.println(time.isBefore(LocalTime.of(22, 10)));
      System.out.println(time.isBefore(LocalTime.of(22, 10, 10)));
   }
}