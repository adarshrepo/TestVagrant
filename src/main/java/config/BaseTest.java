package config;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.Assert;
import responsePojo.TeamPojo;

import javax.xml.ws.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//BaseTest Class :
// Commons methods, Objects etc for the test methods will be written here
// This is the Superclass of All Test classes and "AllMethods" class.

public class BaseTest {
public JsonParser parser;
public Gson gson ;
public TeamPojo response=new TeamPojo();
public Properties prop;

//Converts string data from testData file to Json format and stores in TeamPojo Class *********
    public void apiDefinition(String playerData){
    parser= new JsonParser();
    gson = new Gson();
    try {
        playerData = playerData.replace("price-in-crores", "priceInCrores");
        JsonObject res = parser.parse(playerData).getAsJsonObject();
        TeamPojo resPojo = gson.fromJson(res, TeamPojo.class);
        response = resPojo;
    }
    catch (Exception e){
        Assert.fail("Json Data conversion to pojo failed with  : "+e.getMessage());
    }
}
// Gets value of the input key from the config.properties file *************
    public String getProperty(String key) {
        prop = new Properties();
        try {
            prop.load(new FileInputStream("src/main/java/config/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(key);
    }



}
