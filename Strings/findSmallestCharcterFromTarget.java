class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low =0;
        int high = letters.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(letters[mid]<=target){
                //ans = mid;
                low = mid+1;
            }
            
            else
            high = mid-1;
        }
        // After the loop, low points to the first letter
        // that is greater than target.
        //
        // If low == letters.length, it means we reached
        // beyond the last letter.
        // In that case, we need to wrap around to index 0.
        //
        // Example:
        // letters = [c, f, j], target = j
        // low = 3
        // 3 % 3 = 0
        // letters[0] = c
        return letters[low % letters.length];
        
    }
}