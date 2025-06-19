class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return new int[]{i, map.get(rem)};
            }

            map.put(arr[i], i);
        }
        return new int[]{};
    }
}