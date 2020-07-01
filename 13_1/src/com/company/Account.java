package com.company;



public class Account {
    private String IBAN;
    private Person client;
    private double balance;


}
    public String toString(){
        return IBAN+" , "+client+" ,"+balance;
    }
    public String getIBAN(){
        return IBAN;
    }
    public String getClient(){
        return client;
    }
    public double getBalance(){
        return balance;
    }

}
