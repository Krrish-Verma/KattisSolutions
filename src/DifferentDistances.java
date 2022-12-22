
import java.util.*;

public class DifferentDistances {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        while (true) {

            double x1 = sc.nextDouble();
            if(x1 == 0) break;

            double y1 =  sc.nextDouble();
            double x2 =  sc.nextDouble();
            double y2 =  sc.nextDouble();
            double p =  sc.nextDouble();



            System.out.println(Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1/p));

        }


    }

}
