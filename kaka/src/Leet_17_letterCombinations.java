import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yancheng Guo
 * @Date: 2019/12/17 11:21
 * @Description:
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 示例:
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 *
*/
class Leet_17_letterCombinations {
    private List<String> result = new ArrayList<>();

    private char[][] chars = new char[10][];

    // 输入的数字
    private int[] numbers;

    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits)) {
            return result;
        }

        chars[2] = new char[]{'a', 'b', 'c'};
        chars[3] = new char[]{'d', 'e', 'f'};
        chars[4] = new char[]{'g', 'h', 'i'};
        chars[5] = new char[]{'j', 'k', 'l'};
        chars[6] = new char[]{'m', 'n', 'o'};
        chars[7] = new char[]{'p', 'q', 'r', 's'};
        chars[8] = new char[]{'t', 'u', 'v'};
        chars[9] = new char[]{'w', 'x', 'y', 'z'};

        // 初始化输入
        char[] input = digits.toCharArray();
        numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            //48为字符'0'对应的ASCII值
            numbers[i] = input[i] - 48;
        }

        // 开始深度搜索
        for (int i = 0; i < chars[numbers[0]].length; i++) {
            dfs(chars[numbers[0]][i] + "", 1);
        }
        return result;
    }
    //dfs
    private void dfs(String preStr, int level) {
        if (level == numbers.length) {
            result.add(preStr);
        } else {
            char[] chars = this.chars[numbers[level]];
            for (char ch : chars) {
                dfs(preStr + ch, level + 1);
            }
        }
    }
}

