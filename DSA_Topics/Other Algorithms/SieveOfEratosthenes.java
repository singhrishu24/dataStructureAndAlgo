// Sieve of Eratosthenes : Prime Number Generation

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes{
    public static List<Integer> generatePrimes(int n){
        boolean[] isComposite = new boolean[n+1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i * i <= n; i += i){
            if (!isComposite[i]){
                primes.add(i);

                for (int j = i * i; j <= n; j += i){
                    isComposite[j] = true;
                }
            }
        }

        for (int i = (int) Math.sqrt(n) + 1; i <= n; i++){
            if (!isComposite[i]){
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args){
        int n = 30;
        List<Integer> primes = generatePrimes(n);
        System.out.println("Prime number up to " + n + " : " + primes);
    }    
}