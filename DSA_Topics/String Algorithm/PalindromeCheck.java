// Palindrome Check 

public class PalindromeCheck{
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)){
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            } else {
                if (leftChar != rightChar){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        System.out.println("Is : '" + input1 + "' a palindrome ? " + isPalindrome(input1));
        System.out.println("Is : '" + input2 + "' a palindrome ? " + isPalindrome(input2));
    }
}