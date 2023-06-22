package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {

    public static void main(String[] args){
        String s="ADARSH1234KS234$";
        int count=0;
        ArrayList<String> str=new ArrayList<>();

        for(int i=0;i<s.length()-1;i++){
        if(!Character.isAlphabetic(s.charAt(i)) || str.contains(String.valueOf(s.charAt(i))))
            continue;
        count=1;
        for(int j=i+1;j<s.length()-1;j++){
            if(s.charAt(i)==s.charAt(j))
                count+=1;
        }
            str.add(String.valueOf(s.charAt(i)));
            System.out.println("Alphabet : "+s.charAt(i)+" : "+count);

        }


    }
}
