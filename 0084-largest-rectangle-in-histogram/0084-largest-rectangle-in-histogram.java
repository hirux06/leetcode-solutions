class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int n= heights.length;
        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            while(s.size() >0 && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            left[i] = s.size() == 0 ? -1 : s.peek();
            s.push(i);
        }

        while(!s.isEmpty()){
            s.pop();
        }

        for(int i=n-1; i>=0; i--){
            while(s.size() >0 && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            right[i] = s.size() == 0 ? n : s.peek();
            s.push(i);
        }



        for(int i=0; i<n; i++){
            int currArea = heights[i] * (right[i] - left[i] - 1);
            ans = Math.max(ans, currArea);
        }
        return ans;
    }
}