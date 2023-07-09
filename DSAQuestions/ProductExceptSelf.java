// Product of Array Except Self.

public class ProductExceptSelf
{
    public static int[] productExceptSelf(int[] nums)
    {
        // Using for Loop 
        int n = nums.length;
        int[] result = new int[n];
        //Product of all the elements left  of each element.
        int leftProduct = 1;
        for (int i = 0; i < n; i++){
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        //calculate product of all elements to right of each element.
        int rightProduct = 1;
        for (int i = n-1; i>= 0; i--){
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }    

    // Driver Code 
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);

        System.out.print("Result: ");
        for (int num : result){
            System.out.print(num +" ");
        }
    }
}