public class Product {
    private static int products = 0;
    private int mySKU;
    private String myName;
    private int myPrice;
    private double displayPrice;

    public Product() {

    }

    public Product(String name, int price) {
        products++;
        mySKU = products;
        myName = name;
        myPrice = price;
    }

    public static int getProducts() {
        return products;
    }

    public int getMySKU() {
        return mySKU;
    }

    public void setMySKU(int mySKU) {
        this.mySKU = mySKU;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyPrice() {
        return myPrice;
    }

    public void setMyPrice(int myPrice) {
        this.myPrice = myPrice;
    }

    @Override
    public String toString() {
        displayPrice = (double) myPrice/100;
        return ("Name: " + myName + ", Price: " + displayPrice);
    }
}