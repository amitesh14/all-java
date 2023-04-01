package com.company;

import java.lang.invoke.StringConcatFactory;

public class Vip_account {
    private String customer_name;
    private String customer_email;
    private int credit_limit;

    public Vip_account(String customer_name, String customer_email, int credit_limit) {
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.credit_limit = credit_limit;
    }

    public Vip_account(String customer_name, String customer_email) {
        this(customer_name,customer_email,999);
    }

    public Vip_account() {
        this("default","default",999);
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public int getCredit_limit() {
        return credit_limit;
    }
}
