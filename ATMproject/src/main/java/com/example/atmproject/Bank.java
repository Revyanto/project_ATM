package com.example.atmproject;

public class Bank {
    String namaBank;
    String kodeBank;

    public Bank(String namaBank, String kodeBank) {
        this.namaBank = namaBank;
        this.kodeBank = kodeBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public String getKodeBank() {
        return kodeBank;
    }

}
