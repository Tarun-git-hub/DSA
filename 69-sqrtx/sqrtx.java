class Solution {
    public int mySqrt(int x) {
     if(x==0){
        return 0;
     }
     int s=1;
     int e=x;
     int result=1;
     while(s<=e){
        int mid=s+(e-s)/2;

        long sqrd = (long)mid*mid;
        if(sqrd==x){
          return mid;
        }
        else if(sqrd<x){
         result=mid;
         s=mid+1;
        }
        else{
            e=mid-1;
        }
     }
     return result;
    }
}