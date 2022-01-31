public class Hamburger extends Product{
    private String bread;
    private String meat;

    public Hamburger(String name, int price, String Bread, String Meat) {
        super(name, price);
        this.bread = Bread;
        this.meat = Meat;

    }

    public Hamburger(String name, int price) {
        super(name, price);
    }
    public String getBread() {
        return bread;
    }

    public void setBread(String Bread) {
        this.bread = Bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String Meat) {
        this.meat = Meat;
    }
}