package responsePojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class TeamPojo {
    public String name;
    public String location;
    public ArrayList<Player> player;
}
