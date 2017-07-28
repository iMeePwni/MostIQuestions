import java.util.*;

/**
 * Created by guofeng on 2017/7/28.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> temp = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            int key = target - num;
            if (temp.containsKey(key)){
                output[0] = temp.get(key);
                output[1] = i;
                break;
            } else {
                temp.put(num, i);
            }
        }
        return output;
    }
}
