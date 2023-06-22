package Tests;

import config.ReadExcel;
import config.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import validationMethods.AllMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Test Script BaseClass *****************
public class TeamValidations extends BaseTest {
    public String team="RCB";
    public AllMethods method = new AllMethods();

//    Test method to check the max number of foreign players ************
    @Test(dataProvider = "testData",priority = 1)
    public void foreignPlayerLimit(String playerData){
        apiDefinition(playerData);
        method.foreignPlayerRatio(response);
    }
//    Test method to check the wicketkeeper count***************
    @Test(priority = 2)
    public void wicketKeeperAvailablity(){

        method.wicketKeeperAvailability(response);
    }
//    Reads testdata file in xlsx format and returns the values *********
    @DataProvider(name = "testData")
    public Object[][] testDataValues() throws IOException {
        List<String> columnList = new ArrayList<>(Arrays.asList("playerData"));
        return ReadExcel.readTestData("Sheet 1", team, columnList);
    }
}
