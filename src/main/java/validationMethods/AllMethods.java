package validationMethods;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import config.RestBase;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import responsePojo.Player;
import responsePojo.TeamPojo;

public class AllMethods extends RestBase {

    public  SoftAssert soft = new SoftAssert();
    public void foreignPlayerRatio(TeamPojo playerData){
    int count=0;
    for(Player pData : playerData.getPlayer()){
        if(!pData.getCountry().equalsIgnoreCase("India")) {
            count = count + 1;
            if(count > 4)
                soft.fail("FAILED : Team has more than 4 Foreign Players");
            break;
        }
    }
    if(count<=4)
        System.out.println("PASSED : Team satisfies the max Foreign Players limit");

    }

    public void wicketKeeperAvailability(TeamPojo playerData){
        boolean check=false;
        for(Player pData : playerData.getPlayer()){
            if(pData.getRole().equalsIgnoreCase("Wicket-keeper")){
                check=true;
                System.out.println("PASSED : Wicket keeper present in team");
                break;
            }
        }
        soft.assertTrue(check,"FAILED : No wicket keeper present in team");

    }
}
