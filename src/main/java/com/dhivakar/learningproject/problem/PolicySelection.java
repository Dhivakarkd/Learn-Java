package com.dhivakar.learningproject.problem;

import com.dhivakar.learningproject.problem.model.PolicyV1;

import java.util.ArrayList;
import java.util.Scanner;

public class PolicySelection {
    public static void main(String[] args) {
        // Initialize list of policies
        ArrayList<PolicyV1> policies = new ArrayList<>();
        policies.add(new PolicyV1("General Health", "1234567", "Health Insurance Policy 1", 50000, 5000, 1));
        policies.add(new PolicyV1("General Health", "7654321", "Health Insurance Policy 2", 100000, 10000, 2));
        policies.add(new PolicyV1("Motor Insurance", "9876543", "Car Insurance Policy", 200000, 15000, 3));
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
        PolicyV1 selectedPolicyV1 = policies.get(selection-1);

        // Display policy details
        System.out.println("Policy details:");
        System.out.printf("Policy type: %s\n", selectedPolicyV1.getPolicyType());
        System.out.printf("Customer ID: %s\n", selectedPolicyV1.getPolicyId());
        System.out.printf("Policy title: %s\n", selectedPolicyV1.getPolicyTitle());
        System.out.printf("Sum assured: %d\n", selectedPolicyV1.getSumAssured());
        System.out.printf("Premium: %d\n", selectedPolicyV1.getPremium());
        System.out.printf("Term: %d\n", selectedPolicyV1.getTerm());

        // Display success message
        System.out.println("Policy taken successfully");
    }
}


