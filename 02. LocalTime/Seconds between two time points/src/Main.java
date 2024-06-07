import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        LocalTime localTime1 = LocalTime.parse(string1);
        LocalTime localTime2 = LocalTime.parse(string2);

        int newSeconds1 = localTime1.toSecondOfDay();
        int newSeconds2 = localTime2.toSecondOfDay();

        if(newSeconds1-newSeconds2<0){
            System.out.println((newSeconds1-newSeconds2)*-1);
        }else {
            System.out.println(newSeconds1-newSeconds2);
        }
    }
}