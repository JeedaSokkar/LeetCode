class Solution {
    public int pivotIndex(int[] nums) {
             int totalSum=0;
     int LeftSum=0;
     for(int i=0 ; i<nums.length;i++){
         totalSum+=nums[i];
     }
         for (int i = 0; i < nums.length; i++) {
             if(totalSum-LeftSum-nums[i] == LeftSum){
                 return i;
             }
             LeftSum+=nums[i];
         }
         return -1;
    
    }
}