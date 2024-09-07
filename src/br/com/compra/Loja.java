package br.com.compra;

public class Loja {
    private String nomeProduto;
    private int saldo;

    public Loja(String nomeProduto, int saldo) {
        this.nomeProduto = nomeProduto;
        this.saldo = saldo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
