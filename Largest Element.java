class Solution {
    public int largestElement(int[] nums) {
       int c = nums.lenght;
       int max=0;
       for(int i=0;i<c;i++){
        if(nums[i]>max){
            max=nums[i];
        }
       }

       return max;
    }
}
