 class Item {
    String pizza;
    String sandwich;
    String burger;

    public Item(String pizza, String sandwich, String burger) {
        super();
        this.pizza = pizza;
        this.sandwich = sandwich;
        this.burger = burger;
    }public String toString(){return "Item [ pizza = " + pizza + " ,sandwich = " + sandwich + " , burger = " + burger + "] ";}}

 class ItemBuilder {
        String pizza;
        String sandwich;
        String burger;

        public ItemBuilder setPizza(String pizza) {
            this.pizza = pizza;
            return this;
        }

        public ItemBuilder setSandwich(String sandwich) {
            this.sandwich = sandwich;
            return this;
        }

        public ItemBuilder setBurger(String burger) {
            this.burger = burger;
            return this;
        }

        public Item getItem() {
            return new Item(pizza, sandwich, burger);
        }
    }

    

    public class builder {
        public static void main(String[] args) {
            Item i = new ItemBuilder().setPizza("Thin crust and cheezy").getItem();
            System.out.println(i);
        }
}