package view;

import java.util.HashMap;

public class WordsAndCharactersView {
    
    
    public void display(int wordCount, int characterCount, HashMap<Character, Integer> letterCountMap, HashMap<String, Integer> wordCountMap){
        System.out.print("{");
        for (Character key : letterCountMap.keySet()) {
            System.out.print(key + "=" + letterCountMap.get(key) + ", ");
        }
        System.out.println("}");
        
        System.out.print("{");
        for (String key : wordCountMap.keySet()) {
            System.out.print(key + "=" + wordCountMap.get(key) + ", ");
        }
        System.out.println("}");
    }
    
    
    
}
