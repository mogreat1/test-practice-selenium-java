package questions;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

    public static void main(String[] args) {
        //Write a function which will return index and and value of each first
        // repeated character in the string. Ex “assddd” -> 0,a; 1,s; 3, d
        String values = "assddd";
        Practise p = new Practise();
        Map<Integer, Character> map = p.test(values);
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

    }

    public Map<Integer, Character> test(String values) {
        Map<Integer, Character> map = new HashMap<>();
        for(int i =0; i<values.length();i++){
            if(!map.containsValue(values.charAt(i))){
                map.put(i, values.charAt(i));
            }
        }

        return map;

    }
}
