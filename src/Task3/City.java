package Task3;

import java.util.List;
import java.util.ArrayList;

public class City {
    String name;
    String state;
    List<TouristPlace> touristPlaces;

    public City(String name, String state){
        this.name = name;
        this.state = state;
        this.touristPlaces = new ArrayList<>();
    }
}
