import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String name;
    private List<Observer> observers = new ArrayList<>();
    private double rating;
    
    public Hotel(String name) {
        this.name = name;
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void setRating(double rating) {
        this.rating = rating;
        notifyObservers();
    }
    
    public double getRating() {
        return rating;
    }
    
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, rating);
        }
    }
}

interface Observer {
    void update(String name, double rating);
}

class Reviewer implements Observer {
    private String name;
    
    public Reviewer(String name) {
        this.name = name;
    }
    
    public void update(String name, double rating) {
        System.out.println("Notification for " + this.name + ": " + name + " has a new rating of " + rating);
    }
}

public class HotelReviewSystem {
    public static void main(String[] args) {
        
        Hotel hotel = new Hotel("Grand Hotel");
        
        
        Reviewer reviewer1 = new Reviewer("Alice");
        Reviewer reviewer2 = new Reviewer("Bob");
        Reviewer reviewer3 = new Reviewer("Charlie");
        
        
        hotel.addObserver(reviewer1);
        hotel.addObserver(reviewer2);
        hotel.addObserver(reviewer3);
        
        hotel.setRating(4.5);
        
        hotel.removeObserver(reviewer2);
        
        hotel.setRating(5.0);
    }
}
