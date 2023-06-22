package Tests;

import config.BaseTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatArray extends BaseTest {
    @Test
    public void splitString(){

        int[] arr= new int[]{1,2,3};
        int[] arr2= new int[arr.length*2];
        System.out.println(Arrays.toString(arr));
        int index=0;


        for(int i=0;i<=arr.length-1;i++) {
//            System.out.println(Arrays.toString(arr2));
            arr2[i]=arr[i];
            index=i;
        }


        System.out.println(Arrays.toString(arr2));
    }
}
