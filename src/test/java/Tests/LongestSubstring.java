package Tests;

import config.BaseTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LongestSubstring extends BaseTest {
    @Test
    public void substring(){
        String str="XYZXABCYRTD";
        String subString="";
        String output="";
        ArrayList<String> strArray=new ArrayList<>();

        for(int i=0;i<str.length()-1;i++) {
            str=str.substring(i);
            for (char ch : str.toCharArray()) {
                if (strArray.contains(String.valueOf(ch))) {
                    break;
                } else {
                    strArray.add(String.valueOf(ch));
                    output += String.valueOf(ch);
                }
            }
            if (output.length() > subString.length())
                subString = output;

            System.out.println(output);
            strArray.clear();
            output="";

        }
        System.out.println("Longest - "+subString);

    }
}
