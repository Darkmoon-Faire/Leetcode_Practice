/**
 * @Author: yancheng Guo
 * @Date: 2019/12/13 17:05
 * @Description:
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
*/
public class Leet_14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)return "";
        String ref = strs[0];
        for (String str : strs){
            while (!str.startsWith(ref)){
                if (str.length() == 0)return "";
                ref = ref.substring(0, ref.length()-1);
            }
        }
        return ref;
    }

    public static void main(String[] args) {
        Leet_14_longestCommonPrefix leet = new Leet_14_longestCommonPrefix();
        leet.longestCommonPrefix(new String[]{"aa","a"});
    }
}
