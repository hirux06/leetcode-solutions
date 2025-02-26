class Solution {
    public void returnSubSets(ArrayList<Integer> arr, ArrayList<Integer> ans, List<List<Integer>> res, int i) {
        // Base case: 
        if (i == arr.size()) {
            res.add(new ArrayList<>(ans)); 
            return;
        }

        // Include case
        ans.add(arr.get(i));
        returnSubSets(arr, ans, res, i + 1);

        // Exclude case
        ans.remove(ans.size() - 1);
        int idx = i+1;
        while(idx < arr.size() && arr.get(idx) == arr.get(idx-1)) idx++;
        returnSubSets(arr, ans, res, idx);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>(); 
        for (int num : nums) {
            arr.add(num);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        returnSubSets(arr, ans, res, 0);
        return res;
    }
}