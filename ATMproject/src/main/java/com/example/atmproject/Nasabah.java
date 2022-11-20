package com.example.atmproject;

public class Nasabah {
private String namaNasabah;
private String noRekening;
private String noPin;
private double saldo;
private String noHp;

    public Nasabah(String namaNasabah, String noRekening, String noPin, int saldo, String noHP) {
        this.namaNasabah = namaNasabah;
        this.noRekening = noRekening;
        this.noPin = noPin;
        this.saldo = saldo;
        this.noHp = noHP;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNoPin() {
        return noPin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNoHp() {
        return noHp;
    }

}
