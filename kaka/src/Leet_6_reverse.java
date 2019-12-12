/**
 * @Author: yancheng Guo
 * @Date: 2019/12/12 21:26
 * @Description:
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
*/

public class Leet_6_reverse {
    public int reverse(int x) {
        int res = 0;
        String a = x+"";
        int i = a.length()-1;
        int flag = 0;
        if ("-".equals(a.charAt(0)+"")){
            flag = 1;
            i -= 1;
        }
        x = Math.abs(x);
        while (x != 0){
            res += x%10 * Math.pow(10,i);
            i--;
            x /= 10;
        }
        if (res >= 2147483647 || res <= -2147483648){
            return 0;
        }
        if (flag == 1)return -res;
        return res;
    }

    public static void main(String[] args) {
        Leet_6_reverse re = new Leet_6_reverse();
        int i = re.reverse(1534236469);
        System.out.println(i);
    }
}

/*
    想复杂了，大佬的方法
    class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0){
            res = res*10 + x%10;
            x /= 10;
        }
        if((int)res != res) return 0;//关键之处，如何处理溢出！
        return (int)res;
    }
}


*/