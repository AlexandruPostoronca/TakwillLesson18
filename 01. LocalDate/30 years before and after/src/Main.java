import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine().trim();

        LocalDate localDate=LocalDate.parse(string);
        System.out.println(localDate.minusYears(30));
        System.out.println(localDate.plusYears(30));
    }
}