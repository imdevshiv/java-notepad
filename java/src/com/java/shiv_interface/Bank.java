package com.java.shiv_interface;

public class Bank
{
    public static void main(String[] args)
    {
        System.out.println("Loan provided by banks under Rbi Guidelines");
        Sbi sbi = new Sbi();
        sbi.hashCode();
        Pnb pnb = new Pnb();
        System.out.println("SBI PORTAL");
        sbi.personalLoan();
        sbi.homeLoan();
        sbi.carLoan();
        System.out.println("PNB PORTAL");
        pnb.personalLoan();
        pnb.homeLoan();
        pnb.bikeLoan();
    }
}
