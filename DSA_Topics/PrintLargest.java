// Java code to find largest three elements
// in an array
import java.util.Arrays;


///////////////////////////////////////////////////////
///////////////////////////////////////////////////////


//Method 1 : Iterative Approach
//Time Complexity: O(n)
//Space Complexity: O(1)
public class PrintLargest {
	/* Function to print three largest elements */
	static void print3largest(int arr[], int arr_size)
	{
		int i, first, second, third;
        
		//There should be three elements 
		if (arr_size < 3) {
			System.out.print(" Invalid Input ");
			return;
		}
        
		third = first = second = Integer.MIN_VALUE;
		for (i = 0; i  < arr_size; i++) 
		{
			if (arr[i] > first) {
				third  = second;
				second = first;
				first  = arr[i];
			}
            
			else if (arr[i] > second) {
				third  = second;
				second = arr[i];
			}
            
			else if (arr[i] > third)
				third = arr[i];
		}
        
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
	}
    
	/* Driver program to test above function*/
	/* 
	public static void main(String[] args)
	{
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int n = arr.length;
		print3largest(arr, n);
	}
    */

///////////////////////////////////////////////////////
///////////////////////////////////////////////////////
//Method 2 : Sorting
//Time Complexity: O(n Log (m))
//(m) : is distance (Middle-first)  
    static void sorting(int arr[], int arr_size)
	{
		Arrays.sort(arr);
		System.out.printf("Three largest elements are %d %d %d\n", arr[arr_size - 1], arr[arr_size - 2], arr[arr_size - 3]);
	}
    //Driver code for Sorting
	public static void main(String[] args)
	{
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int n = arr.length;
		sorting(arr, n);
	}
}