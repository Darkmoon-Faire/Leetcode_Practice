/**
 * @Author: yancheng Guo
 * @Date: 2019/12/12 22:20
 * @Description:
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
*/
public class Leet_7_isPalindrome {
    public boolean isPalindrome(int x) {
        String re = new StringBuilder(String.valueOf(x)).reverse().toString();
        return  re.equals(String.valueOf(x));
    }

    public static void main(String[] args) {
        Leet_7_isPalindrome leet = new Leet_7_isPalindrome();
        leet.isPalindrome(131);
    }
}
/*
    public boolean isPalindrome(int x) {
            int res = 0;
            while (x != 0){
                res = res * 10 + x % 10;
                x /= 10;
            }
            return res == x;
    }

*/