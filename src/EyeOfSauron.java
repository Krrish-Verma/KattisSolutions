import java.util.*;

public class EyeOfSauron {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = (str.length()/2)-1;

        if (str.length() % 2 != 0) System.out.println("fix");

        else if (str.split("")[n].equals("(")) System.out.println("correct");

        else System.out.println("fix");
    }
}
