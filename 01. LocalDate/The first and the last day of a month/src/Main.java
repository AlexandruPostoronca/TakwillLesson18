import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine().trim());
        int mount = Integer.parseInt(scanner.nextLine().trim());

            LocalDate localDate = LocalDate.of(year, mount, 01);
            int newLocalDate = localDate.lengthOfMonth();
            System.out.println(localDate + " " +localDate.plusDays(newLocalDate-1));


    }
}