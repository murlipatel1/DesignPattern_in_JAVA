public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory travelFactory = FactoryProducer.getFactory("Travel");

        Travel travel1 = travelFactory.getTravelpackage("LocalTravel");
        
        travel1.locationsystem();

        AbstractFactory expensesFactory = FactoryProducer.getFactory("Expendeture");

        Expendeture expense1 = expensesFactory.getExpensespackage("LocalTravel");
        
        expense1.expenses();


    }
}

