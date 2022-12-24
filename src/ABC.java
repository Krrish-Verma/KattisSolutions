import java.io.*;
import java.util.*;

public class ABC {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] inNums = sc.nextLine().split(" ");

        char[] order = sc.nextLine().toCharArray();

        int[] nums = new int[inNums.length];


        for(int i = 0; i < inNums.length; i++){
            nums[i] = Integer.parseInt(inNums[i]);
        }

        Arrays.sort(nums);

        System.out.print(nums[order[0] - 'A'] + " ");
        System.out.print(nums[order[1] - 'A'] + " ");
        System.out.print(nums[order[2] - 'A']);
    }

}
