package Fundametals.ObjectsAndClasses.Exercises.AdvertisementMessage;

import Fundametals.ObjectsAndClasses.Exercises.AdvertisementMessage.Sentence;

import java.util.*;

public class AdvertisementMessageMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sentenceCount = Integer.parseInt(scanner.nextLine());
        List<String> phrases = new ArrayList<>();
        List<String> events = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        Sentence sentence = new Sentence(phrases, events, authors, cities);
        for (int i = 0; i < sentenceCount; i++) {
            Random random = new Random();
            int phrasesIndex = random.nextInt(6);
            int eventsIndex = random.nextInt(6);
            int authorsIndex = random.nextInt(8);
            int citiesIndex = random.nextInt(5);
            System.out.printf("%s %s %s – %s%n", sentence.getPhrases(phrasesIndex), sentence.getEvents(eventsIndex),
                    sentence.getAuthors(authorsIndex), sentence.getCities(citiesIndex));
        }
    }
}
