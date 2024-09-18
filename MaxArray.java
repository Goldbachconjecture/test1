public class MaxArray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, -2, 3, 5, -11};
        int[] nums2 = {1, -2, 3, -8, 5, 1};
        int[] nums3 = {1, -2, 3, -2, 5, 1};

        System.out.println(maxSubArray(nums1)); // 输出: 8
        System.out.println(maxSubArray(nums2)); // 输出: 6
        System.out.println(maxSubArray(nums3)); // 输出: 7
    }
}
