import org.junit.*

import org.junit.Assert.*

/**
 * Created by guofeng on 2017/7/29.
 */
class LongestCommonPrefixTest {
    @Test
    @Throws(Exception::class)
    fun solution() {
        val input = arrayOf("abc", "aaa", "abc")
        val output = LongestCommonPrefix().solution(input)
        val expected = "a"
        Assert.assertEquals(expected, output)
    }

}