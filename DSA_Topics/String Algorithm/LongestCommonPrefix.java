// Longest Common Prefix 

public class LongestCommonPrefix{
    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args){
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"apple", "apricot", "appetizer"};

        System.out.println("Longest Common Prefix 1: " + longestCommonPrefix(strs1));
        System.out.println("Longest Common Prefix 2: " + longestCommonPrefix(strs2));
        System.out.println("Longest Common Prefix 3: " + longestCommonPrefix(strs3));
    }
}