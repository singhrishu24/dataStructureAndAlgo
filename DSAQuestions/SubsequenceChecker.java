
import java.util.*;

public class SubsequenceChecker
{
    public static boolean isSubsequence(String s, String t)
    {
        int sLength = s.length();
        int tLength = t.length();
        int sIndex  = 0;
        int tIndex  = 0;

        while (sIndex < sLength && tIndex < tLength){
            if (s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == sLength;
    }

    //Using HashMap
    public static boolean isSubsequenceHashMap(String s, String t)
    {
        Map<Character, List<Integer>> indexMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            indexMap.computeIfAbsent(c, key -> new ArrayList<>()).add(i);
        }

        int prevIndex = -1;

        //Iterate through s and perform constant time lookup s in the indexMap.
        for (char c : s.toCharArray()){
            if (!indexMap.containsKey(c)){
                return false;
            }
            List<Integer> indices = indexMap.get(c);
            int insertionIndex = Collections.binarySearch(indices, prevIndex+1);

            if (insertionIndex < 0){ insertionIndex = -(insertionIndex + 1);}
            if (insertionIndex == indices.size()){ return false; }
            prevIndex = indices.get(insertionIndex);
        }
        return true;
    }


    //Driver Code
    public static void main(String[] args){
        String s = "abc";
        String t = "ahbgce";
        boolean result = isSubsequenceHashMap(s, t);
        System.out.println(result);
    }
}