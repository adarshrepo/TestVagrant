package Tests;

import config.BaseTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitString extends BaseTest {
    @Test
    public void splitString(){
        String str="ANAMIKA";
        int n=3;
        List<String> strArray= new ArrayList<>();
        if(str.length()%n>0)
            System.out.println("Cannot divide String");
        else{
            n=str.length()/n;
            for(int i=0;i<=str.length()-n;i+=n){
                System.out.println(i+"-----"+(i+n));
                strArray.add(str.substring(i,i+n));
            }
            System.out.println(strArray.toString());
        }

    }
}
