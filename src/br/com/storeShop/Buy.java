package br.com.storeShop;

public class Buy implements Comparable<Buy> {
    private String descricao;
    private double valor;

    public Buy(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                "valor = " + valor;
    }

    @Override
    public int compareTo(Buy comopras) {
        return this.descricao.compareTo(comopras.getDescricao());
    }
}
