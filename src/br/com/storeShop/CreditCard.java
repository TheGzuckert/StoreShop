package br.com.storeShop;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private int saldo;
    private int limite;
    private List<Buy> compras;

    public CreditCard(int limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<Buy>();
    }

    public boolean lancaComra(Buy compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= (int) compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getLimite() {
        return limite;
    }

    public List<Buy> getCompras() {
        return compras;
    }


}
