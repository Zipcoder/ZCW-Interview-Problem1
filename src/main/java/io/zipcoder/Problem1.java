package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    private HashMap<Character,Character> changeMap = new HashMap<Character, Character>();
    private String sentence;

    public Problem1(String sentence, HashMap<Character,Character> changeMap){
        this.sentence = sentence;
        this.changeMap = changeMap;
    }

    public String changeWithLoop(){
        StringBuilder newSentence = new StringBuilder();
        for(int i = 0;i<sentence.length();i++){
            Character currentCharacter = sentence.charAt(i);
            if(changeMap.containsKey(Character.toLowerCase(currentCharacter)) ||
                    changeMap.containsKey(Character.toUpperCase(currentCharacter))){
                newSentence.append(changeMap.get(Character.toLowerCase(currentCharacter)));
            }else{
                newSentence.append(currentCharacter);
            }
        }
        return newSentence.toString();
    }

    public String withRecursion(){
        return replace(sentence,0);
    }

    public String replace(String sentence, int place){
        Character currentCharacter = sentence.charAt(place);
        if(changeMap.containsKey(Character.toLowerCase(currentCharacter)) || changeMap.containsKey(Character.toUpperCase(currentCharacter))){
            currentCharacter = changeMap.get(Character.toLowerCase(currentCharacter));
        }
        sentence = sentence.substring(0,place)+currentCharacter+sentence.substring(place+1);

        if(place<sentence.length()-1) {
            sentence = replace(sentence,place+=1);
        }
        return sentence;
    }
}
