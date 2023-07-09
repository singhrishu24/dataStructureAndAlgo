
import java.util.*;

public class SubsequenceChecker {
    public static boolean isSubsequence(String s, String t) {
        Map<Character, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            indexMap.computeIfAbsent(c, key -> new ArrayList<>()).add(i);
        }
        
        int prevIndex = -1;
        for (char c : s.toCharArray()) {
            if (!indexMap.containsKey(c)) {
                return false;
            }
            
            List<Integer> indices = indexMap.get(c);
            int insertionIndex = Collections.binarySearch(indices, prevIndex + 1);
            if (insertionIndex < 0) {
                insertionIndex = -(insertionIndex + 1);
            }
            
            if (insertionIndex == indices.size() || indices.get(insertionIndex) <= prevIndex) {
                return false;
            }
            
            prevIndex = indices.get(insertionIndex);
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "ab";
        String t = "baab";
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }
}
