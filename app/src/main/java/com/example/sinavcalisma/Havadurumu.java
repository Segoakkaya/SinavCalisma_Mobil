package com.example.sinavcalisma;

public class Havadurumu {
    String Txdurumu;
    String TxGun;
    public  Havadurumu (String Txdurumu , String TxGun){
        this.Txdurumu=Txdurumu;
        this.TxGun= TxGun;
    }

    public String getTxdurumu() {
        return Txdurumu;
    }

    public void setTxdurumu(String txdurumu) {
        Txdurumu = txdurumu;
    }

    public String getTxGun() {
        return TxGun;
    }

    public void setTxGun(String txGun) {
        TxGun = txGun;
    }
}
