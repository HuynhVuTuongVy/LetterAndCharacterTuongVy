package model;

import java.util.HashMap;
import control.WordsAndCharactersController;

public class WordsAndCharactersModel {
    
    private HashMap<Character, Integer> letterCountMap;
    private HashMap<String, Integer> wordCountMap;
    int wordCount = 0;
    int characterCount = 0;

    public WordsAndCharactersModel() {
        letterCountMap = new HashMap<>();
        wordCountMap = new HashMap<>();
    }

    public void countWords(String string) {
        String[] words = string.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);

                for (int i = 0; i < word.length(); i++) {
                    char currentChar = word.charAt(i);

                    if (Character.isLetter(currentChar)) {
                        letterCountMap.put(currentChar, letterCountMap.getOrDefault(currentChar, 0) + 1);
                    }
                }
            }
        }

        characterCount += string.length();
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public HashMap<Character, Integer> getLetterCountMap() {
        return letterCountMap;
    }

    public HashMap<String, Integer> getWordCountMap() {
        return wordCountMap;
    }
    
}
