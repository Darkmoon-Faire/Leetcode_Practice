import java.util.Arrays;

/**
 * @Author: yancheng Guo
 * @Date: 2019/12/16 20:54
 * @Description:
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 * [-4,-1,1,2]
*/
public class Leet_16_threeSumClosest {
        //双指针法
        public int threeSumClosest(int[] nums, int target) {
            int res = nums[0] + nums[1] + nums[2];
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++){
                int left = i + 1;
                int right = nums.length - 1;
                //过滤i重复的情况
                if (left < right && nums[i] == nums[i+1])i++;
                while (left < right){
                    int sum = nums[left] + nums[right] + nums[i];
                    int temp = Math.abs(sum - target);
                    if (Math.abs(res - target) > temp){
                        res = sum;
                    }
                    if (sum < target){
                        //过滤左指针重复
                        if(nums[left] == nums[left+1])left++;
                        left++;
                    }else{
                        //过滤右指针重复
                        if (nums[right] == nums[right-1])right--;
                        right--;
                    }
                }
            }
            return res;
        }

    public static void main(String[] args) {
        Leet_16_threeSumClosest leet = new Leet_16_threeSumClosest();
        leet.threeSumClosest(new int[]{1,1,1,0}, -100);
    }
}
