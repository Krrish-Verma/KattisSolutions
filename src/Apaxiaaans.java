import java.util.Scanner;
public class Apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String emp = "";

        for (int i = 0; i < str.length(); i++) {
            if ((i == str.length() - 1) || str.charAt(i) != str.charAt(i + 1)) {
                emp += str.charAt(i);
            }


            System.out.println(emp);
        }

    }

}