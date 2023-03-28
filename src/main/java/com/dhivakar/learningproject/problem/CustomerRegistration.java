import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerRegistration {
    private int customerId;
    private String customerName;
    private String email;
    private String password;
    private String address;
    private String contactNumber;
    private String nomineeName;
    private String relationshipWithCustomer;

    // Default constructor
    public CustomerRegistration() {
        this.customerId = (int) (Math.random() * 9000000) + 1000000; // Generates random 7 digit number
    }

    // Parameterized constructor
    public CustomerRegistration(int customerId, String customerName, String email, String password, String address,
                                String contactNumber, String nomineeName, String relationshipWithCustomer) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contactNumber = contactNumber;
        this.nomineeName = nomineeName;
        this.relationshipWithCustomer = relationshipWithCustomer;
    }

    // Main method to execute program
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Create a new CustomerRegistration object and set the input values
            CustomerRegistration customer = new CustomerRegistration();

            System.out.println("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            customer.setCustomerName(customerName);

            System.out.println("Enter Email: ");
            String email = scanner.nextLine();
            customer.setEmail(email);

            System.out.println("Enter Password: ");
            String password = scanner.nextLine();
            customer.setPassword(password);

            System.out.println("Enter Address: ");
            String address = scanner.nextLine();
            customer.setAddress(address);

            System.out.println("Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            customer.setContactNumber(contactNumber);

            System.out.println("Enter Nominee Name: ");
            String nomineeName = scanner.nextLine();
            customer.setNomineeName(nomineeName);

            System.out.println("Enter Relationship with Customer: ");
            String relationshipWithCustomer = scanner.nextLine();
            customer.setRelationshipWithCustomer(relationshipWithCustomer);

            System.out.println("Customer Registration Successful");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName.length() <= 50) {
            this.customerName = customerName;
        } else {
            throw new InputMismatchException("Customer Name cannot be more than 50 characters.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new InputMismatchException("Invalid Email address.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() <= 30) {
            this.password = password;
        } else {
            throw new InputMismatchException("Password cannot be more than 30 characters.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() <= 100) {
            this.address = address;
        } else {
            throw new InputMismatchException("Address cannot be more than 100 characters.");
        }
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if (contactNumber.length() <= 10) {
            this.contactNumber = contactNumber;
        } else {
            throw new InputMismatchException("Contact Number cannot be more than 10 characters.");
        }
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getRelationshipWithCustomer() {
        return relationshipWithCustomer;
    }

    public void setRelationshipWithCustomer(String relationshipWithCustomer) {
        this.relationshipWithCustomer = relationshipWithCustomer;
    }
}
