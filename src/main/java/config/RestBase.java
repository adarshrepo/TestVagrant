package config;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import responsePojo.TeamPojo;
public class RestBase  {
public JsonParser parser;
public Gson gson ;
public TeamPojo apiDefinition(String playerData){
    parser= new JsonParser();
    gson = new Gson();
    playerData=playerData.replace("price-in-crores","priceInCrores");
    JsonObject res = parser.parse(playerData).getAsJsonObject();
    TeamPojo resPojo = gson.fromJson(res, TeamPojo.class);
    return resPojo;
}
}
