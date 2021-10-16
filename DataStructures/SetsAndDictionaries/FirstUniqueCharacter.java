package DataStructures.SetsAndDictionaries;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Description
 * You will be given a string,
 * and you have to print the first unique character of the string, i.e., the non-repeating character of the string.
 * Note:
 * The string may contain duplicates.
 * If there is no unique character, then print -1.
 * Input: The input will be in the following format:
 * The first line will be a string.
 * Output: The output should be in the following format:
 * Print the first unique character of the string or -1 if no unique character is found.
 */
public class FirstUniqueCharacter {
    public static char getFirstUniqueCharacter(Map hashMap){
        for(Object ch : hashMap.keySet()){
            if(hashMap.get(ch).equals(1)){
                return ch.toString().toCharArray()[0];
            }
        }
        return '-';
    }
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here
        char[] array = str.toCharArray();
        Map<Character,Integer> hashMap = new LinkedHashMap<>();
        for(char ch : array){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }
            else{
                hashMap.put(ch,1);
            }
        }
        char firstUniqueCharacter = getFirstUniqueCharacter(hashMap);
        if(firstUniqueCharacter!='-'){
            System.out.println(firstUniqueCharacter);
        }
        else{
            System.out.println("-1");
        }
    }

}
