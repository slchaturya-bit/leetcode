class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; (long)i * i <= num; i++) {
    if ((long)i * i == num) {
        return true;
    }
}
return false;
        
    }
}
//long is used to check that it does not overflow after maximum number so that is get stpped
// for loop is used to repeat the iteration for the value of i to check whther is becomes a perfect square