class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int mostWater = 0;

        while(l < r){
            
            int width = r - l;
            int ht = Math.min(height[l], height[r]);
            int currWater = width * ht;
            mostWater = Math.max(currWater, mostWater);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return mostWater;
    }
}