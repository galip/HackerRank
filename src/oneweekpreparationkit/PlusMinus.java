package oneweekpreparationkit;

import java.util.ArrayList;
import java.util.List;
/**
 * @author galip
 * 01.03.2022
 */
public class PlusMinus {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        
        plusMinus(arr);
        
    }

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positiveCount++;
            } else if (arr.get(i) < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println(String.format("%.5f", (double) positiveCount / n));
        System.out.println(String.format("%.5f", (double) negativeCount / n));
        System.out.println(String.format("%.5f", (double) zeroCount / n));
    }
}
