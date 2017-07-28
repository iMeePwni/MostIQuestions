import org.junit.*

/**
 * Created by guofeng on 2017/7/28.
 */
class TwoSumTest {
    @Test
    @Throws(Exception::class)
    fun twoSum() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val output = TwoSum().twoSum(nums, target)
        val expected = intArrayOf(0, 1)
        Assert.assertArrayEquals(expected, output)
    }

}