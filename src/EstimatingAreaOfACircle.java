import java.util.Locale;
import java.util.Scanner;

public class EstimatingAreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double r = sc.nextDouble(), m = sc.nextDouble(), c = sc.nextDouble();

        while(true)  {

            if(r == 0 && m == 0 && c == 0)
                break;

            double radius = Math.PI * Math.pow(r, 2);

            double marked = Math.pow(2 * r, 2);

            double estimated = m/c;

            System.out.println(radius + " " + marked + " " + estimated);
        }




    }
}
