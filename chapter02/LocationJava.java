package chapter02;

import java.util.HashMap;
import java.util.Map;

public class LocationJava{
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public LocationJava(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap();
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap(exits);
    }

    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
