package com.dhivakar.learningproject.problem.model;

public class PolicyV2 {
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
    public PolicyV2(String policyNo, String date, String customerId, String customerName, String policyType, String title,
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