interface review{
    public void reviewofplace();
    public void reviewoffood();
}

class northindia implements review{

    public void reviewofplace() {
        System.out.println("This is northIndia Place");
        
    }
    public void reviewoffood() {
        System.out.println("This is review of northindian food");
        
    }
}

interface expenses{
    public void totalexpenses();
}

class southindianplace implements expenses{
    public void totalexpenses()
    {
        System.out.println("South India expense is 1000 ");
    }
}

class Adapter implements expenses{
    review re;

    public Adapter(review re){
        this.re=re;
    }
    public void totalexpenses(){
        System.out.println("As adapter the total expense of the northindia is Xrs");
    }
}

public class demo{
    public static void main(String[] args) {
        northindia ni = new northindia();
        southindianplace si = new southindianplace();

        Adapter ad = new Adapter(ni);
        
        ni.reviewoffood();
        ni.reviewofplace();

        si.totalexpenses();

        ad.totalexpenses();
    }
}