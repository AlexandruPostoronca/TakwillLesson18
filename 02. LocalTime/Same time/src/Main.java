import java.time.LocalTime;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      System.out.println(LocalTime.of(22, 30).plusSeconds(15).withMinute(20));
   }
}