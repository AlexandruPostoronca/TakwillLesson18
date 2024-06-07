import java.time.LocalTime;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      System.out.println(LocalTime.of(23, 30, 50).minusSeconds(30));

      System.out.println(LocalTime.of(11, 50));

      System.out.println(LocalTime.of(23, 50, 0).plusHours(24));

      System.out.println(LocalTime.of(23, 50, 30).withSecond(0));

      System.out.println(LocalTime.of(23, 50));
   }
}