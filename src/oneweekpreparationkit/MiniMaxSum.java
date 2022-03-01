package oneweekpreparationkit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author galip
 * 01.03.2022
 *
 */
public class MiniMaxSum {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        miniMaxSum(arr);
        
        List<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(7);
        arr2.add(69);
        arr2.add(2);
        arr2.add(221);
        arr2.add(8974);
        miniMaxSum(arr2);
    }

    public static void miniMaxSum(List<Integer> arr) {
        long min = 9999999999999L;
        long max = 0;
        long sum = 0;
        for(int i = 0; i < arr.size(); i ++) {
            for(int j = 0; j < arr.size(); j ++) {
                if(i != j) {
                    sum = sum + new Long(arr.get(j));
                }
            }
            if(max < sum) {
                max = sum;
            }
            if(min > sum) {
                min = sum;
            }
            sum = 0;
        }
        System.out.println(min + " " + max);
    }
}