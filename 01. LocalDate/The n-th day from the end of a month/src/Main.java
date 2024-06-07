import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        int newLocalDate = localDate.lengthOfMonth() - localDate.getDayOfMonth() + 1;
        System.out.println(localDate.withDayOfMonth(newLocalDate));
    }
}