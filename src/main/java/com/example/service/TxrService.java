package com.example.service;

public interface TxrService {
    void txr(double amount,String fromAccNum,String toAccNum);
    void addAcc(String number,double balance);
}