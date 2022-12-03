import java.util.*;
import java.io.*;

public class ANewAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        char[] characters = str.toCharArray();

        for(char c : characters ){
            sb.append((byte) c);
        }


        System.out.println(sb.toString());

    }
}
