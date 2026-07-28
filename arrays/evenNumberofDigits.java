class Solution {
    public int findNumbers(int[] nums) {
        //int count=0;
        int answer =0;

for(int i=0;i<nums.length;i++){
int num = nums[i];
int count = 0;

while (num > 0) {
    num = num / 10;
    count++;
}
        
     // we don't need to use count variable we use answer to check how many numbers have even number of digits.   
    if(count%2==0)
    answer++;
        }
        return answer;
    }
}

// in this code we are counting the number of digits in each number of the array and checking if it is even or not. If it is even we increment the answer variable and finally return the answer.
