class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int n=1; n<=numRows; n++){
            ArrayList<Integer> tempList = new ArrayList<>();
            int anss = 1;
            tempList.add(anss);
            for(int i=1; i<n; i++){
                anss = anss * (n-i) / i;
                tempList.add(anss);
            }

            ans.add(tempList);
        }
        return ans;
    }
}