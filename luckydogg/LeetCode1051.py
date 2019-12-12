"""
学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。

请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/height-checker
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""


class Solution:
    def heightChecker(self, heights) -> int:
        new_list = sorted(heights)
        num = 0
        for i in range(len(new_list)):
            if new_list[i] != heights[i]:
                num += 1
        return num


if __name__ == "__main__":
    l = [1,1,4,2,1,3]
    answer = Solution().heightChecker(l)
    print(answer)

