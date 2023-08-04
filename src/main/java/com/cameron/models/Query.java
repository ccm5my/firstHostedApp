package com.cameron.models;

public class Query {
    private String creditScoreBucket;
    private String loanAmountBucket;
    private String loanToValueBucket;
    private String loanType;
    private String program;

    public String getCreditScoreBucket() {
        return creditScoreBucket;
    }

    public void setCreditScoreBucket(String creditScoreBucket) {
        this.creditScoreBucket = creditScoreBucket;
    }

    public String getLoanAmountBucket() {
        return loanAmountBucket;
    }

    public void setLoanAmountBucket(String loanAmountBucket) {
        this.loanAmountBucket = loanAmountBucket;
    }

    public String getLoanToValueBucket() {
        return loanToValueBucket;
    }

    public void setLoanToValueBucket(String loanToValueBucket) {
        this.loanToValueBucket = loanToValueBucket;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}