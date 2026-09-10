int count = 0;

// i = candies given to the first child
// i can be from 0 up to limit
for(int i = 0; i <= limit; i++){

    // j = candies given to the second child
    // j can also be from 0 up to limit
    for(int j = 0; j <= limit; j++){

        // Total candies are n
        // So candies for the third child = n - i - j
        int c = n - i - j;

        // Check whether the third child gets a valid amount
        // It cannot be negative
        // It cannot be greater than limit
        if(c >= 0 && c <= limit){

            // This is one valid distribution
            count++;
        }
    }
}

// Return the total number of valid distributions
return count;