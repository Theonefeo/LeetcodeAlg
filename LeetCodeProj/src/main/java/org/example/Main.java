package org.example;

public class Main {
    public static void main(String[] args) {


        public class MergeString {
            String word1 = "abc";
            String word2= "pqr";

            public String mergeAlternately(String word1, String word2) {
                String mergedAlternately = new String();
                for(int i=0; i < word1.length() && i < word2.length(); i++){
                    mergedAlternately = String.valueOf(mergedAlternately + word1.charAt(i) + word2.charAt(i));
                    if(word1.length() == i+1 && word2.length() != i+1)
                        mergedAlternately = String.valueOf(mergedAlternately + word2.substring(i+1, word2.length()));
                    else if(word2.length() == i+1 && word1.length() != i+1)
                        mergedAlternately = String.valueOf(mergedAlternately + word1.substring(i+1, word1.length()));

                }
                return mergedAlternately;
            }

        }



    }
}