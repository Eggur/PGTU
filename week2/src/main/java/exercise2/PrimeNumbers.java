package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(primeNumbers(35));
    }

    private static List primeNumbers(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i)
                    primes[j] = false;
            }
        }

        List primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }
}
