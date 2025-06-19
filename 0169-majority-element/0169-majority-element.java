class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int ele = -1;
        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                ele = arr[i];
            }else if(arr[i] == ele){
                count++;
            }else {
                count--;
            }
        }

        return ele;
    }
}