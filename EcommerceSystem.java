import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EcommerceSystem {
    public static void main(String[] args) {
        DecimalFormat nono  = new DecimalFormat("0.000");

        //Create an electronic product with these specifications
            Product p1 = new ElectronicProduct(1,"SmartPhone",599.99F,"Samsung",1);

            //Create a clothing product with these specifications
            Product p2 = new ClothingProduct(2,"T-Shirt", 19.99F,"Medium","Cotton");

            //Create a book product with these specifications
            Product p3 = new BookProduct(3,"OOP",39.99F,"O'Reilly","X Publications");

            //Create a customer with your data: (take it as input from the user)
        int customerId = Integer.parseInt(JOptionPane.showInputDialog("What is your ID?"));

        System.out.println(customerId);
        String customerName = JOptionPane.showInputDialog("What is your name?");
        String customerAddress = JOptionPane.showInputDialog("What is your Address?");
            Customer cu1 = new Customer(customerId,customerName,customerAddress);


        int n = Integer.parseInt(JOptionPane.showInputDialog("How Many Products That You Want To Add To Cart?"));
        Cart cart =new Cart(customerId,Math.abs(n));
        for(int i=0;i<Math.abs(n);i++){
            int chosen = Integer.parseInt(JOptionPane.showInputDialog("which product would you like to add? \n 1-SmartPhone \n 2-T-shirt \n 3-OOP"));
            switch (chosen){
                case 1:
                    Cart.addProduct(p1,i);
                    break;
                case 2:
                    Cart.addProduct(p2,i);
                    break;
                case 3:
                    Cart.addProduct(p3,i);
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "invalid input",
                            "wrong input",
                            JOptionPane.ERROR_MESSAGE);
                    n=n-1;
                    break;
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "your total price is :"+nono.format(Cart.calcPrice())+"USD",
                "retail information",
                JOptionPane.INFORMATION_MESSAGE);
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to place this order?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            Cart.printer(customerId);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    " you will be able to Remove Order",
                    "removing information",
                    JOptionPane.WARNING_MESSAGE);
            int index = Integer.parseInt(JOptionPane.showInputDialog("What Product You Want To Remove ? \nfrom 1 to "+cart.getnProducts()));

            cart.removeProduct(index-1);
            JOptionPane.showMessageDialog(
                    null,
                    " order has been removed successfully",
                    "successful operation",
                    JOptionPane.PLAIN_MESSAGE);
            Cart.printer(customerId);
        }
        JOptionPane.showMessageDialog(
                null,
                "لقد ذهبت إلى أبعد الحدود معنا، فأنت تهتم حقًا بتقديم الأفضل لنا، شكرًا لك من أعماق قلوبنا\n",
                "رسالة شكر 💕",
                JOptionPane.PLAIN_MESSAGE);
    }
}




































