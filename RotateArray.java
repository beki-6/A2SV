public class RotateArray{
    class Solution {
        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            int r = n - 1, l = 0;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
                l++;
            }
            r = k - 1;
            l = 0;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
                l++;
            }
            r = n - 1;
            l = k;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
                l++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        Solution.rotate(nums, 2);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        
    }
}