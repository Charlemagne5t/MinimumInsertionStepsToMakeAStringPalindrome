import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minInsertionsTest1() {
        String s = "zzazz";
        int output = 0;
        Assert.assertEquals(output, new Solution().minInsertions(s));
    }

    @Test
    public void minInsertionsTest2() {
        String s = "mbadm";
        int output = 2;
        Assert.assertEquals(output, new Solution().minInsertions(s));
    }

    @Test
    public void minInsertionsTest3() {
        String s = "leetcode";
        int output = 5;
        Assert.assertEquals(output, new Solution().minInsertions(s));
    }
}
