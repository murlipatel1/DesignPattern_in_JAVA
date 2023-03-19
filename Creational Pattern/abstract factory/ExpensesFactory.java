public class ExpensesFactory extends AbstractFactory{

    @Override
    Review getReviewinTotal(String review) {
        // TODO Auto-generated method stub
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
        if(expenses ==  null)
        return null;
        
        if(expenses.equalsIgnoreCase("LocalTravel"))
        return new LocalTravel();

        if(expenses.equalsIgnoreCase("NationalTravel"))
        return new NationalTravel();

        return null;
    }
}
