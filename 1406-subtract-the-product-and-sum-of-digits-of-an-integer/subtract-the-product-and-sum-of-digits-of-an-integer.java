class Solution {
    public int subtractProductAndSum(int n) {
         int sum=0, r=0;
    
      int x=n;
      int p=1;
       while(x != 0){
           r=x%10;
           sum+=r;
           p*=r;
           x=x/10;
       }
   
       
       return p-sum;
    }
}