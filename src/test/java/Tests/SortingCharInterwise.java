package Tests;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingCharInterwise {
    @Test
    public void sortChar(){
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};

        HashMap<Integer, String> map=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],String.valueOf(s.charAt(i)));
        }
        System.out.println(map);
        Arrays.sort(indices);
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.print(entry.getValue());

        }

    }
}
