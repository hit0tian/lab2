import static org.junit.Assert.*;
// 使用等价类划分原则
public class SolutionTest {

    //我建议一个test写一个用例，一位乘写一个，多为乘写一个，
//测试乘法，多位乘和一位乘是否正常
// 例1："2"*"3"="6"
// 例2："123"*"456"="56088"
    @org.junit.Test
    public void testMultiply1() {
    Solution solution = new Solution();
    String ans = solution.multiply("2","3");
    assertEquals("6",ans);

    }

    @org.junit.Test
    public void testMultiply2() {
    Solution solution = new Solution();
    
    String ans = solution.multiply("123","456");
    assertEquals("56088",ans);

    }

//测试加法，无进位和有进位是否正常
// 例1："2"+"3"="5"
// 例2："9"+"2"="11"

    @org.junit.Test
    public void addStrings1() {
        Solution solution = new Solution();
        String ans = solution.addStrings("2","3");
        assertEquals("5",ans);
        
    }
    @org.junit.Test
    public void addStrings2() {
        Solution solution = new Solution();
        
        String ans = solution.addStrings("9","2");
        assertEquals("11",ans);
    }
}