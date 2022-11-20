package com.example.atmproject;

import javafx.scene.SubScene;

import java.util.Date;

public class Transaksi{
    Date tglTransaksi;
    Nasabah nasabah;

    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    public void cekSaldo() {
        System.out.println("Jumlah saldo Anda :");
        nasabah.getSaldo();
    }

    public void tarikTunai (double tarik){
        double saldoo;
        saldoo = nasabah.getSaldo()-tarik;
        nasabah.setSaldo(saldoo);
    }

    public void transfer(String noRek, double nominal) {

    }
    public void pembayaran() {

    }

    public void gantiPIN(String PIN) {

    }
}
