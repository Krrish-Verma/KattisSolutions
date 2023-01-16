import java.io.*;
import java.util.*;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            int sum = 0;
            int c = sc.nextInt();

            if (c == -1) break;

            int[] nums = new int[c * 2];

            for (int i = 0; i < nums.length; i++){
                nums[i] = sc.nextInt();
            }


            for (int i = 0; i < nums.length; i += 2) {
                if (i == 0) sum += nums[i] * nums[i + 1];
                else sum += nums[i] * (nums[i + 1] - nums[i - 1]);
            }

            System.out.println(sum + " miles");
        }

    }
}



