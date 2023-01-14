import java.io.*;
import java.util.*;
//doesnt pass all the test cases.
public class Grading {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int F = sc.nextInt();

        int grade = sc.nextInt();

        if(grade == F) System.out.println("E");
        else if(grade >= A) System.out.println("A");
        else if( grade >= B) System.out.println("B");
        else if( grade >= C) System.out.println("C");
        else if( grade >= D) System.out.println("D");

        else System.out.println("F");


    }

}
