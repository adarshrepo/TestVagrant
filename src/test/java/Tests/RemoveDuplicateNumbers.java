package Tests;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {
    @Test
    public void removeDuplicate(){
        int[] nums={1,1,2};
        Set<Integer> numSet= new HashSet<Integer>();

        for(int i : nums)
            numSet.add(i);

        System.out.println(numSet);
    }
}
