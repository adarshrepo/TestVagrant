package Tests;

import org.testng.annotations.Test;

public class MaxNumberElement {
    @Test
    public void maxElement(){
        int[] arr={1,2,3,4,1,1,2,1,3,4,3};
        int v=0;
        int count=0;
        int max=0;
        int ele=0;
        for(int i=0;i<=arr.length-1;i++) {
            v=arr[i];
            count=1;
            for(int j=i+1;j<=arr.length-1;j++){
                if(v==arr[j])
                    count+=1;
            }
            if(count>max)
                max=count;
            ele=v;

        }
        System.out.println("Max occuring integer :"+ele );
        System.out.println("Max count :"+max );


    }
}
