class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int lp = 0;
        int hp = numbers.length -1;
        while(lp < hp) {
            if(numbers[lp] + numbers[hp] == target){
                ans[0] = lp+1;
                ans[1] = hp+1;
                break;
            }else if(numbers[lp] + numbers[hp] < target){
                lp++;
            }else {
                hp--;
            }

            
        }
        return ans;
    }
}