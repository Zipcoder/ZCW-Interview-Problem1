package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public Map<Character, Character> getMap(){
        Map<Character, Character> substitutionMap=new HashMap<Character, Character>();
        substitutionMap.put('f','7');
        substitutionMap.put('s', '$');
        substitutionMap.put('1','!');
        substitutionMap.put('a','@');
        return substitutionMap;
    }

    public Character subInLetter(char letter){
        Map<Character,Character> substitutionMap=getMap();

        Character newLetter=substitutionMap.get(letter);
        if(newLetter!=null)
            return newLetter;
        else return letter;
    }

    public String replaceSentence(String sentence){
        StringBuilder replacedSentence=new StringBuilder();


        for(int i=0; i<sentence.length(); i++){
            Character letter=sentence.toLowerCase().charAt(i);
            letter=subInLetter(letter);
            if(letter!=sentence.toLowerCase().charAt(i))
                replacedSentence.append(letter);
            else replacedSentence.append(sentence.charAt(i));
        }
        return replacedSentence.toString();
    }

    public String replacementRecurrsion(String sentence, Integer index ){
        Map<Character, Character> substitutionMap=getMap();


//        replacementRecurrsion()
        return null;
    }

}
