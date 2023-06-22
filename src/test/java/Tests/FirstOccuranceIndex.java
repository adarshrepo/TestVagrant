package Tests;

import org.testng.annotations.Test;

public class FirstOccuranceIndex {
    @Test
    public void firstOccuranceString(){
        String haystack="sadbutsad";
        String needle="sad";
        int length=needle.length();
        String sub=null;
        for(int i=0;i<=haystack.length()-1;i++){
            sub=haystack.substring(i,i+length);
            System.out.println(sub);
            if(sub.equals(needle)){
                System.out.println(i);
                break;
            }

        }
    }
}
