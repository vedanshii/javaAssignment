public class Customer {
    private int id;
    private String name;
    private String addr;

    public Customer(int id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
    public String getDetails(){
        return id+name+addr+" game hogaya.";
    }


}
