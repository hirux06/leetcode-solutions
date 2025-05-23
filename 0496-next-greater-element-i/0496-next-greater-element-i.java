class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=n-1; i>=0; i--){
            while(s.size() > 0 && s.peek() <= nums2[i]){
                s.pop();
            }
            if(s.size() == 0){
                ans[i] = -1;
                map.put(nums2[i], ans[i]);
            }else {
                ans[i] = s.peek();
                map.put(nums2[i], ans[i]);
            }
            s.push(nums2[i]);
        }
        int ans2[] = new int[nums1.length];
        for(int i=0; i<ans2.length; i++){
            ans2[i] = map.get(nums1[i]);
        }
        return ans2;
    }
}