public class ElectronicProduct extends Product {
    protected String brand;
    protected int warrantyPeriod;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    //constructor

    public ElectronicProduct(int productID, String name, float price, String brand, int warrantyPeriod) {
        super(productID, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setProductId(int i) {
    }
}
