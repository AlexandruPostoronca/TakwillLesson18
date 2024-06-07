import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();
        long minutesAdd=Integer.parseInt(scanner.nextLine().trim());

        LocalDateTime localDateTime = LocalDateTime.parse(string);
        LocalDateTime newLocalDateTime = localDateTime.plusMinutes(minutesAdd);
        LocalDate localDate =localDateTime.toLocalDate();
        LocalDate newLocalDate=newLocalDateTime.toLocalDate();
        LocalDate ficsedLocalDate =LocalDate.of(newLocalDate.getYear(),01,01);
        long days=ficsedLocalDate.datesUntil(newLocalDate).count();
        days=days+1;
        System.out.println(newLocalDate.getYear()+" "+days+" "+newLocalDateTime.toLocalTime());
    }
}
