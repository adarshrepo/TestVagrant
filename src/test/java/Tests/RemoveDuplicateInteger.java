package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateInteger {
    @Test
    public void removeInteger(){
        int[] nums={3,2,2,3};
        int val=3;
        ArrayList<Integer> newNums=new ArrayList<Integer>();

        for(int i=0;i<nums.length-1;i++){
            if(val!=nums[i]){
                newNums.add(nums[i]);
                continue;
            }
        }
        System.out.println(Arrays.asList(newNums));


    }
}
