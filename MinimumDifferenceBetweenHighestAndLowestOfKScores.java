import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    class Solution{
        public int minimumDifference(int[] nums, int k) {
            int l = 0, r = k - 1, n = nums.length;
            Arrays.sort(nums);
            int min = nums[r] - nums[l];
            while(r <= n-1){
                min = Math.min(min, nums[r] - nums[l]);
                l++;
                r++;
            }
            return min;
        }
    }
}
