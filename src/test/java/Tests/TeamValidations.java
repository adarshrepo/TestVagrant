package Tests;

import config.ReadExcel;
import config.RestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.ws.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TeamValidations extends RestBase {
    @Test(dataProvider = "testData")
    public void validatePlayerRatios(String playerData){
        String res=playerData;
        System.out.println(res);
    }

    @DataProvider(name = "testData")
    public Object[][] testDataValues() throws IOException {
        List<String> columnList = new ArrayList<>(Arrays.asList("playerData"));
        return ReadExcel.readTestData("Sheet 1", "RCB", columnList);
    }
}
