package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPblm {
    @Test
    public void stringProblem(){
        String str="53+D10119+C4D";
        ArrayList<Integer> arr=new ArrayList<>();

        for(char c : str.toCharArray()){
        String s="";
        s+=c;
            switch (s){
                case "C": arr.remove(arr.size()-1);
                    break;
                case "D": arr.add(arr.get(arr.size()-1)*2);
                    break;
                case "+": arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
                    break;
                default: arr.add(Integer.parseInt(s));
            }
        }
        System.out.println(arr);

    }
}
