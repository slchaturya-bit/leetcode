class Solution {
    public boolean isUgly(int n) {

        if (n <= 0)
    return false;
// in this the edge case is if the number is less than or equal to 0 then it is not ugly number so return false

    while (n % 2 == 0)
    n /= 2;
    

    while (n % 3 == 0)
    n /= 3;
    

    while (n % 5 == 0)
    n /= 5;

    // we use while loop to divide the number by 2,3,5 until it is no longer divisible by them. If the final result is 1 then it is an ugly number otherwise not.




    //we can also use the approach of checking if the number is equal to 1 or not. If it is equal to 1 then it is an ugly number otherwise not.

    

    return n==1;
    }
}