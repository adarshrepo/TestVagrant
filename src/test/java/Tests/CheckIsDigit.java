package Tests;

import org.testng.annotations.Test;

public class CheckIsDigit {

    @Test
    public void isDigit(){

        int str=12;
        Boolean b=Character.isDigit(str);
        System.out.println(b);

        String s="Adarsh";

    }
}
