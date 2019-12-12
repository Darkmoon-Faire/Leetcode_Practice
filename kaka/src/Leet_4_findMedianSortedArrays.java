import java.util.Arrays;

/**
 * @Author: yancheng Guo
 * @Date: 2019/12/12 10:44
 * @Description:
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 *
*/
public class Leet_4_findMedianSortedArrays {
    //合并数组 排序 取中位数
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int[] nums3 = new int[sum];
        System.arraycopy(nums1,0, nums3,0, nums1.length);
        System.arraycopy(nums2,0, nums3,nums1.length, nums2.length);
        Arrays.sort(nums3);
        if (sum % 2 != 0){
            return (double)nums3[(sum/2)];
        }
        return (double)(nums3[sum/2-1]+nums3[sum/2])/2;
    }

    public static void main(String[] args) {
        Leet_4_findMedianSortedArrays arrays = new Leet_4_findMedianSortedArrays();
        arrays.findMedianSortedArrays(new int[]{1,3},new int[]{2});
    }
}
