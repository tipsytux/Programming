package Assignment;

import java.util.*;

public class Itinerary {

    public static void findItinerary(Map<String, String> tickets) {
        Map<String, String> reverseMap = new HashMap<String, String>();
        for (Map.Entry<String,String> entry: tickets.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());
        String start = null;
        for (Map.Entry<String,String> entry: tickets.entrySet())
        {
            if (!reverseMap.containsKey(entry.getKey()))
            {
                start = entry.getKey();
                break;
            }
        }
        if (start == null)
        {
            System.out.println("Invalid Input");
            return;
        }
        String to = tickets.get(start);
        while (to != null)
        {
            System.out.println(start +  "->" + to);
            start = to;
            to = tickets.get(to);
        }
    }

    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            tickets.put(sc.next(),sc.next());
        }
        findItinerary(tickets);
    }
}