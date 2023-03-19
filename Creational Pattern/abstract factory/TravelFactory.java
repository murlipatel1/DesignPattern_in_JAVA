public class TravelFactory extends AbstractFactory{

    @Override
    Review getReviewinTotal(String review) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    Travel getTravelpackage(String travel) {
        // TODO Auto-generated method stub
        if(travel ==  null)
        return null;
        
        if(travel.equalsIgnoreCase("NorthEasternIndia"))
        return new NorthEasternIndia();

        if(travel.equalsIgnoreCase("WesternIndia"))
        return new WesternIndia();

        return null;
    }

    @Override
    Expendeture getExpensespackage(String expenses) {
        // TODO Auto-generated method stub
        return null;
    }
}
