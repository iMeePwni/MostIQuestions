/**
 * Created by guofeng on 2017/7/29.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            // 判断是否越界
            if ((newResult - tail) / 10 != result)
                return 0;
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
