import java.util.ArrayList;
import java.util.Scanner;

public class PolicySelection {
    public static void main(String[] args) {
        // Initialize list of policies
        ArrayList<Policy> policies = new ArrayList<>();
        policies.add(new Policy("General Health", "1234567", "Health Insurance Policy 1", 50000, 5000, 1));
        policies.add(new Policy("General Health", "7654321", "Health Insurance Policy 2", 100000, 10000, 2));
        policies.add(new Policy("Motor Insurance", "9876543", "Car Insurance Policy", 200000, 15000, 3));
        // Add more policies as necessary

        // Display numbered list of policies
        System.out.println("Select a policy:");
        for (int i = 0; i < policies.size(); i++) {
            System.out.printf("%d. %s\n", i+1, policies.get(i).getPolicyTitle());
        }
        System.out.print("Enter Policy Number : ");

        // Get user's policy selection
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        Policy selectedPolicy = policies.get(selection-1);

        // Display policy details
        System.out.println("Policy details:");
        System.out.printf("Policy type: %s\n", selectedPolicy.getPolicyType());
        System.out.printf("Customer ID: %s\n", selectedPolicy.getPolicyId());
        System.out.printf("Policy title: %s\n", selectedPolicy.getPolicyTitle());
        System.out.printf("Sum assured: %d\n", selectedPolicy.getSumAssured());
        System.out.printf("Premium: %d\n", selectedPolicy.getPremium());
        System.out.printf("Term: %d\n", selectedPolicy.getTerm());

        // Display success message
        System.out.println("Policy taken successfully");
    }
}

class Policy {
    private String policyType;
    private String policyId;
    private String policyTitle;
    private int sumAssured;
    private int premium;
    private int term;

    public Policy(String policyType, String policyId, String policyTitle, int sumAssured, int premium, int term) {
        this.policyType = policyType;
        this.policyId = policyId;
        this.policyTitle = policyTitle;
        this.sumAssured = sumAssured;
        this.premium = premium;
        this.term = term;
    }

    public String getPolicyType() {
        return policyType;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyTitle() {
        return policyTitle;
    }

    public int getSumAssured() {
        return sumAssured;
    }

    public int getPremium() {
        return premium;
    }

    public int getTerm() {
        return term;
    }
}
