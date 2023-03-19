public class ReviewFactory extends AbstractFactory{
  
    @Override
    public Review getReviewinTotal(String review) {
        // TODO Auto-generated method stub
        if(review ==  null)
        return null;
        
        if(review.equalsIgnoreCase("Indianfood"))
        return new IndianFood();

        if(review.equalsIgnoreCase("NorthIndianPlace"))
        return new NorthIndianPlace();

        return null;
    }
    @Override
    Travel getTravelpackage(String travel) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    Expendeture getExpensespackage(String expenses) {
        // TODO Auto-generated method stub
        return null;
    }
}
