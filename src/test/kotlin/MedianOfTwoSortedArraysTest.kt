import org.junit.*

/**
 * Created by guofeng on 2017/7/29.
 */
class MedianOfTwoSortedArraysTest {
    @Test
    @Throws(Exception::class)
    fun solution() {
        val ints = intArrayOf(1, 2)
        val ints1 = intArrayOf(3, 4)
        val output = MedianOfTwoSortedArrays().solution(ints, ints1)
        val expected = 2.5
        Assert.assertEquals(expected, output, 0.0)
    }

}