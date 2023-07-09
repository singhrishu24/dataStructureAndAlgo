//Check if string is a Palindrome.
//Code in Java 
//Time Complexity : O(N)
//Space Complexity: O(1)

public class PalindromeCheck
{
    public static boolean isPalindrome(String s)
    {
        //Convert String to lowercase and remove non-AlphaNumeric char.
        String cleanString = s.toLowerCase().replaceAll("[^a-z0-9]",""); 
        int left = 0;
        int right = s.length() - 1;

        while (left < right) 
        {
            if (cleanString.charAt(left) != cleanString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;    
    }

    //Driver Code
    public static void main(String[] args){
        String s = "Pikachu";
        boolean result = isPalindrome(s);
        System.out.println("Is Palindrome: " + result);
    }
}