import java.util.*;

class Solution {
    public void permutate(ArrayList<Integer> arr, List<List<Integer>> ans, int idx) {
        if (idx == arr.size()) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for (int i = idx; i < arr.size(); i++) {
            // Swapping elements
            Collections.swap(arr, i, idx);
            
            // Recursively generate permutations
            permutate(arr, ans, idx + 1);
            
            // Backtrack (swap back to restore original state)
            Collections.swap(arr, i, idx);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();
        permutate(arr, ans, 0);
        return ans;
    }
}
