// Define a class named Customer
public class Customer {
    // Declare private fields for customer information
    private String custName;
    private String productName;
    private int productQuantity;
    private double totalAmount;

    // Getter method for customer name
    public String getCustName() {
        return custName;
    }

    // Setter method for customer name
    public void setCustName(String custName) {
        this.custName = custName;
    }

    // Getter method for product name
    public String getProductName() {
        return productName;
    }

    // Setter method for product name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter method for product quantity
    public int getProductQuantity() {
        return productQuantity;
    }

    // Setter method for product quantity
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    // Getter method for total amount
    public double getTotalAmount() {
        return totalAmount;
    }

    // Setter method for total amount
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

// Define a class named CustomerDemo
public class CustomerDemo {
    public static void main(String[] args) {
        // Create an instance of the Customer class
        Customer cust = new Customer();

        // Set customer information using setter methods
        cust.setCustName("Gaurav");
        cust.setProductName("Paragon sandals");
        cust.setProductQuantity(2);
        cust.setTotalAmount(1000); // Corrected method call

        // Display customer information using getter methods
        System.out.println("Customer Name: " + cust.getCustName());
        System.out.println("Product Name: " + cust.getProductName());
        System.out.println("Product Quantity: " + cust.getProductQuantity());
        System.out.println("Total Amount: " + cust.getTotalAmount());
    }
}
