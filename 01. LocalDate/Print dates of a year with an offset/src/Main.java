import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scaner = new Scanner(System.in);
        String s = scaner.nextLine().trim();
        int numberOfAdd = scaner.nextInt();

        LocalDate localDate = LocalDate.parse(s);
        LocalDate curentData = LocalDate.parse(s);

        while (localDate.getYear()==curentData.getYear()) {
            System.out.println(curentData);
            curentData = curentData.plusDays(numberOfAdd);
        }
    }
}