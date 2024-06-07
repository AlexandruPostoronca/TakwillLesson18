import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
String[] text = scanner.nextLine().split("\\s+");
        LocalDate x = LocalDate.parse(text[0]);
        LocalDate m = LocalDate.parse(text[1]);
        LocalDate n = LocalDate.parse(text[2]);
        if (n.isBefore(m)) {
            LocalDate newM = n;
            n = m;
            m = newM;
        }

        boolean conditionNumberOn = m.isEqual(n) ? true : false;
        boolean conditionNumberTow = x.isAfter(m) && (x).isBefore(n)? true : false;
        System.out.println(conditionNumberOn || conditionNumberTow ? true : false);
    }
}