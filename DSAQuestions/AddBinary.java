//Adding two binary Strings and giving the result as a binary String.
// Time Complexity 0(1)
// Space Complexity 0(1)
public class AddBinary
{
    public static String addBinary(String a, String b)
    {
        int n            = a.length(), m = b.length();
        int maxLen       = Math.max(n,m);
        StringBuilder sb = new StringBuilder(); //StringBuilder to store the result.
        int carry        = 0; // Initialize carry to 0.

        for(int i = 0; i < maxLen; i++)
        {
            int sum = carry; // Initialize sum to carry.    

            // Add the corresponding digits from string in reverse order.
            if (i < n){sum += (a.charAt(n - 1 - i) - '0');}
            if (i < m){sum += (b.charAt(m - 1 - i) - '0');}
            sb.insert(0, sum % 2); // Insert the remainder of the sum at the beginning of String Builder.
            carry = sum / 2; // Update carry for next iteration.
        }
        //If there is remaining carry after the loop, insert it at the beginning of String Builder.
        if (carry != 0){sb.insert(0, carry);}
        //Return the String Builder as a String.
        return sb.toString();
    }


//Driver Code.
    public static void main(String[] args)
    {
        String a = "101";
        String b = "1101";
        String sum = addBinary(a, b);
        System.out.println("Sum : " + sum);
    }
}