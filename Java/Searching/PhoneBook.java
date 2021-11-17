package Searching;
import java.util.*;

class PhoneBook {
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};
        String NewEmail="monica.geller@xyz.com";
        // Write your code here
        int retval = -1;
        boolean found = false;
        for(int i=0;i< emails.length && !found ;i++){
            if(emails[i].equals(NewEmail)){
                found=true;
                retval=i;
            }
        }
        System.out.println(retval);
    }
}
