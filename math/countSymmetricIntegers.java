class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        // Take every number from low to high, one by one
        for (int num = low; num <= high; num++) {

            // Convert the current number into String
            // Example: 1230 -> "1230"
            // This lets us access individual digits using charAt(i)
            String s = String.valueOf(num);

            // Symmetric numbers must have an even number of digits
            // 4 % 2 = 0 -> even
            // 6 % 2 = 0 -> even
            // 3 % 2 = 1 -> odd
            // If odd, skip this number
            if (s.length() % 2 != 0)
                continue;

            int sum1 = 0;
            int sum2 = 0;

            // MAIN LOGIC:
            // Find the sum of the first half of the digits
            // Example: "123456"
            // first half -> 1 + 2 + 3
            for (int i = 0; i < s.length() / 2; i++) {
                sum1 += s.charAt(i) - '0';
            }

            // Find the sum of the second half of the digits
            // Example: "123456"
            // second half -> 4 + 5 + 6
            for (int i = s.length() / 2; i < s.length(); i++) {
                sum2 += s.charAt(i) - '0';
            }

            // If both half sums are equal,
            // the number is symmetric
            if (sum1 == sum2)
                count++;
        }

        // Return the total number of symmetric integers
        return count;
    }
}