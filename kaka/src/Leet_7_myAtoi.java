/**
 * @Author: yancheng Guo
 * @Date: 2019/12/12 22:20
 * @Description:
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
*/
public class Leet_7_myAtoi {
    public boolean isPalindrome(int x) {
        String re = new StringBuilder(String.valueOf(x)).reverse().toString();
        return  re.equals(String.valueOf(x));
    }
}
