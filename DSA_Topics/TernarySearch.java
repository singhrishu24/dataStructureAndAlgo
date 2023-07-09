// Java Code for Ternary Search in a sorted array.
// When to Use Ternary Search?
//Large arrays, need to be searched. Time complexity is to be reduced. Data has to be sorted.


class TernarySearch
{
    static int ternarySearch(int l, int r, int key, int ar[])
    {
        if (r>=l)
        {
            //Find mid1 and mid2
            int mid1 = l + (r-l)/3; 
            int mid2 = r - (r-l)/3; 

            //Check if key is present at any mid
            if (ar[mid1] == key) return mid1;
            if (ar[mid2] == key) return mid2;

            //Checking for the region the key is present in..

            if (key < ar[mid1])
            {
                return ternarySearch(l, mid1-1, key, ar);
            }
            else if(key > ar[mid2])
            {
                return ternarySearch(mid2+1, r, key, ar);
            }
            else
            {
                return ternarySearch(mid1+1, mid2-1, key, ar);
            }
        }
        return -1;
    }

    ////////////////////////////////////////////////
    //               Driver code                  //
    ////////////////////////////////////////////////

    public static void main(String args[])
    {
        int l,r,p,key;  // Declaring Variables 

        int ar[] = new int[]{2,3,4,5,6,7,8,9}; // Declaring and initializing array
        l        = 0; 
        r        = ar.length;
        key      = 9;
        p        = ternarySearch(l, r, key, ar);
        System.out.println("Index of " + key + " is : " + p);
    }
}