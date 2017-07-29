import java.util.Arrays;

/**
 * Created by guofeng on 2017/7/29.
 */
public class MedianOfTwoSortedArrays {
    public double solution(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] num = Arrays.copyOf(nums1, length1 + length2);
        System.arraycopy(nums2, 0, num, length1, length2);
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int i = (length1 + length2) / 2 - 1; // pivot
        if ((length1 + length2) % 2 == 1) { // 奇数
            return num[i];
        } else { // 偶数
            return (num[i] + num[i + 1]) / 2.0;
        }
    }
}
