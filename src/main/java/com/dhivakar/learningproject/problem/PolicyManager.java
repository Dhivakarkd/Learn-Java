import java.util.ArrayList;

class Policy {
    private String policyNo;
    private String date;
    private String customerId;
    private String customerName;
    private String policyType;
    private String title;
    private String status;
    private double premium;
    private double sumAssured;
    private boolean isNomineeRegistered;
    private String nomineeName;
    private String email;
    private String phone;
    private String nextDueDate;

    // constructor
    public Policy(String policyNo, String date,String customerId, String customerName, String policyType, String title,
                  String status, double premium, double sumAssured, boolean isNomineeRegistered,
                  String nomineeName, String email, String phone, String nextDueDate) {
        this.policyNo = policyNo;
        this.date = date;
        this.customerId = customerId;
        this.customerName = customerName;
        this.policyType = policyType;
        this.title = title;
        this.status = status;
        this.premium = premium;
        this.sumAssured = sumAssured;
        this.isNomineeRegistered = isNomineeRegistered;
        this.nomineeName = nomineeName;
        this.email = email;
        this.phone = phone;
        this.nextDueDate = nextDueDate;
    }

    // getters
    public String getPolicyNo() {
        return policyNo;
    }

    public String getDate() {
        return date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public double getPremium() {
        return premium;
    }

    public double getSumAssured() {
        return sumAssured;
    }

    public boolean isNomineeRegistered() {
        return isNomineeRegistered;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getNextDueDate() {
        return nextDueDate;
    }
}

public class PolicyManager {
    private static ArrayList<Policy> policies = new ArrayList<>();

    // prepopulate the policies list with some sample data
    static {
        policies.add(new Policy("P001", "2022-01-01", "1234567","John Smith", "Life Insurance", "Policy Title 1",
                "Active", 1000.0, 50000.0, true, "Jane Smith", "jane@example.com", "123-456-7890",
                "2023-01-01"));
        policies.add(new Policy("P002", "2022-02-01", "7654321", "Jane Doe", "Health Insurance", "Policy Title 2",
                "Active", 500.0, 10000.0, false, null, "jane.doe@example.com", "987-654-3210",
                "2023-02-01"));
        policies.add(new Policy("P003", "2022-03-01",  "3214567","Bob Johnson", "Auto Insurance", "Policy Title 3",
                "Expired", 200.0, 5000.0, false, null, "bob@example.com", "555-123-4567",
                null));
    }

    public static void main(String[] args) {
        // take in customer ID as command line argument
        if (args.length != 1) {
            System.out.println("Usage: java PolicyManager <customer ID>");
            return;
        }
        String customerId = args[0];

        // find policies for the given customer ID
        ArrayList<Policy> customerPolicies = new ArrayList<>();
        for (Policy policy : policies) {
            if (policy.getCustomerId().equals(customerId)) {
                customerPolicies.add(policy);
            }
        }

        // display policy details
        if (customerPolicies.size() == 0) {
            System.out.println("No policies found for customer ID " + customerId);
        } else {
            System.out.printf("%-10s | %-12s | %-13s | %-15s | %-20s | %-8s | %-8s | %-8s | %-18s | %-30s | %-30s | %-15s | %-12s%n",
                    "Policy No", "Date", "CustomerName", "Policy Type", "Title", "Status", "Premium", "Sum", "NomineeRegistered?", "NomineeName", "Email", "Phone", "NextDueDate");

            for (Policy policy : customerPolicies) {
                System.out.printf("%-10s | %-12s | %-13s | %-15s | %-20s | %-8s | %-8s | %-8s | %-18s | %-30s | %-30s | %-15s | %-12s%n",
                        policy.getPolicyNo(),
                        policy.getDate(),
                        policy.getCustomerName(),
                        policy.getPolicyType(),
                        policy.getTitle(),
                        policy.getStatus(),
                        policy.getPremium(),
                        policy.getSumAssured(),
                        (policy.isNomineeRegistered() ? "Yes" : "No"),
                        (policy.getNomineeName() != null ? policy.getNomineeName() : ""),
                        policy.getEmail(),
                        policy.getPhone(),
                        (policy.getNextDueDate() != null ? policy.getNextDueDate() : ""));
            }

        }
    }
}
