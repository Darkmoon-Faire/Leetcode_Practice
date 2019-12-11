import java.util.HashSet;
import java.util.Set;


/**
 * @Author: yancheng Guo
 * @Date: 2019/12/11 21:15
 * @Description:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
*/
//快慢指针
public class Leet_3_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int begin = 0, end = 0, result = 0;
        int len = s.length();
        Set set = new HashSet();
        while (end < len && begin < len){
            if (!set.contains(s.charAt(end))){
                //不在集合中就添加 并与最大差值比较 后指针后移
                set.add(s.charAt(end++));
                result = Math.max(result, end - begin);
            }else {
                //在集合中删除前指针 前指针后移
                set.remove(s.charAt(begin++));
            }
        }
        return result;
    }
}
