
//Eager instance creation
class ReviewEager {
  static ReviewEager obj = new ReviewEager();
  private ReviewEager(){
      System.out.println("Eager Review of Instance");
  }

  public static ReviewEager getInstance(){
      return obj;
  }
}

//Lazy instance creation
class ReviewLazy{
  public static ReviewLazy obj;
  private ReviewLazy(){
      System.out.println("Lazy Review of Instance instance");
  }
  public static ReviewLazy getInstance(){
      if (obj == null){
          obj = new ReviewLazy();
      }
      return obj;
  }
}


public class SingletonExampletravelling {
  public static void main(String[] args) {

      //Eager
      ReviewEager obj1 = ReviewEager.getInstance();
      ReviewEager obj2 = ReviewEager.getInstance();

      //Lazy
      ReviewLazy obj3 = ReviewLazy.getInstance();
      ReviewLazy obj4 = ReviewLazy.getInstance();

  }
}
