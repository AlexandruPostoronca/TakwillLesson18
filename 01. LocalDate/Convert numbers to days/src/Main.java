import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] day = new int[3];
        int s = scanner.nextInt();
        for (int i = 0; i < day.length; i++) {
            day[i] = scanner.nextInt();
        }
        for (int deys : day) {
            LocalDate localDate = LocalDate.ofYearDay(s, deys);
            System.out.println(localDate);

        }
    }
}