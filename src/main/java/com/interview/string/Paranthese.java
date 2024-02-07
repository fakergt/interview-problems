package com.interview.string;

public class Paranthese {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    public static boolean isValid(String s){
        if (s.length() % 2 != 0){
            return false;
        }
        for (int i=0; i<s.length(); i+=2){
            switch (s.charAt(i)){
                case '(' : return checkCharacters(s.charAt(i+1), ')');
                case '[' : return checkCharacters(s.charAt(i+1), ']');
                case '{' : return checkCharacters(s.charAt(i+1), '}');
                default : return false;
            }
        }
        return false;
    }

    private static boolean checkCharacters(char character, char valid){
        return character == valid;
    }
}
