package Tests;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingIntegerArray {
    @Test
    public void sortingArray(){
        int arr1[]={1,4,6,2,4,10,5,33,3};
        ArrayList<Integer> arr=new ArrayList<>();
        for(int x: arr1)
            arr.add(x);
        System.out.println("Unsorted List : "+arr);

        ArrayList<Integer> sort=new ArrayList<>(arr.size());
        int least;
        sort.add(arr.get(0));
        arr.remove(0);

        for(int s : arr){

            for(int i=0;i<arr.size()-1;i++){

                if(s<sort.get(i)){
                    sort.add(i,s);
                    break;
                }
                else if(i==sort.size()-1) {
                    sort.add(s);
                    break;
                }
            }
        }
        System.out.println("Sorted List : "+sort);

    }

}


