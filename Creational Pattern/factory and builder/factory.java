import java.util.Scanner;

class ReviewFactory{
  
    
    public Review getReviewinTotal(String review) {
        if(review ==  null)
        return null;
        
        if(review.equalsIgnoreCase("Indianfood"))
        return new IndianFood();

        if(review.equalsIgnoreCase("NorthIndianPlace"))
        return new NorthIndianPlace();

        return null;
    }
  
}

interface Review{
    int rating = 0;
    void opinion();
}


class IndianFood implements Review {
    @Override
    public void opinion() {
        System.out.println("Indian Food Review");
    }
}
class NorthIndianPlace implements Review{
    @Override
    public void opinion() {
        System.out.println("Northern place review ");
    }
}


public class factory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ReviewFactory reviewFactory = new ReviewFactory();
        System.out.println("Enter the place to review");
        String s = sc.next();
        Review r1 = reviewFactory.getReviewinTotal(s);
        r1.opinion();
    }
}