package edu.faf.oop.Menu;

import edu.faf.oop.RootClass.Root;

public class Dishes extends Root {
    protected String[] dishes = new String[30];
    protected String menuType;

    public Dishes(String menuType, String itemId) {
        super(itemId);
        this.menuType = menuType;
    }

    public void fillList() {
        dishes[0] = "Hamburger";
        dishes[1] = "Sandwich";
        dishes[2] = "Taco";
        dishes[3] = "Burrito";

        dishes[4] = "Milk Shake";
        dishes[5] = "Coca cola";
        dishes[6] = "Coffee";
        dishes[7] = "Tea";
        dishes[18] = "Orange juice";

        dishes[8] = "Cake";
        dishes[9] = "Tiramisu";
        dishes[10] = "Cookies";

        dishes[11] = "Beef Burger";
        dishes[12] = "Pasta";
        dishes[13] = "Mixed salad";
        dishes[14] = "Chef salad";
        dishes[15] = "Tuna salad";

        dishes[16] = "Chicken soup";
        dishes[17] = "Pasta Fagioli soup";

        dishes[19] = "BBQ Beef";
        dishes[20] = "Beef meals";
    }
    public String getDish(int index) {
        return dishes[index];
    }

   // public boolean checkAvailability(String dish) {
   // }
}
