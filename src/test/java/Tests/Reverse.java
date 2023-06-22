package Tests;

import config.BaseTest;
import org.testng.annotations.Test;

public class Reverse extends BaseTest {
    @Test
    public void reverse(){
        String str="hello";
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

    }
}
