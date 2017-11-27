package io.zipcoder;


import java.util.*;

public class Problem1 {

    Map<Character,Character> map=new HashMap<>();
    String str = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
    public void addMap(){
        map.put('f','7');
        map.put('s','$');
        map.put('1','!');
        map.put('a',"@".charAt(0));
    }
    public String replaceChar(){
        for(Map.Entry<Character,Character> entry: map.entrySet()){
            str = str.replace(entry.getKey(),entry.getValue());
        }
        return str;
    }
//    @Override
//    public String toString(){
//        return "name:" + name + " price:" + price + " type:" + type + " expiration:" + expiration;
//
//    }


}
