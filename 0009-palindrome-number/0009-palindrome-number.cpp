class Solution {
public:
    bool isPalindrome(int x) {
        long j =0;
        for(long i =x;i>0;i=i/10)
        {
           long g = i%10;
           j=j*10+g;
        }
        if(j==x){
             return true;
        }
        else{
            return false;
        }
    }
};