# Sieve of Eratosthenes implementation in Python.

def generate_primes(n):
    is_composite = [False] * (n+1)
    primes = []

    for i in range(2, int(n ** 0.5) + 1):
        if not is_composite[i]:
            primes.append(i)
            for j in range(i*i, n+1, i):
                is_composite[j] = True

    for i in range(int(n**0.5)+1, n+1):
        if not is_composite[i]:
            primes.append(i)

    return primes

if __name__ == "__main__":
    n = 30
    primes = generate_primes(n)
    print(f"Prime numbers up to {n}: {primes}")                    
