package org.leetcodealg.classes;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equals(str2))
            return str1;

        String resultGCD = "";
        if(str1.length() > str2.length()) {
            resultGCD = calculateGCD(str1, str2);
        }
        else {
            resultGCD = calculateGCD(str2, str1);
        }
        return resultGCD;
    }


    public String calculateGCD(String string1, String string2){
        int i=string2.length()-1;
        StringBuilder stringGCD = new StringBuilder(string2);
        while(i!=0){
            if(string1.length() % stringGCD.length() == 0 && string2.length() % stringGCD.length() == 0) {
                i = 0;
            }
            else {
                stringGCD.deleteCharAt(i);
                i--;
            }
        }
        return stringGCD.toString();
    }
}


//        int i=0;
//        StringBuilder resultGCD = new StringBuilder("");
//        while(i<str1.length() && i<str2.length())
//        {
//            if(str1.charAt(i) == str2.charAt(i)) {
//                resultGCD.append(str1.charAt(i));
//                i++;
//            }
//            else
//                i=str1.length();
//            }
//
//        return resultGCD.toString();