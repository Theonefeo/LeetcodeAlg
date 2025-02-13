package org.leetcodealg.classes;

public class MergeStringsAlternately {
    //    For OOP style writing code
    //    private String word1;
    //    private String word2;
    //     public MergeStringsAlternately(){
    //    }
    //    public MergeStringsAlternately(String word1, String word2){
    //        this.word1 = word1;
    //        this.word2 = word2;
    //    }

    //    This solution worked in a 8ms and 42.6MB
    //    Complexity Analysis
    //    Time complexity: O(m+n)
    //    We iterate over word1 and word2 once pushing their letters into result. It would take O(m+n) time.
    //    Space complexity: O(1)
    //    Without considering the space consumed by the input strings (word1 and word2) and the output string (result), we do not use more than constant space.
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedAlternately = new StringBuilder();

        for(int i=0; i < word1.length() && i < word2.length(); i++){
            mergedAlternately.append(word1.charAt(i)).append(word2.charAt(i));
            if(word1.length() == i+1 && word2.length() != i+1)
                mergedAlternately.append(word2.substring(i+1, word2.length()));
            else if(word2.length() == i+1 && word1.length() != i+1)
                mergedAlternately.append(word1.substring(i+1, word1.length()));
        }
        System.out.println("String merged: " + mergedAlternately);
        return mergedAlternately.toString();
    }

    //    This solution worked in a 0ms
    public static String mergeAlternatelySolutionLeetCode(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();

        while (i < len1 || j < len2) {
            if(i < len1){
                merged.append(word1.charAt(i++));
            }
            if(j < len2){
                merged.append(word2.charAt(j++));
            }
        }
        return merged.toString();
    }
}