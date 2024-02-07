package com.interview.math;

public class Prefix {
    public String longestCommonPrefix(String[] strs) {
        String biggestPrefix = "";
        for (int i=0; i <strs.length-1; i++){
            for (int j=1; j <strs.length; j++){
                String currentPrefix = "";
                for (int m=0; m<strs[i].length(); m++){
                    for (int n=0; n<strs[j].length(); n++) {
                        if (strs[i].charAt(m) == strs[j].charAt(n)) {
                            currentPrefix = currentPrefix + strs[i].charAt(m);
                            biggestPrefix = currentPrefix.length() > biggestPrefix.length() ? currentPrefix : biggestPrefix;
                        }
                    }
                }
            }
        }
        return biggestPrefix;
    }
}
