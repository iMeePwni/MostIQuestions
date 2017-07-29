/**
 * Created by guofeng on 2017/7/29.
 */
public class LongestCommonPrefix {

    public String solution(String[] strs) {
        int length = strs.length;
        if (length < 1)
            return "";
        String common = strs[0];
        int position = 0;
        boolean isChangePosition = false;
        for (int i = 0; i < length; i++) {
            String str = strs[i];
            int len = Math.min(str.length(), common.length());
            for (int j = 0; j < len; j++) {
                if (common.charAt(j) != str.charAt(j)) {
                    common = common.substring(0, position);
                    break;
                } else {
                    position = j + 1;
                    isChangePosition = true;
                }
            }
        }
        if (isChangePosition)
            return common.substring(0, position);
        else
            return "";
    }
}
