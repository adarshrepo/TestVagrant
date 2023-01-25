package Tests;

import config.ReadExcel;
import config.RestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import responsePojo.TeamPojo;
import validationMethods.AllMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TeamValidations extends RestBase {
    AllMethods method;
    @Test(dataProvider = "testData")
    public void teamValidations(String playerData){
        method=new AllMethods();
        TeamPojo res= apiDefinition(playerData);
        method.foreignPlayerRatio(res);
        method.wicketKeeperAvailability(res);
    }
    @DataProvider(name = "testData")
    public Object[][] testDataValues() throws IOException {
        List<String> columnList = new ArrayList<>(Arrays.asList("playerData"));
        return ReadExcel.readTestData("Sheet 1", "RCB", columnList);
    }
}
