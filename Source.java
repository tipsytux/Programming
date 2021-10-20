import java.util.*;
public class Source{
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        LinkedHashMap<Integer,String> distinct = new LinkedHashMap<>();
        Integer i = 0;
        for (String value : map.values()){
            if(!distinct.containsValue(value)){
                distinct.put(i,value);
                i++;
            }
        }
        class Source{
            public static void main(String[] x){
        for (String value : distinct.values()){
            System.out.print(value+" ");
            public static void main(String[] x){
                Map<Integer,String> map = new HashMap<>();
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int key;
                String value;
                for(int i = 1; i <= num; i++){
                    key = sc.nextInt();
                    value = sc.next();
                    map.put(key,value);
                }
                printValues(map);
            }
        }