package Task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TouristPlace meherangarh = new TouristPlace("Meherangarh", "09:00am to 05:00pm", "Jodhpur",200, "Fort");
        meherangarh.addFamousFor("chill");
        meherangarh.addFamousFor("Old Weapons");

        meherangarh.rate(5,2,4,3,1,5,4);

        System.out.println(meherangarh.starRating);
        System.out.println(meherangarh.isPlaceOpen());
        Menu menu = new Menu();
        menu.show();
    }

}
