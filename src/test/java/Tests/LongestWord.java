package Tests;

import org.testng.annotations.Test;

import java.util.StringTokenizer;

public class LongestWord {
    @Test
    public void longestWordinString(){
        String str="print the longest word in this String";
        StringTokenizer st=new StringTokenizer(str);
        String longestStr=null;
        String word=null;

//        System.out.println("-----"+st.nextToken());
        int count=0;
        while(st.hasMoreTokens()){
            word=st.nextToken();
            if(word.length()>count) {
                count = word.length();
                longestStr = word;
            }
        }
        System.out.println("Longest word : "+longestStr+", length :"+count);
    }
}
