package io.zipcoder;
//Example:
//One method using iteration, another using recursion
//Given the following map { ‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’}, your method should
// replace any character represented by a key in the map, with its corresponding value.

//Input = “The Farmer went to the store to get 1 dollar’s worth of fertilizer”
// Output = “The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer”
public class Problem1 {

    public static String iterativeSolution(String input){

        input=input.replaceAll("[f|F]\\B", "7");
        char[] charArray = input.toCharArray();

        for (int i=0; i<charArray.length; i++)
        {
            charArray[i]=checkAndReplace(charArray[i]);
        }

        return (new String(charArray));
    }

    public static String recursiveSolution(String input){
        input=recursiveRegexHelper(input);
        return input;
    }

    private static String recursiveRegexHelper(String input){

        if (input.contains("s")){
            String output=recursiveRegexHelper(input.replaceAll("s", "$"));//Doesn't like $?
            return (output);
        } else if (input.contains("1")){
            return (recursiveRegexHelper(input.replace("1","!")));
        }else if (input.contains("a")){
            return (recursiveRegexHelper(input.replaceAll("a", "@")));
        }else{
            return (input.replaceAll("[f|F]\\B", "7"));
        }

    }

    private static char checkAndReplace(char c) {
        switch (c) {
            case 's': {
                return '$';
            }
            case '1': {
                return '!';
            }
            case 'a': {
                return '@';
            }
            default: {
                return c;
            }
        }
    }

}
