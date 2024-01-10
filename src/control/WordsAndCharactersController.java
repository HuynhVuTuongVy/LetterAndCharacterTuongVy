package control;

import java.util.Scanner;
import model.WordsAndCharactersModel;
import view.WordsAndCharactersView;

public class WordsAndCharactersController {
    private String string;
    Scanner sc = new Scanner(System.in);
    
    public void displayMenu(){
        WordsAndCharactersModel model = new WordsAndCharactersModel();
        WordsAndCharactersView view = new WordsAndCharactersView();
        
        model.countWords(string);
        view.display(model.getWordCount(), model.getCharacterCount(), model.getLetterCountMap(), model.getWordCountMap());
    }
    
    public void enterString(){
        System.out.println("Enter your content: ");
        string = sc.nextLine();
    }
    
    public String getString(){
        return string;
    }
    
}
