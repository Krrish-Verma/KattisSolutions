
import java.util.*;

public class PokerHand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        ArrayList<String> cards = new ArrayList<>(Arrays.asList(str.split(" ")));

        Collections.sort(cards);
        int strength = 0;
        int failedAt = 0;
        int largestStrength = 1;
        String currentR = String.valueOf(cards.get(0).charAt(0));

        for (int i = 0; i < 5; i++) {
            for (int j = failedAt; j < 5; j++) {
                if (currentR.equals(String.valueOf(cards.get(j).charAt(0)))) strength++;
                else {
                    failedAt = j;
                    currentR = String.valueOf(cards.get(j).charAt(0));
                    if (strength > largestStrength) largestStrength = strength;
                }
            }
            strength = 0;
        }

        System.out.println(largestStrength);
    }
}