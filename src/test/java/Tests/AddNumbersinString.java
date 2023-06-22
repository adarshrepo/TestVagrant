package Tests;

import org.testng.annotations.Test;

public class AddNumbersinString {
    @Test
    public void addNumbers(){
        String str="1ad2sda7ads10c3d110",value ="0";
        int sum=0;
        
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)) {
                value+=String.valueOf(c);
            }
            else{
                sum+=Integer.parseInt(value);
                value="0";
            }

        }
        sum+=Integer.parseInt(value);
        System.out.println(sum);

    }
}
