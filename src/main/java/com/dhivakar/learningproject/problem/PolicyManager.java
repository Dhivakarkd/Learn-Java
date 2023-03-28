package com.dhivakar.learningproject.problem;

import com.dhivakar.learningproject.problem.model.PolicyV2;

import java.util.ArrayList;



public class PolicyManager {
    private static ArrayList<PolicyV2> policies = new ArrayList<>();

    // prepopulate the policies list with some sample data
    static {
        policies.add(new PolicyV2("P001", "2022-01-01", "1234567","John Smith", "Life Insurance", "Policy Title 1",
                "Active", 1000.0, 50000.0, true, "Jane Smith", "jane@example.com", "123-456-7890",
                "2023-01-01"));
        policies.add(new PolicyV2("P002", "2022-02-01", "7654321", "Jane Doe", "Health Insurance", "Policy Title 2",
                "Active", 500.0, 10000.0, false, null, "jane.doe@example.com", "987-654-3210",
                "2023-02-01"));
        policies.add(new PolicyV2("P003", "2022-03-01",  "3214567","Bob Johnson", "Auto Insurance", "Policy Title 3",
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
        ArrayList<PolicyV2> customerPolicies = new ArrayList<>();
        for (PolicyV2 policyV2 : policies) {
            if (policyV2.getCustomerId().equals(customerId)) {
                customerPolicies.add(policyV2);
            }
        }

        // display policy details
        if (customerPolicies.size() == 0) {
            System.out.println("No policies found for customer ID " + customerId);
        } else {
            System.out.printf("%-10s | %-12s | %-13s | %-15s | %-20s | %-8s | %-8s | %-8s | %-18s | %-30s | %-30s | %-15s | %-12s%n",
                    "Policy No", "Date", "CustomerName", "Policy Type", "Title", "Status", "Premium", "Sum", "NomineeRegistered?", "NomineeName", "Email", "Phone", "NextDueDate");

            for (PolicyV2 policyV2 : customerPolicies) {
                System.out.printf("%-10s | %-12s | %-13s | %-15s | %-20s | %-8s | %-8s | %-8s | %-18s | %-30s | %-30s | %-15s | %-12s%n",
                        policyV2.getPolicyNo(),
                        policyV2.getDate(),
                        policyV2.getCustomerName(),
                        policyV2.getPolicyType(),
                        policyV2.getTitle(),
                        policyV2.getStatus(),
                        policyV2.getPremium(),
                        policyV2.getSumAssured(),
                        (policyV2.isNomineeRegistered() ? "Yes" : "No"),
                        (policyV2.getNomineeName() != null ? policyV2.getNomineeName() : ""),
                        policyV2.getEmail(),
                        policyV2.getPhone(),
                        (policyV2.getNextDueDate() != null ? policyV2.getNextDueDate() : ""));
            }

        }
    }
}
