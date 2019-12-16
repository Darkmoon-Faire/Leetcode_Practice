import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yancheng Guo
 * @Date: 2019/12/16 17:22
 * @Description:  三数之和
 *给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
*/
/*
    [-4,-1,-1,0,1,2]

*/
public class Leet_12_intToRoman {


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length - 1;
            //循环过的根不再循环
            if (temp.contains(nums[i]))continue;
            temp.add(nums[i]);
            while (left < right){
                int addRes = nums[i] + nums[left] + nums[right];
                if (addRes == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //[-2,0,0,2,2]
                    while (left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if (addRes < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leet_12_intToRoman leet = new Leet_12_intToRoman();
        List<List<Integer>> lists = leet.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(lists);
    }
}
