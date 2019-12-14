"""
https://leetcode-cn.com/problems/keyboard-row/
给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
示例：

输入: ["Hello", "Alaska", "Dad", "Peace"]
输出: ["Alaska", "Dad"]
 
注意：
你可以重复使用键盘上同一字符。
你可以假设输入的字符串将只包含字母。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/keyboard-row
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""


class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        result = []
        words = [self.switchcase(word) for word in words]
        for word in words:
            if self.identify(word):
                result.append(word)
        return result

    def switchcase(self, words):
        target = ''
        for character in words:
            if character.islower():
                target += character
            else:
                target += chr(ord(character) + 32)
        return target

    def identify(self, word):
        firstline = ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p']
        secondline = ['a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l']
        thridline = ['z', 'x', 'c', 'v', 'b', 'n', 'm']
        print((set(list(word)) | set(firstline)),word)
        if (set(list(word)) | set(firstline)) == firstline or (set(list(word)) | set(secondline)) == secondline or (
                set(list(word)) | set(thridline)) == thridline:
            return True
        else:
            return False


if __name__ == '__main__':
    # words = ["Hello", "Alaska", "Dad", "Peace"]
    # solve = Solution().findWords(words)
    # print(solve)
    s = 'abcde'
