class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
     int []arr2=new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
         sum+=nums[i];
         arr2[i]=sum;
     }
        return arr2; 
    }
}
/*
int sum = 0;
for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
    nums[i] = sum;
}
return nums;

*/ 