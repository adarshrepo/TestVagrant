package Tests;

import org.testng.annotations.Test;

public class SearchInsertposition {
    @Test
    public void searchInsert() {
        int[] nums={1,3};
        int target=2;
        int output=0;
        if(target>nums[nums.length-1]) {
            System.out.println(nums.length);
            return;
        }

        for(int i=0;i<=nums.length-1;i++){
            if(target<=nums[i]){
                output=i;
                break;
            }
        }
        System.out.println(output);
    }
}
