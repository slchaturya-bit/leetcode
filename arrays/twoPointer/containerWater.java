class Solution {
    public int maxArea(int[] height) {

        // Two pointers:
        // left starts from beginning
        // right starts from end
        int left = 0;
        int right = height.length - 1;

        // Store the maximum area found so far
        int max = 0;

        // Continue until both pointers meet
        while (left < right) {

            // Width = distance between the two lines
            // Height = smaller of the two lines
            // because water cannot be higher than the shorter line
            int area = (right - left) *
                       Math.min(height[left], height[right]);

            // Keep the largest area found
            if (area > max) {
                max = area;
            }

            // Move the pointer with the smaller height
            // because the smaller height is limiting the water
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum amount of water
        return max;
    }
}