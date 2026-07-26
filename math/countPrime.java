class Solution {

    public int countPrimes(int n) {

        boolean[] prime = new boolean[n];

        // Assume every number is prime
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        // Cross out multiples
        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }

            }
        }

        // Count remaining primes
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i])
                count++;
        }

        return count;
    }
}

// in this sum we should start from 2 because 0 and 1 are not prime numbers. The algorithm uses the Sieve of Eratosthenes method to efficiently count the number of prime numbers less than n. It initializes a boolean array to track prime status, marks non-prime numbers by crossing out multiples, and finally counts the remaining true values in the array to determine the total number of primes.\

// to print false we use the statement 