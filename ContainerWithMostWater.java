public class ContainerWithMostWater{
    class Solution {
        public int maxArea(int[] height) {
            int n = height.length;
            int area = 0, f = 0, l = n-1;
            while(f < l){
                area = Math.max(Math.min(height[f], height[l]) * Math.abs(f - l), area);
                if(height[f] < height[l]) f++;
                else l--;
            }
            return area;
        }
    }
}