// Euclidean ALgorithm for calculating Graetest Common Divisor (GCD)

public class EuclideanAlgorithm{
    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){
        int num1 = 36;
        int num2 = 48;
        int gcdResult = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
    }
}