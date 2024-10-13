import static org.junit.Assert.*;
// 使用等价类划分原则
public class SolutionTest {

//测试乘法，多位乘和一位乘是否正常
// 例1："2"*"3"="6"
// 例2："123"*"456"="56088"
    @org.junit.Test
    public void testMultiply() {
    Solution solution = new Solution();
    String ans = solution.multiply("2","3");
    assertEquals("6",ans);
     ans = solution.multiply("123","456");
    assertEquals("56088",ans);

    }

//测试加法，无进位和有进位是否正常
// 例1："2"+"3"="5"
// 例2："9"+"2"="11"

    @org.junit.Test
    public void addStrings() {
        Solution solution = new Solution();
        String ans = solution.addStrings("2","3");
        assertEquals("5",ans);
        ans = solution.addStrings("9","2");
        assertEquals("11",ans);
    }
}