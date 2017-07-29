import org.junit.*

import org.junit.Assert.*

/**
 * Created by guofeng on 2017/7/28.
 */
class AddTwoNumbersTest {
    @Test
    @Throws(Exception::class)
    fun solution() {
        val node = ListNode(2)
        val node1 = ListNode(4)
        val node2 = ListNode(3)
        node.next = node1
        node1.next = node2

        val node3 = ListNode(5)
        val node4 = ListNode(6)
        val node5 = ListNode(4)
        node3.next = node4
        node4.next = node5

        val output = AddTwoNumbers().solution(node, node3)
        val node6 = ListNode(7)
        val node7 = ListNode(0)
        val node8 = ListNode(8)
        node6.next = node7
        node7.next = node8

        Assert.assertEquals(node6, output)
    }

}