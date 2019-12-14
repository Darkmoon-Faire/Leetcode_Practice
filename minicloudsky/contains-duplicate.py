"""
给定一个整数数组，判断是否存在重复元素。

如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

示例 1:

输入: [1,2,3,1]
输出: true
示例 2:

输入: [1,2,3,4]
输出: false
示例 3:

输入: [1,1,1,3,3,4,3,2,4,2]
输出: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/contains-duplicate
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""


class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        # 1 比较长度,有重复的去重后list长度一定小于原list长度
        # return len(nums) != len(set(nums))
        # 2 排序，排序后存在前后相同的元素，肯定重复
        # data = self.bubble_sort(nums)
        # for num in range(len(data) - 1):
        #     if data[num] == data[num + 1]:
        #         return True
        # return False
        # 3 用dict,很容易想到，类似于hash,可惜超时了。。。
        dict = {}
        for i in nums:
            if i in dict.keys():
                if dict[i] >= 2:
                    return True
                else:
                    dict[i] += 1
            else:
                dict[i] = 1

    # 写个简单的插入排序吧 QAQ
    def bubble_sort(self, nums):
        for i in range(len(nums) - 1):
            for j in range(i+1, len(nums)):
                if nums[i] > nums[j]:
                    nums[i], nums[j] = nums[j], nums[i]
        return nums


if __name__ == '__main__':
    nums = [1, 2, 3, 1, 45, 4656, 1, 34, 454, ]

    # print(list(set(nums)))
    solution = Solution()
    print(solution.containsDuplicate(nums))
