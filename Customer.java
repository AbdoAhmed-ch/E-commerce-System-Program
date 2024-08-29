public class Customer {
    private int customerId;
    private String name;
    private String address;

    public int getCustomerId() {
        return  Math.abs(customerId);
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //constructor

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}
