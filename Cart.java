import javax.swing.*;
import java.util.ArrayList;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Cart {
    static DecimalFormat nono  = new DecimalFormat("0.000");

    private int customerId;
    private static int nProducts;
    private static int counter = 0;
    private static Product[] enrolledProducts;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        enrolledProducts = new Product[Math.abs(Math.abs(nProducts))];
    }


    public static void setEnrolledProducts(Product[] enrolledProducts) {
        Cart.enrolledProducts = enrolledProducts;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return Math.abs(nProducts);
    }

    public static void setnProducts(int nProducts) {
        Cart.nProducts = Math.abs(nProducts);
        enrolledProducts = new Product[Math.abs(nProducts)];
    }


    public static void addProduct(Product product, int index) {
        if (index >= 0 && index < Math.abs(nProducts)) {
            enrolledProducts[index] = product;
        } else {
            System.out.println("Invalid id");
        }
    }

    public void removeProduct(int INDEX) {
        if (INDEX >= 0 && INDEX < Math.abs(nProducts)) {
            enrolledProducts[INDEX] = null;
        } else {
            System.out.println("Invalid id");
        }
    }

    public void placeOrder() {
        System.out.println("ID " + customerId + ". Total price :" + calcPrice());
    }

    public static double calcPrice() {
        double totalP = 0;
        for (Product product : enrolledProducts) {
            if (product != null) {
                totalP += product.getPrice();
            }
        }
        return totalP;
    }
    public static void printer(int id) {
        StringBuilder lev = new StringBuilder();
        lev.append("Here's your order's summary\n");
        lev.append("Order ID: 40-54242-9784\n");
        lev.append("Customer ID: ").append(Math.abs(id)).append("\n");
        lev.append("Products:\n");
        for (Product product : enrolledProducts) {
            if (product != null) {
               lev.append("- ").append(product.getName()).append(" (").append(product.getPrice()).append(" $)\n");
            }
        }
       lev.append("Total Price: ").append(nono.format(calcPrice())).append(" USD\n");
        JOptionPane.showMessageDialog(null, lev.toString());
    }
}
