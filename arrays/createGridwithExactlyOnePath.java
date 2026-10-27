class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {

                // i == 0 means the first row.
                // We make the entire first row '.' so the path can move right.

                // j == n - 1 means the last column.
                // We make the entire last column '.' so the path can move down
                // and reach the destination.

                // All the remaining cells are '#', which block other paths.
                if (i == 0 || j == n - 1) {
                    sb.append('.');
                } else {
                    sb.append('#');
                }
            }

            // StringBuilder is used to build each row character by character.
            // sb.toString() converts the completed row into a String.
            // We store that String in the String array at index i.
            ans[i] = sb.toString();
        }

        // Return the array containing all the completed rows.
        return ans;
    }
}