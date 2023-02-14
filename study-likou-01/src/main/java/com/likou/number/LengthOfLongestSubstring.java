package com.likou.number;

import java.util.HashMap;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2023-02-14 16:32
 * @Description:
 */

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        int left=0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }


    public static void main(String[] args) {

        String s="asdfghajkaj";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
