class LinearSear {
    /*public static int search(int arr[], int x)
    {
        //int N = arr.length;
        for (int i =0; i < arr.length; i++)
        {
            if (arr[i] == x) 
                return i;
        }
        return -1;
    }

    ////////////////////////////////
    // Driver Class //
    ////////////////////////////////
    public static void main(String[] args)
    {
        int arr[]  = {2,3,4,5,6,7,8,9,10,11,12};
        int x      = 11;

        int result = search(arr, x);  
        if (result == -1)
            System.out.print("Element nor present");
        else 
            System.out.print("Element is present at index " + result);
    }*/
    
    
    /*static int arr[] = {2,3,4,5,6,7,8,};

    static int linearsearch(int arr[], int size, int key)
    {
        if (size == 0)
        {
            return -1;
        }
        else if (arr[size -1] == key)
        {
            return size -1;
        }
        else
        {
            return linearsearch(arr, size -1, key);
        }
    }
    

    ////////////////////////////////////////////////////////////////
    // Driver method
    ////////////////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        int key = 4;
    
        int index = linearsearch(arr, arr.length, key);
        if (index != -1)
            System.out.println("The Element " + key + " is found at " + index + " index of the array.");
        else
            System.out.println("The element " + key + "i s not found.");
    }*/



    ////////////////////////////////////////////////////////////////
    //             SENTINEL LINEAR SEARCH                         //
    ///////////////////////////////////////////////////////////////
    


    public static int sentinelLinearSearch(int[] arr, int key)
    {
        int last            = arr[arr.length - 1] ;
        arr[arr.length - 1] = key ;
        int i               = 0 ;
        while (arr[i] != key) 
        {
            i++;
        }
        arr[arr.length - 1] = last;
        if (i < arr.length - 1 || last == key)
        {return i;}
        else { return -1;}
    }

    public static void main(String[] args)
    {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int key      = 5 ;
        int index    = sentinelLinearSearch(array, key);
        if (index == -1){ System.out.println(key + " is not found in array.");}
        else { System.out.println(key + " is found in array at index : " + index) ;}  
    }
}