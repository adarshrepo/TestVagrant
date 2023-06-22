package Tests;

import org.apache.tools.ant.util.StringUtils;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

public class StringTokeniser {
    @Test
    public void stringTokeniser(){

        String str="Heloo how are u ";

        StringBuilder s=new StringBuilder(str);


        System.out.println(str);

        StringTokenizer sb= new StringTokenizer(str);


        while(sb.hasMoreTokens()){
            System.out.println(sb.nextToken());
        }
//
//        System.out.println(arr);


    }
}
