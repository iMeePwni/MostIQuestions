import java.util.*;

/**
 * Created by guofeng on 2017/7/28.
 */
public class AddTwoNumbers {
    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        List<ListNode> list = new ArrayList<>();
        int a = 0;
        while (temp1 != null) {
            ListNode temp = new ListNode(0, null);
            int i = temp1.getInt() + temp2.getInt() + a;
            a = i / 10;
            temp.setInt(i - a * 10);
            list.add(temp);
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }
        int size = list.size();
        for (int i = 0; i < size - 1; i++)
            list.get(i).setNext(list.get(i + 1));
        return list.get(0);
    }

}
