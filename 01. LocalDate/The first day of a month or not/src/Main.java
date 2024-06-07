import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        LocalDate localDate = LocalDate.ofYearDay(scanner.nextInt(), scanner.nextInt());
        if(localDate.getDayOfMonth()==01){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}