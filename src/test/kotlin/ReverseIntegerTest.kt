import org.junit.*

import org.junit.Assert.*

/**
 * Created by guofeng on 2017/7/29.
 */
class ReverseIntegerTest {
    @Test
    @Throws(Exception::class)
    fun reverse() {
        val input = 123
        val output = ReverseInteger().reverse(input)
        val expected = 321
        Assert.assertEquals(expected, output)
    }

}