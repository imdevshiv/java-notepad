package com.shiv.abstract_class;

public class Bank {
    public static void main(String[] args) {
        Sbi sbi =new Sbi();
        Hdfc hdfc=new Hdfc();
        Pnb pnb=new Pnb();

        sbi.i();
        hdfc.i();
        pnb.i();
    }
}
