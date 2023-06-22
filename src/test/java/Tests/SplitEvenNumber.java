package Tests;

import org.testng.annotations.Test;

public class SplitEvenNumber {
    @Test
    public void splitNumberIfEven(){

        int num=1889993456;
        String str=String.valueOf(num);
        if(str.length()%2==0){
            System.out.println(str.substring(0,str.length()/2));
            System.out.println(str.substring(str.length()/2));
        }
        else{
            System.out.println("Number length is odd");
        }


    }
}
