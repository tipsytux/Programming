package DataStructures.SetsAndDictionaries;

import java.util.*;

/**
 * Anagram of key value pairs of a HashMap
 * Description
 * You are given a HashMap with n number of keys and values.
 * You need to print key-value pairs that are an anagrams of each other in the dictionary order of keys
 * (alphabetical order based on the first letter of the word). An anagram is a word, phrase or name that is formed by rearranging the letters of another.
 * Example:
 * Map = {rasp spar, dog cat}
 * Output:
 * rasp : spar
 * Here spar is formed from rasp.
 * Input: The input will be in the following format:
 * The first line should be the number of elements present in the map.
 * Next, n lines contain the key-value pairs.
 * Output:
 * All the key-value pairs that are an anagram of each other should be printed in the following format:
 * Key1: Value1
 * Key2: Value2
 * Note: If there is no such key-value pair anagram of each other, then the output should be false.
 */
public class Anagrams{
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
        arrange(ch1);
        arrange(ch2);
        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;
    }
    //Method to sort the character array
    public static void arrange(char[] ch){
        //Write your code here
        Arrays.sort(ch);
    }

    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        //Write your code here
        boolean found = false;
        for (String k : map.keySet()){

            if(check(k,map.get(k))){
            if(check(k,map.get(k))){
                found = true;
                System.out.println(k + " : " + map.get(k));
            }
        }
        if(!found){
            System.out.println("false");
        }
    }
}}
