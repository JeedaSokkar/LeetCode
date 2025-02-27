class Solution {
public:
    bool isPalindrome(int x) {
       if(x == 0){
         return true;
     } 
     if(x<0 || x%10 == 0){
         return false;
     }
     int n=x;
     double s=0;
     while(n != 0){
         int l=n%10;
         s=s*10+l;
         n=n/10;
     }
     if(s == x){
         return true;
     }
     else{
         return false;
     }  
    }
};