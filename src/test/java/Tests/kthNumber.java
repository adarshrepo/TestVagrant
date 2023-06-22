package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class kthNumber {
    @Test
    public void kthNumberAddition(){
        int value=114;
        String num=String.valueOf(value);
        int sum=0;

        if(num.length()<3){
            System.out.println("Number less than  3 digit");
            return;
        }
        ArrayList<Integer>arrNum=new ArrayList<Integer>();
        for(char s: num.toCharArray()){
            arrNum.add(Integer.parseInt(String.valueOf(s)));
            sum+=Integer.parseInt(String.valueOf(s));
        }
        arrNum.add(sum);


        while(sum<value){
            for(int i=1;i<=arrNum.size()-2;i++){
                sum+=arrNum.get(i);
            }
            arrNum.add(sum);
            arrNum.remove(0);

        }
        if(sum==value)
            System.out.println("Number is Keith");
        else
            System.out.println("Number is not Keith");
    }
}
