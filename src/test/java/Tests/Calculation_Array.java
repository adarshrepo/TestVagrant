package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Calculation_Array {
    @Test
    public void array(){
        String[] str={"X--","X--","++X"};
        int sum=0;
        for(String s : str){
            switch (s){
                case "X++":
                case "++X":sum+=1;
                    break;
                case "X--":
                case "--X":sum-=1;
                break;
                default:
                    System.out.println("Invalid value : "+s);

            }
        }
        System.out.println("Sum : "+sum);

    }
}
