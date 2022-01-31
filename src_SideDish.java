public class SideDish extends Product {
    private String type_of_lettuce;
    private String dressing;

    public SideDish(String name, int price, String lettuceType, String dressing) {
        super(name, price);
        this.type_of_lettuce = lettuceType;
        this.dressing = dressing;

    }
    public SideDish(String name, int price) {
        super(name, price);
    }
    public SideDish(String lettuceType, String dressing) {
        this.type_of_lettuce = lettuceType;
        this.dressing = dressing;
    }

    public String getType_of_lettuce() {
        return type_of_lettuce;
    }

    public void setType_of_lettuce(String type_of_lettuce) {
        this.type_of_lettuce = type_of_lettuce;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }
}