import org.junit.*

import org.junit.Assert.*

/**
 * Created by guofeng on 2017/7/29.
 */
class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    @Throws(Exception::class)
    fun solution() {
        val input = "abcabcbb"
        val output = LongestSubstringWithoutRepeatingCharacters().solution(input)
        val expected = 3
        Assert.assertEquals(expected, output)
    }

}