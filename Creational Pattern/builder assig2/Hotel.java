
public class Hotel {

//    public static void main(String[] args) {
//        Item i = new Item("farm-delight" , "grill-sandwich" , "mexican-burger");
//        System.out.println(i);
//    }

    public static void main(String[] args) {
        Item i = new ItemBuilder().setSandwich("falafal").getItem();
        System.out.println(i);
    }

}
