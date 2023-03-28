package com.dhivakar.learningproject.problem.model;

public class PolicyV1 {
    private String policyType;
    private String policyId;
    private String policyTitle;
    private int sumAssured;
    private int premium;
    private int term;

    public PolicyV1(String policyType, String policyId, String policyTitle, int sumAssured, int premium, int term) {
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