import br.com.storeShop.Buy;
import br.com.storeShop.CreditCard;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o limite do cartão: ");
        int limite = scanner.nextInt();
        CreditCard cartao = new CreditCard(limite);

        boolean opcao = true;

        while (opcao) {
            System.out.println("""
                    1 - Realizar compra
                    2 - Listar Compras!
                    3 - Encerrar sistema!
                    """);
            int numero = scanner.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("Entre com o produto desejado: :");
                    String produtoDesejado = scanner.next();

                    System.out.println("Entre com o valor do produto: ");
                    double valorProduto = scanner.nextInt();

                    Buy compras = new Buy(produtoDesejado, valorProduto);
                    boolean compraRealizada = cartao.lancaComra(compras);

                    if (compraRealizada) {
                        System.out.println("Compra Realizada com sucesso!\n");
                    } else {
                        System.out.println("Saldo insuficiente!\n");
                    }
                    break;
                case 2:
                    System.out.println("\n***********************");
                    System.out.println("Compras Realizadas:");
                    Collections.sort(cartao.getCompras());

                    for (Buy buys : cartao.getCompras()) {
                        System.out.println("Produto: " + buys.getDescricao() + " Valor: " + buys.getValor());
                    }
                    System.out.println("***********************\n");
                    System.out.println("Saldo atual: " + cartao.getSaldo() + "\n");
                    break;
                default:
                    System.out.println("Progrma Encerrado!!!");
                    opcao = false;
                    break;
            }
        }
    }
}