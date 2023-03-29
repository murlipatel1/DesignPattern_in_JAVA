import java.util.ArrayList;
import java.util.List;

interface Component{
    void review();
    String getreview();
}

class Leaf implements Component{
    String review;
    public Leaf(String review){
        this.review = review;
    }
    public void review() {
        System.out.println("Leaf" + review);
    }

    
    public String getreview() {
        return review;
    }

}

class Composite implements Component{

    String review;

    List<Component> components = new ArrayList<>();

    public Composite(String review){
        super();
        this.review = review;
    }

    public void addreview(Component com) {
        components.add(com);
    }

    public String getreview() {
        String s= "Total review \n";
        for (Component component : components) {
            s += component.getreview() +"\n";  
        }
        return s;
    }

    public void review(){
        System.out.println(" \nComposite"+ review +"Reviews" + getreview());
        System.out.println("Leaf" + review);
        for (Component component : components) {
            component.getreview();
        }
    }

}
public class Composite_test{
    public static void main(String[] args) {
        Component r1 = new Leaf("Review 1 leaf");
        Component r2 = new Leaf("Review 2 leaf");
        Component r3 = new Leaf("Review 3 leaf");
        Component r4 = new Leaf("Review 4 leaf");

        Composite s1 = new Composite("review composite 1");
        Composite s2 = new Composite("review composite 2");

        s1.addreview(r1);
        s1.addreview(r2);

        s2.addreview(r3);
        s2.addreview(r4);

        s1.review();
        s2.review();
    }
}