class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double Max=Double.NEGATIVE_INFINITY;
       double res=0;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum=0;
            for (int j = i; j < k+i; j++) {
                sum+=nums[j];
                
            }
            if(sum>Max){
                Max=sum;
            }
        }
        res=Max/k;
        res = Math.round(res * 100000.0) / 100000.0;
     return  res; 
    }
}