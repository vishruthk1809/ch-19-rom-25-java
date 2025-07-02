class HotelMenu {

    static String starters[] = {"Gobi Manchurian", "Paneer Tikka", "Chicken Lollipop", "Veg Spring Rolls", "Crispy Corn"};
    static String mainItems[] = {"Butter Chicken", "Paneer Butter Masala", "Veg Biryani", "Chicken Biryani", "Dal Makhani"};
    static String desserts[] = {"Gulab Jamun", "Rasgulla", "Ice Cream", "Fruit Salad", "Chocolate Brownie"};
    static String beverages[] = {"Mango Lassi", "Sweet Lime Juice", "Masala Chai", "Cold Coffee", "Filter Coffee"};
    static String specials[] = {"Thali Deluxe", "Sizzler", "Kebab Platter", "Tandoori Platter", "Chef's Special Curry"};

    public static void main(String[] menuItems) {

        System.out.println("The number of Starters added are: " + starters.length);
        System.out.println(starters[0] + " " + starters[1] + " " + starters[2] + " " + starters[3] + " " + starters[4]);

        System.out.println("The number of Main  items added are: " + mainItems.length);
        System.out.println(mainItems[0] + " " + mainItems[1] + " " + mainItems[2] + " " + mainItems[3] + " " + mainItems[4]);

        System.out.println("The number of Desserts added are: " + desserts.length);
        System.out.println(desserts[0] + " " + desserts[1] + " " + desserts[2] + " " + desserts[3] + " " + desserts[4]);

        System.out.println("The number of Beverages added are: " + beverages.length);
        System.out.println(beverages[0] + " " + beverages[1] + " " + beverages[2] + " " + beverages[3] + " " + beverages[4]);

        System.out.println("The number of Specials added are: " + specials.length);
        System.out.println(specials[0] + " " + specials[1] + " " + specials[2] + " " + specials[3] + " " + specials[4]);

        
    }
}
