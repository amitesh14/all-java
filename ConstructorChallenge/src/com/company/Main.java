package com.company;

public class Main {

    public static void main(String[] args) {
     /*   BankAccount sbi = new BankAccount(88776, 88776, "Amitesh Aman",
                "amiteshashish14@gmail.com", "8969328840");
        sbi.setCustomerName("Amitesh Aman");
        sbi.setAccountNumber(88776);
        sbi.setBalance(100);
        sbi.setPhonenumber("896932840");
        sbi.setEmail("amiteshashish14@gmail.com");


        System.out.println("Customer Name:-"+sbi.getCustomername());
        System.out.println("Account Number:-"+sbi.getAccountNumber());
        System.out.println("Account Balance:-"+sbi.getBalance());
        System.out.println("Customer Email:-"+sbi.getEmail());
        System.out.println("Customer Mobile number:-"+sbi.getPhonenumber());
        sbi.Deposit(20);
        sbi.Withdraw(100);
        sbi.Withdraw(900);
        sbi.Withdraw(20);
        sbi.Deposit(10000);
        sbi.Withdraw(999);*/

        VipCustomer amit= new VipCustomer();
        VipCustomer rohan= new VipCustomer("rohan",777888,"rohan44@gmailcom");
        System.out.println(rohan.getName());
        System.out.println(rohan.getCreditLimit());
        System.out.println(rohan.getEmail());
        VipCustomer sameer=new VipCustomer(7778,"sameer @gmail.com");
        System.out.println(sameer.getName());
        System.out.println(sameer.getCreditLimit());
        System.out.println(sameer.getEmail());

    }

}
