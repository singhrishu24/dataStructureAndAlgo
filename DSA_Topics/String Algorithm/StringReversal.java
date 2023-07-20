// String Reversal Algorithms

public class StringReversal {
    public static String reverseStringSB(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseStringCA(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length-1;

        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public static void main(String[] args){
        String input = "Hello, World!";
        String reversed = reverseStringCA(input);
        System.out.println("Reversed string: " + reversed);
    }
}