import java.util.ArrayList;
import java.util.List;

class Review {
   private String state;

   public Review(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }	
}

class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Review saveStateToReview(){
      return new Review(state);
   }

   public void getStateFromReview(Review memento){
      state = memento.getState();
   }
}

class CareTaker {
   private List<Review> mementoList = new ArrayList<Review>();

   public void add(Review state){
      mementoList.add(state);
   }

   public Review get(int index){
      return mementoList.get(index);
   }
}

public class MementoPatternDemo {
   public static void main(String[] args) {
   
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State is to Reveiew Ahmedabad");
      originator.setState("State is to Reveiew Vadodara");
      careTaker.add(originator.saveStateToReview());
      
      originator.setState("State is to Reveiew Surat");
      careTaker.add(originator.saveStateToReview());
      
      originator.setState("State is to Review Bhuj");
      System.out.println("Current State: " + originator.getState());		
      
      originator.getStateFromReview(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      System.out.println("Vadodara is 2nd state of memento but first saved state in caretaker");
      originator.getStateFromReview(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
      System.out.println("Surat is 3rd state of memento but second saved state in caretaker");
   }
}