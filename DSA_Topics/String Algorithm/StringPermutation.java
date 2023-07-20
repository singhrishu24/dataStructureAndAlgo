// String Permutation

import java.util.ArrayList;
import java.util.List;

public class StringPermutation{
    public static List<String> findPermutations(String str){
        List<String> permutations = new ArrayList<>();
        char[] chars = str.toCharArray();
        backtrack(chars, 0, permutations);
        return permutations;
    }

    private static void backtrack(char[] chars, int start, List<String> permutations){
        if (start == chars.length - 1){
            permutations.add(new String(chars));
            return;
        }

        for (int i = start; i < chars.length; i++){
            swap(chars, start, i);
            backtrack(chars, start+1, permutations);
            swap(chars, start, i);
        }
    }

    private static void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args){
        String str = "abc";
        List<String> permutations = findPermutations(str);
        System.out.println(permutations);
    }
}