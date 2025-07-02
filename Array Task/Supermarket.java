class Supermarket {

    static String perfumes[] = {"Chanel No.5", "Dior Sauvage", "Armani Code", "CK One", "Versace Eros","Gucci Bloom", "Fogg Fresh", "Axe Signature", "Park Avenue", "Wild Stone"};
	                          

    static String groceries[] = {"Rice", "Wheat Flour", "Sugar", "Salt", "Cooking Oil","Toor Dal", "Chana Dal", "Tea Powder", "Coffee", "Biscuits"};
     
	 

    static String cosmetics[] = {"Lipstick", "Foundation", "Compact Powder", "Eyeliner", "Mascara", "Nail Polish", "Face Cream", "Body Lotion", "Shampoo", "Face Wash"};
        
    

    public static void main(String[] supermarketItems) {
        System.out.println("The number of Perfumes available are: " + perfumes.length);
        System.out.println(perfumes[0] + " " + perfumes[1] + " " + perfumes[2] + " " + perfumes[3] + " " + perfumes[4] + " "+ perfumes[5] + " " + perfumes[6] + " " + perfumes[7] + " " + perfumes[8] + " " + perfumes[9]);
                

        System.out.println("The number of Groceries available are: " + groceries.length);
        System.out.println(groceries[0] + " " + groceries[1] + " " + groceries[2] + " " + groceries[3] + " " + groceries[4] + " "+ groceries[5] + " " + groceries[6] + " " + groceries[7] + " " + groceries[8] + " " + groceries[9]);
               

        System.out.println("The number of Cosmetics available are: " + cosmetics.length);
        System.out.println(cosmetics[0] + " " + cosmetics[1] + " " + cosmetics[2] + " " + cosmetics[3] + " " + cosmetics[4] + " " + cosmetics[5] + " " + cosmetics[6] + " " + cosmetics[7] + " " + cosmetics[8] + " " + cosmetics[9]);
               
    }
}
