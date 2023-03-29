interface Review {
   void reviewed();
}

class Expenses implements Review {

   @Override
   public void reviewed() {
      System.out.println("Expenses reviewed()");
   }
}


 class Loaded implements Review {

   @Override
   public void reviewed() {
      System.out.println("Loaded reviewed()");
   }
}

 class Hotel implements Review {

   @Override
   public void reviewed() {
      System.out.println("Hotel reviewed()");
   }
}


 class ReviewMaker {
   private Review circle;
   private Review rectangle;
   private Review square;

   public ReviewMaker() {
      circle = new Hotel();
      rectangle = new Expenses();
      square = new Loaded();
   }

   public void reviewedHotel(){
      circle.reviewed();
   }
   public void reviewedExpenses(){
      rectangle.reviewed();
   }
   public void reviewedLoaded(){
      square.reviewed();
   }
}


public class FacadePatternDemo {
   public static void main(String[] args) {
      ReviewMaker shapeMaker = new ReviewMaker();

      shapeMaker.reviewedHotel();
      shapeMaker.reviewedExpenses();
      shapeMaker.reviewedLoaded();		
   }
}