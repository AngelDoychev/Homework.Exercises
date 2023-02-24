package Fundametals.ObjectsAndClasses.Exercises.AdvertisementMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Sentence {

    private List<String> phrases;
    private List<String> events;
    private List<String> authors;
    private List<String> cities;

    public Sentence(List<String> phrases, List<String> events, List<String> authors, List<String> cities) {
        this.phrases = Arrays.asList("Excellent product."
                , "Such a great product."
                , "I always use that product."
                , "Best product of its category."
                , "Exceptional product."
                , "I can’t live without this product.");
        this.events = Arrays.asList(
                "Now I feel good."
                , "I have succeeded with this product."
                , "Makes miracles. I am happy of the results!"
                , "I cannot believe but now I feel awesome."
                , "Try it yourself, I am very satisfied."
                , "I feel great!");
        this.authors = Arrays.asList(
                "Diana"
                , "Petya"
                , "Stella"
                , "Elena"
                , "Katya"
                , "Iva"
                , "Annie"
                , "Eva");
        this.cities = Arrays.asList(
                "Burgas"
                , "Sofia"
                , "Plovdiv"
                , "Varna"
                , "Ruse");

    }


    public String getPhrases(int phrasesIndex) {
        return this.phrases.get(phrasesIndex);
    }

    public String getEvents(int eventsIndex) {
        return this.events.get(eventsIndex);
    }

    public String getAuthors(int authorsIndex) {
        return this.authors.get(authorsIndex);
    }

    public String getCities(int citiesIndex) {
        return this.cities.get(citiesIndex);
    }

}
