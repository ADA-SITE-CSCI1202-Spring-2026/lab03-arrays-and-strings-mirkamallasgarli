package week05;

import java.util.Arrays;

public class StringUtils {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();
    }
 
    public static String explode(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            result.append(s.substring(0, i + 1));

        }

        return result.toString();
    }

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }

    public static Boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()){
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);


    }

    public static String swapWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();

            for (String word : words){

                if (word.length() > 1) {
                    char first = word.charAt(0);
                    char last = word.charAt(word.length() - 1);

                    String Middle = word.substring(1, word.length() - 1);

                    word = last + Middle + first;
                }

                res.append(word).append(" ");
            }

        return res.toString();

    }



    public static void main(String[] args) {
       String input = "Gel mene addim addim";

       System.out.println(swapWords(input));
    }

}

