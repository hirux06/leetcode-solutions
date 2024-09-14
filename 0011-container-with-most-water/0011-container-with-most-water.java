class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;
        while(low < high){
            int h = Math.min(height[low],height[high]);
            int width = high - low;
            maxArea = Math.max(maxArea, h*width);
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }
}