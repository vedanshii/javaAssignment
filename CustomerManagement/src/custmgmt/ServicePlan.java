package custmgmt;

public enum ServicePlan {
    SILVER(1000), GOLD(2000),DIAMOND(5000), PLATINUM(10000);
    private int price;
    ServicePlan(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    @Override
    public String toString() {
        return "ServicePlan{" +
                "price=" + price +
                '}';
    }
}

