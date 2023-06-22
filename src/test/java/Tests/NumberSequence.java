package Tests;

import config.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;

public class NumberSequence extends BaseTest {
    @Test
    public void validations() {
        Response res=null;
//        List<String> str= new ArrayList<String>(Arrays.asList("test","adarsh","noone"));
//        str.add("hello");
//        Collections.sort(str);
//        System.out.println(str);
        int num = 11;
        boolean prime=true;
        for(int i=2;i<num/2;i++){
            if(num%i!=0)
            {
                continue;
            }
            else if(i!=num) {
                System.out.println("Non Prime number");
                prime=false;
                break;
            }

        }
        if(prime)
            System.out.println("Number is prime");

    }


}
