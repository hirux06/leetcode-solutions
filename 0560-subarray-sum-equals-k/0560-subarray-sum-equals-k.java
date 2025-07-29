class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0, count =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == k){
                count++;
            }
            int rem = sum - k;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}