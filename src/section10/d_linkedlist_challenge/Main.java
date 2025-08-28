package section10.d_linkedlist_challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<City> cities = new LinkedList<>();
        addCity(cities, new City("Hyderabad", 1500));
        addCity(cities, new City("Hyderabad", 1500));
        addCity(cities, new City("Bangalore", 2200));
        addCity(cities, new City("Lucknow", 500));
        addCity(cities, new City("lucknow", 600));
        addCity(cities, new City("Trivandrum", 3000));
        addCity(cities, new City("Gujarat", 1000));
        cities.addFirst(new City("Delhi", 0));
        printCities(cities);

        userInteraction(cities, "M");
    }
    public static void userInteraction(LinkedList<City> cities, String input) {
        Scanner s = new Scanner(System.in);
        ListIterator<City> iterator = cities.listIterator();
        boolean forward = true;
        while(true) {
            switch (input) {
                case "M" -> printMenu();
                case "L" -> printCities(cities);
                case "F" -> {
                    if(!forward) { // For adjusting cursor position on direction change.
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    } else {
                        System.out.println("Next City is Not Available!");
                    }
                }
                case "B" -> {
                    if(forward) { // For adjusting cursor position on direction change.
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    } else {
                        System.out.println("Previous City is Not Available!");
                    }
                }
                default -> {
                    return;
                }
            }
            input = s.nextLine().toUpperCase().substring(0, 1);
        }
    }

    private static void printMenu() {
        System.out.println("""
                        Available actions:
                        (F)orward
                        (B)ackward
                        (L)ist Places
                        (M)enu
                        (Q)uit
                        Enter value:""");
    }

    public static void addCity(LinkedList<City> cities, City city) {
        int indexToInsert = 0;
        for(var element : cities) {
            if(city.getName().equalsIgnoreCase(element.getName())) {
                System.out.println("Duplicate city: " + city);
                return;
            }
            if(city.getDistanceFromDelhi() > element.getDistanceFromDelhi()) {
                indexToInsert++;
            }
        }
        cities.add(indexToInsert, city);
    }
    public static void printCities(LinkedList<City> cities) {
        for(var city : cities) {
            System.out.println(city);
        }
    }
    public static void iterateCity() {

    }
    public static void sortCitiesByDistance(LinkedList<City> cities) {
        for(int i = 1; i<cities.size(); i++) {
            ListIterator<City> iterator = cities.listIterator(1);
            City previousCity = cities.peek();
            while (iterator.hasNext()) {
                City currCity = iterator.next();
                if (previousCity.getDistanceFromDelhi() > currCity.getDistanceFromDelhi()) {
                    iterator.previous();
                    iterator.remove();
                    iterator.previous();
                    iterator.add(currCity);
                }
                previousCity = currCity;
            }
        }
    }
    public static void printItineraryFromStart(LinkedList<City> cities) {
        ListIterator<City> iterator = cities.listIterator(1);
        City previousCity = cities.getFirst();
        System.out.println("Trip Starts from " + previousCity.getName());
        while(iterator.hasNext()) {
            City currCity = iterator.next();
            int distance = currCity.getDistanceFromDelhi() - previousCity.getDistanceFromDelhi();
            System.out.printf("--> %s to %s is %d%n", previousCity.getName(), currCity.getName(), distance);
            previousCity = currCity;
        }
        System.out.println("Trip ends at " + previousCity.getName());
    }
    public static void printItineraryInReverse(LinkedList<City> cities) {
        ListIterator<City> iterator = cities.listIterator(cities.size()-1);
        City previousCity = cities.getLast();
        System.out.println("Trip Starts from " + previousCity.getName());
        while(iterator.hasPrevious()) {
            City currCity = iterator.previous();
            int distance = previousCity.getDistanceFromDelhi() - currCity.getDistanceFromDelhi();
            System.out.printf("--> %s to %s is %d%n", previousCity.getName(), currCity.getName(), distance);
            previousCity = currCity;
        }
        System.out.println("Trip Ends at " + previousCity.getName());
    }
}