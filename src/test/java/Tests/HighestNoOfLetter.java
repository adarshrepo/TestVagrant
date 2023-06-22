package Tests;

import org.testng.annotations.Test;

import java.util.Locale;

public class HighestNoOfLetter {
    @Test
    public void highestLetter(){
        String str="Test Test";
        str=str.toLowerCase();
        String maxLetter=null,secMaxLetter=null;
        str=str.replace(" ","");
        char ch;
        int count,max=0,secondMax=0;
        for(int i=0;i<=str.length()-1;i++){
            count=0;
            ch=str.charAt(i);
            if(ch==' ')
                continue;
            for(int j=i;j<=str.length()-1;j++){
                if(ch==str.charAt(j))
                    count+=1;
            }
            str.replace(ch,' ');

            if(count>max){
                max=count;
                maxLetter= String.valueOf(ch);
            }else if(count>secondMax){
                secondMax=count;
                secMaxLetter= String.valueOf(ch);
            }

        }
        System.out.println("Max occuring Letter : "+maxLetter);
        System.out.println("Max occuring Letter count : "+max);
        System.out.println("-----------------------------------------");
        System.out.println("Second Max occuring Letter : "+secMaxLetter);
        System.out.println("Second Max occuring Letter count : "+secondMax);


    }
}
