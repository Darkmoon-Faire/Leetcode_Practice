"""
https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/

给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。

另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。

你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。

请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
"""


class Solution:
    def oddCells(self, n: int, m: int, indices) -> int:
        array = [[0]*m for i in range(n)]
        for _list in indices:
            for i in array:
                i[_list[1]] += 1
            for i in range(m):
                array[_list[0]][i] += 1
            print(array)
        return len([j for i in array for j in i if j % 2 == 1])


if __name__ == '__main__':
    n = 2
    m = 3
    indices = [[0, 1], [1, 1]]
    answer = Solution().oddCells(n, m, indices)
    print(answer)
