# Euclidean Algorithm for GCD implementation in Python.

def gcd(a, b):
    while b != 0:
        temp = b
        b = a % b
        a = temp
    return a 

if __name__ == "__main__":
    num1 = 36
    num2 = 48
    gcd_result = gcd(num1, num2)
    print(f"GCD of {num1} and {num2} is : {gcd_result}")   