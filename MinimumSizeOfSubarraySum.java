public class MinimumSizeOfSubarraySum {
    class Solution{
        public static int minSubArrayLen(int[] nums, int target) {
            int n = nums.length;
            int l = 0, sum = 0, min = n + 1;
            for(int i = 0; i < n; i++){
                sum += nums[i];
                while(sum >= target){
                    min = Math.min(min, i-l+1);
                    sum -= nums[l];
                    l++;
                }
            }
            return ( min == n + 1 ? 0 : min );
        }
    }
}
