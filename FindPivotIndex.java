public class FindPivotIndex {
    class Solution {
        public int pivotIndex(int[] nums) {
            int lsum = 0, rsum = 0, n= nums.length, sum = 0;
            for(int i = 0; i < n; i++){
                sum += nums[i];
            }
            for(int i = 0; i < n; i++){
                rsum = sum - nums[i] - lsum;
                if(lsum == rsum) return i;
                lsum += nums[i];
            }
            return -1;
        }
    }
}
