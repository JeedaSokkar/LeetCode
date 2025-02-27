class Solution {
    public int generateKey(int num1, int num2, int num3) {
             String key="";
        for (int i = 0; i < 4; i++) {
           int max=Integer.MAX_VALUE;
           max=Math.min(max, num1%10);
           max=Math.min(max, num2%10);
           max=Math.min(max, num3%10);
         
            key=Integer.toString(max)+key;
            num1/=10;
            num2/=10;
            num3/=10;
            
       }return Integer.parseInt(key);
    }
}