import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), n = sc.nextInt();
        int y = x;

        for(int i = 0; i < n; i++){
            y -= sc.nextInt();
            y += x;
        }

        System.out.println(y);

    }
}
