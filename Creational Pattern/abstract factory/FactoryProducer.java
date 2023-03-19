public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        
        if(choice.equalsIgnoreCase("Review"))
        return new ReviewFactory();

        if(choice.equalsIgnoreCase("Travel"))
        return new TravelFactory();

        if(choice.equalsIgnoreCase("Expendeture"))
        return new ExpensesFactory();

        return null;
    }
}
