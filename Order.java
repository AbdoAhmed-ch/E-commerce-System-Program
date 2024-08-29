class Order {
    private int customerId;
    private static int orderId;
    private static Product[] products;
    private static double totalPrice;

    public Order(int customerId, int orderId, Product[] products) {
        this.customerId = Math.abs(customerId);
        Order.orderId = Math.abs(orderId);
        Order.products = products;
        totalPrice = cTotal();
    }

    private double cTotal() {
        double total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public static void priOrd(int id) {
        System.out.println("Order ID: " +"25544-88748-51477");
        System.out.println("Customer ID: " + id);
        System.out.println("Products:");
        for (Product product : products) {
            if (product != null) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
        }
        System.out.println("Total Price:" + totalPrice);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public static int getOrderId() {
        return orderId;
    }

    public static void setOrderId(int orderId) {
        Order.orderId = orderId;
    }

    public static Product[] getProducts() {
        return products;
    }

    public static void setProducts(Product[] products) {
        Order.products = products;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double totalPrice) {
        Order.totalPrice = totalPrice;
    }
}