package validationMethods;

import config.BaseTest;
import org.testng.asserts.SoftAssert;
import responsePojo.Player;
import responsePojo.TeamPojo;

//AllMethods class :
// All method definitions will be written here
// Methods here can be called in test classes by creating object of this class and can be re-used

public class AllMethods extends BaseTest {

    public  SoftAssert soft = new SoftAssert();
    public void foreignPlayerRatio(TeamPojo playerData){
    int count=0;
    int limit=Integer.parseInt(getProperty("foreignPlayerLimit"));
    for(Player pData : playerData.getPlayer()){
        if(!pData.getCountry().equalsIgnoreCase("India")) {
            count = count + 1;
            if(count > limit)
                soft.fail("FAILED : Team has more than 4 Foreign Players");
            break;
        }
    }
    if(count<=limit)
        System.out.println("PASSED : Team satisfies the max Foreign Players limit");

    }

    public void wicketKeeperAvailability(TeamPojo playerData){
        int count=0;
        int reqWkeeper=Integer.parseInt(getProperty("wicketKeeper"));
        for(Player pData : playerData.getPlayer()){
            if(pData.getRole().equalsIgnoreCase("Wicket-keeper")){
                count=count+1;
                if(count>=reqWkeeper) {
                    System.out.println("PASSED : Wicket keeper present in team = "+count);
                    break;
                }
            }
        }
        soft.assertTrue(count>=reqWkeeper,"FAILED : No wicket keeper present in team");

    }
}
