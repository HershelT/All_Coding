public class Restaurant {
    public static void main(String[] args) {

        Product productOne = new Product();
        Product productTwo = new Product( "Can Opener",  999);
        Product productThree = new Product("Hotdog", 200);

        Hamburger classic = new Hamburger("Classic", 799, "White Bread", "Cow");
        SideDish normal = new SideDish("Caesar Salad", 398, "Romanian", "Caesar dressing");
        System.out.println(classic);
        System.out.println(classic.getBread());
        System.out.println(classic.getMeat());
        productOne.setMyPrice(1299);
        productOne.setMyName("Cheese Burger");
        System.out.println(normal);
        System.out.println("Type of Lettuce: " + normal.getType_of_lettuce() + ", Type of Dressing: " + normal.getDressing());
        System.out.println(productOne);
        System.out.println(productTwo);
        System.out.println(productThree);

    }


}