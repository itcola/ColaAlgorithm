package com.cola.ATest;

import java.util.Arrays;
import java.util.List;

/**
 * Author:cola
 * Date:2019/12/25
 */
public class Demo1225 {
    public static void main(String[] args) {
        String s = "leetcode";
        s = s.replace("leet","");
        System.out.println(s);
        int[] arr = {2,1,4,3};

            Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        int k = 0;
        for(int i = 0 ; i < wordDict.size(); i ++){
            if(s.contains(wordDict.get(i)) ){
                k ++;
                s = s.replace(wordDict.get(i),"");
            }
        }
        return wordDict.size() == k ? true : false;
    }
}
