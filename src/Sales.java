import javax.swing.JOptionPane;

public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

    public static void main(String[] args) {
        int numBuying;
        double price, discount, salesTax, subtotal, taxTotal, total;

        price = Double.parseDouble(JOptionPane.showInputDialog("Whats the price for the item? (XX.XX)"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("What Discount percentage? (No % sign)"));
        numBuying = Integer.parseInt(JOptionPane.showInputDialog("How many are you buying?"));
        salesTax = Double.parseDouble(JOptionPane.showInputDialog("What's the tax %? (no % sign)"));

        subtotal = price * numBuying;
        taxTotal = subtotal * (salesTax/100);
        total = (subtotal + taxTotal) * (1-(discount/100.0));
        discount = subtotal * (discount / 100);

        JOptionPane.showMessageDialog(null, "Subtotal: $" + subtotal + "\n" + "Tax: $" + taxTotal + "\n" + "Discount: $" + discount + "\n" + "Total: $" + total);

        System.exit(0);
    }
}
