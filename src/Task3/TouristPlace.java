package Task3;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Collections;
import java.io.Serializable;

public class TouristPlace implements Serializable{
    String name, city;
    String workingHour;
    int entryTicketPrice;
    int noOfRatings;
    float starRating;
    String category;
    List<String> famousFor;
    String review;
    private boolean True;

    public TouristPlace(String name, String workingHour, String city, int entryTicketPrice, String category){
        this.name = name;
        this.workingHour = workingHour;
        this.city = city;
        this.entryTicketPrice = entryTicketPrice;
        this.category = category;
        this.famousFor = new ArrayList<>();
        this.review = review;
        this.noOfRatings = 0;
        this.starRating = 0;
    }

    public TouristPlace() {
    }

    //calculating the total rating.
    public void rate(float... ratings) {
        //calculating total no of stars till now
        for (float rating:ratings) starRating += (rating - starRating) / ++noOfRatings;
    }
    public TouristPlace addFamousFor(String s){
        famousFor.add(s);
        return this;
    }
    //check = place is open or not
    public boolean isPlaceOpen(){
        //Split both the times
        String[] times = workingHour.split(" to ");
        //Parse times
        LocalTime startTime = LocalTime.parse(times[0], DateTimeFormatter.ofPattern("hh:mma"))
                , endTime = LocalTime.parse(times[1], DateTimeFormatter.ofPattern("hh:mma"))
                , currTime = LocalTime.now();
        //startTime.compare(currTime) : -1, 0
        //endTime.compareTo(currTime) : 1, 0
        return startTime.compareTo(currTime) <=0  && endTime.compareTo(currTime) >=0;
    }

    public static TouristPlace newFromUserInput(){
        Scanner scanner = new Scanner(System.in);
        TouristPlace place = new TouristPlace();
        System.out.println("Enter place name: ");
        place.name = scanner.next();
        System.out.println("What are its speciality?");
        place.famousFor = Collections.singletonList(scanner.next());
        System.out.println("Your review: ");
        place.review = scanner.next();
        return place;
    }

    @Override
    public String toString() {
        return "Your place " + name + " is rated " + starRating + " by " + noOfRatings + " users. Its famous for" + famousFor + " and its reviews as rated by user are " + review + " .";
    }
}
