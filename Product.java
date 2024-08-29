public class Product {
    protected int productID;
    protected String name;
    protected float price;
    private static Product[]enrolledProducts;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = Math.abs(productID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }
    //constructor

    public Product(int productID, String name, float price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }
}
