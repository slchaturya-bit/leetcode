/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //approach 1
       // first i need to find version of each in the given set later use for loop then increase using this i can find the output
        //for (int i = 1; i <= n; i++) {
   // if (isBadVersion(i)) {
       // return i;
       // this causes out of bound as it follows linear search it is O(n)


      int low=1;
      int high = n;
       while(low<high){
       // boolean isBadVersion(int n);
        int mid = low+(high-low)/2;
        if (isBadVersion(mid))
    high = mid;
else
    low = mid+1;
       }
       return low;
    

    }
}