class Solution {
    public int[] productExceptSelf(int[] arr) {

        int n = arr.length;

        // output[i] will finally contain:
        // product of elements before i × product of elements after i
        int[] output = new int[n];

        // prev stores the product of all elements to the LEFT of i
        int prev = 1;

        // Move from left to right
        for (int i = 0; i < n; i++) {

            // At this point, prev = product of everything before i
            output[i] = prev;

            // Add arr[i] to the running product
            // so it becomes part of the left product for the next index
            prev = prev * arr[i];
        }

        // suffix stores the product of all elements to the RIGHT of i
        int suffix = 1;

        // Move from right to left
        for (int i = n - 1; i >= 0; i--) {

            // output[i] already has the LEFT product
            // Multiply it by the RIGHT product
            output[i] = output[i] * suffix;

            // Add arr[i] to suffix
            // so it becomes part of the right product for the next index
            suffix = suffix * arr[i];
        }

        return output;
    }
}