package io.zipcoder;

public class Iteration {

    public String replaceUsingIteration(String rawData,String map, char replaceWith){
        StringBuilder buildString = new StringBuilder(rawData);
        String toReturn = rawData;
        for(int i = 0; i < toReturn.length(); i++){
            for(int j = 0; j < map.length(); j++){
                if(toReturn.charAt(i) == map.charAt(j)){
//                   toReturn.replace(toReturn.charAt(i), replaceWith);
                    buildString.setCharAt(i, replaceWith);
                }
            }
        }
        return buildString.toString();
    }
}
