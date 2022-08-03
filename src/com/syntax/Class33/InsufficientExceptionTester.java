package com.syntax.Class33;

public class InsufficientExceptionTester {
    public static void main(String[] args)  {
        double balance=100;
        double transferAmount=120;
        if(transferAmount>balance){
            //System.out.println("Insufficient funds");
            throw new InSufficientFunds("Insufficient funds");
        }else {
            System.out.println("Funds Transferred");
        }
    }
}
