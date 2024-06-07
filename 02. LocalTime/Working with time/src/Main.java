import java.time.LocalTime;

public class Main {
   public static void main(String[] args) {
      // Write your solution here

      System.out.println(LocalTime.parse("23:50").plusMinutes(20));

      System.out.println(LocalTime.parse("01:10:10").withSecond(0).minusHours(1));

      System.out.println(LocalTime.parse("00:05").withMinute(5));

      System.out.println(LocalTime.parse("00:20:15").minusSeconds(615));

      System.out.println(LocalTime.parse("05:05").plusHours(5).plusMinutes(5));
   }
}