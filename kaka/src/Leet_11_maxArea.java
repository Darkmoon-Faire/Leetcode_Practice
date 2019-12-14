/**
 * @Author: yancheng Guo
 * @Date: 2019/12/13 14:20
 * @Description:
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
*/
public class Leet_11_maxArea {
        //双指针算法
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length-1;
            int maxArea = 0;
            while (left < right){
                int area = (right - left)*((height[left] > height[right])?height[right]:height[left]);
                maxArea = maxArea < area? area:maxArea;
                if (height[left] < height[right]){
                    left++;
                } else if (height[left] > height[right]) {
                    right--;
                }else {
                    left++;
                    right--;
                }
            }
            return maxArea;
        }

    public static void main(String[] args) {
        int[] ints = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Leet_11_maxArea leet = new Leet_11_maxArea();
        leet.maxArea(ints);
    }
}
