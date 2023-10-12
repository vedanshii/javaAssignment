public class Customer {
    private int id;
    private String name;
    private String addr;

    public Customer(int id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "id=" + id +", name='" + name + '\'' + ", addr='" + addr + '\'' + '}';
    }


}
