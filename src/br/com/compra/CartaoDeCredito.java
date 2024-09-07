package br.com.compra;

public class CartaoDeCredito {
    private int limite;
    private int saldo;

    public CartaoDeCredito(int limite, int saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
