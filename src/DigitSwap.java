
import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int lastDigit = num % 10;
        int firstDigit = num/10;

        System.out.println(lastDigit + "" + firstDigit);




    }
}
