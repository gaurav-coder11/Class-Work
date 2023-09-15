/*
Create a class Customer where class varibles are 
(Custname,ProductName,ProductQuantity,TotalAmount )use 
appropriate getter setters for the same
*/


class Customer {
    private String custName;
    private String productName;
    private int productQuantity;
    private double totalAmount;
    
    // Getter and setter methods for custName

    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustName() {
        return custName;
    }
    
    
    
    // Getter and setter methods for productName

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    
    
    
    // Getter and setter methods for productQuantity
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
        
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    
    
    
    // Getter and setter methods for totalAmount
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
      
}

public class CustomerDemo {
    public static void main(String[] args) {
        // Creating an instance of the Customer class
        Customer cust = new Customer();
        
        // Setting customer details using setter methods
        cust.setCustName("Gaurav");
        cust.setProductName("Paragon sandals");
        cust.setProductQuantity(2);
        cust.setTotalAmount(1000);
        
        // Printing customer details using getter methods
        System.out.println("Customer Name: " + cust.getCustName());
        System.out.println("Product Name: " + cust.getProductName());
        System.out.println("Product Quantity: " + cust.getProductQuantity());
        System.out.println("Total Amount: " + cust.getTotalAmount());
    }
}
