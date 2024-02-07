package com.interview.string;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(lenght("pwwkew"));
    }

    private static int lenght(String s) {
        StringBuilder substring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (substring.toString().contains(String.valueOf(s.charAt(i)))){
                break;
            }
            substring.append(s.charAt(i));
        }
        return substring.length();
    }
}
