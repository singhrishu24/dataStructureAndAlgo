// Find the First Repeating Element in the Array.
// Using Nested Loop Approach 
// Time Complexity is O(n^2)
// Space Complexity is O(1)

// Using HashSet Approach 
// Time Complexity is O(n)
// Space Complexity is O(n)
import java.util.HashSet;
class FirstRepeatingElement 
{
    static void printFirstRepeating(int arr[])
    {
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        // Traverse the input array from right to left
        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (set.contains(arr[i]))
                min = i;
            else
                set.add(arr[i]);
        }
        if(min != -1)
            System.out.println("The first repeating element is " + arr[min]);
        else
            System.out.println("There are no repeating elements");
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        printFirstRepeating(arr);
    }
}