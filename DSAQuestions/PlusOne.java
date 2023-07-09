public class PlusOne
{
    public static int[] plusOne(int[] digits)
    {
        int n = digits.length;

        //Traverse array from "Right" to "Left".
        for (int i = n - 1; i >= 0; i--)
        {
            //If current digit is less than 9, then increment it by 1 and return the array.
            if (digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            //If current digit is 9, then make it 0.
            digits[i] = 0;
        }
        //If all the digits are 9, then create a new array with size n+1 and make the first element 1.
        int[] newNumber = new int[n + 1];
        newNumber[0]    = 1;
        return newNumber;
    }

    //Driver Code.
    public static void main(String[] args)
    {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);
        System.out.print("Result : ");
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}